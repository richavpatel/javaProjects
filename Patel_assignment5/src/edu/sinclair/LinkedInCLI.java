
package edu.sinclair;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedInCLI {

	private static final String PATH = System.getProperty("user.home") + File.separator + "sinclair" + File.separator;
	private static final String FILE_NAME = "LinkedInUsers.dat";

	private List<LinkedInUser> users;
	private LinkedInUser loggedInUser;

	public LinkedInCLI() {
		users = new ArrayList<>();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LinkedInCLI ex = new LinkedInCLI();

		try {
			ex.deserialize();
		} catch (Exception e) {
		}

		ex.establishUser(input);

		while (true) {
			int option = ex.displayMenu(input);

			if (option == 2) {
				ex.signUpANewUser(input);

			} else if (option == 1) { // list
				ex.listAllUsers();
			} else if (option == 3) { // delete
				ex.deleteUser(input);
				ex.establishUser(input);
			} else if (option == 4) { // who am i
				ex.whoAmI();
			} else if (option == 5) { // list connections
				ex.listConnections();
			} else if (option == 6) { // add connections
				ex.addConnection(input);
			} else if (option == 7) { // remove connections
				ex.removeConnection(input);
			} else if (option == 8) { // degree of sepration
				ex.degreeSeparation(input);
			}

			else if (option == 9) {
				ex.signOff();
				ex.establishUser(input);
			} else if (option == 10) { // quit
				ex.quit();
				System.exit(0);
				input.close();
			}
		} // end while-loop
	} // end main

	public void establishUser(Scanner input) {
		if (users == null || users.isEmpty()) {
			System.out.println("There are no users in system. Please establish a root user and password");

			System.out.println("\nuser name");
			String rootUser = input.next();

			System.out.println("\npassword");
			String rootPwd = input.next();

			LinkedInUser root = new LinkedInUser();
			root.setUsername(rootUser);
			root.setPassword(rootPwd);
			root.setType("P");
			root.incrementLoginCounter();
			users.add(root);
			loggedInUser = root;
			try {
				serialize();
			} catch (IOException e) {

			}
		} else {
			LinkedInUser user = displayUsernameLogin(input);
			while (user == null) {
				user = displayUsernameLogin(input);
			}
			user.incrementLoginCounter();
			loggedInUser = user;
		}
	}

	public void signOff() {
		loggedInUser = null;
	}

	public LinkedInUser displayUsernameLogin(Scanner input) {
		System.out.println("Please login to continue");
		System.out.println("User name");
		String username = input.next();
		LinkedInUser user = new LinkedInUser();
		user.setUsername(username);
		int index = findIndexOfUser(user);
		if (index < 0) {
			System.out.println("There is no user with that user name");
			return null;
		}
		LinkedInUser exists = users.get(index);
		System.out.println("Please supply users password");
		String pwd = input.next();
		if (!pwd.equals(exists.getPassword())) {
			System.out.println("Password mismatch");
			return null;
		}
		return exists;
	}

	public int displayMenu(Scanner input) {
		System.out.println("\nWelcome " + loggedInUser.getUsername());
		System.out.println("1. List all Users,");
		System.out.println("2. Sign up a New User,");
		System.out.println("3. Delete a User,");
		System.out.println("4. Who am I");
		System.out.println("5. List Connections");
		System.out.println("6. Add Connection");
		System.out.println("7. Remove Connection");
		System.out.println("8. Degree of Separation");
		System.out.println("9. Sign Off");
		System.out.println("10. Quit");
		int option = input.nextInt();
		return option;
	}

	public void serialize() throws IOException {
		FileOutputStream file = new FileOutputStream(PATH + FILE_NAME);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(users);
		out.close();
		file.close();
	}

	public void deserialize() throws IOException, ClassNotFoundException {
		List<LinkedInUser> deserializedUsers;
		// Reading the object from a file
		FileInputStream file = new FileInputStream(PATH + FILE_NAME);
		ObjectInputStream in = new ObjectInputStream(file);
		deserializedUsers = (List<LinkedInUser>) in.readObject();
		in.close();
		file.close();
		users = deserializedUsers;
	}

	public void deleteUser(Scanner input) {
		System.out.println("Enter a username");
		String username = input.next();

		LinkedInUser user = new LinkedInUser();
		user.setUsername(username);
		int index = findIndexOfUser(user);

		if (index >= 0) {
			LinkedInUser userToDelete = users.get(index);
			System.out.println("Enter a password");
			String password = input.next();
			if (password.equals(userToDelete.getPassword())) {
				users.remove(userToDelete);
				try {
					serialize();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Password doesn't match");
			}
		}
	}

	private void listAllUsers() {
		for (LinkedInUser user : users) {
			System.out.println(user.getUsername());
		}
	}

	private void listConnections() {
		for (LinkedInUser user1 : loggedInUser.getConnections()) {
			System.out.println(user1.getUsername());
		}
		if (loggedInUser.getConnections() == null || loggedInUser.getConnections().isEmpty()) {
			System.out.println("You have no connections");
		}

	}

	private void addConnection(Scanner input) {
		System.out.println("\nEnter a username");
		String username = input.next();
		LinkedInUser user = new LinkedInUser();
		user.setUsername(username);
		int index = findIndexOfUser(user);

		if (index < 0) {
			// doesn't exists
			System.out.println("There is no user with that user name");
			return;
		} else {
			try {
				LinkedInUser exists = users.get(index);
				loggedInUser.addConnection(exists);
				System.out.println("The connection was added successfully");
			} catch (LinkedInException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void removeConnection(Scanner input) {
		System.out.println("\nEnter a username");
		String username = input.next();

		LinkedInUser user = new LinkedInUser();
		user.setUsername(username);
		int index = findIndexOfUser(user);

		if (index < 0) {
			System.out.println("There is no user with that user name");
			return;
		} else {
			try {
				LinkedInUser exists = users.get(index);
				loggedInUser.removeConnection(exists);
			} catch (LinkedInException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("The connection was remove successfully");
		}
	}

	private void degreeSeparation(Scanner input) {
		System.out.println("\nEnter the user name to show the path to");
		String username = input.next();
		LinkedInUser user = new LinkedInUser();
		user.setUsername(username);
		int index = findIndexOfUser(user);
		if (index < 0) {
			System.out.println("User does not exists.");
		}
		LinkedInUser foundUser = users.get(index);

		int degree = findUsersConnections(loggedInUser, foundUser);
		System.out.println("There is " + degree + " degree of separatation between you and zane");
	}

	private int findUsersConnections(LinkedInUser user1, LinkedInUser user2) {
		if (user1.getConnections().indexOf(user2) >= 0) {
			System.out.println(user1.getUsername() + "->" + user2.getUsername());
			return 0;
		}
		LinkedInUser user = user1.getConnections().get(0);
		System.out.print(user1.getUsername() + "->");
		return 1 + findUsersConnections(user, user2);
	}

	private void signUpANewUser(Scanner input) {
		System.out.println("\nEnter a username");
		String username = input.next();
		LinkedInUser newUser = new LinkedInUser();
		newUser.setUsername(username);
		int index = findIndexOfUser(newUser);

		if (index >= 0) {
			// exists
			System.out.println("Username already exists");
			return;
		}

		System.out.println("\nEnter a password");
		String password = input.next();

		System.out.println("\nEnter the type of user (P or S)");
		String type = input.next();

		if (type.equals("P") || type.equals("S")) {
			newUser.setUsername(username);
			newUser.setPassword(password);
			newUser.setType(type);
			users.add(newUser);
			try {
				serialize();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Invalid user type. Valid types are P or S");
		}
	}

	private void whoAmI() {
		System.out.println("\nUser name: " + loggedInUser.getUsername());
		System.out.println("Type: " + loggedInUser.getType());

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String lastLoggedInDate = formatter.format(loggedInUser.getLastLoginDate());
		System.out.println("Last Logged In: " + lastLoggedInDate);

		System.out.println("Login count: " + loggedInUser.getLoginCounter());
	}

	private void quit() {
		File file = new File(PATH);
		if (!file.exists()) {
			new File(PATH).mkdirs();
		}
		File datFile = new File(PATH + FILE_NAME);
		if (datFile.exists()) {
			datFile.delete();
		}
		try {
			serialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Goodbye");
	}

	private int findIndexOfUser(LinkedInUser user) {

		int idx = users.indexOf(user);
		return idx;
	}

}
