
package edu.sinclair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkedInUser extends UserAccount implements Comparable<LinkedInUser>, Serializable{
	private static final long serialVersionUID = 1L;
	
	private String type;
	private List<LinkedInUser> connections = new ArrayList<>();
	
	java.util.Date lastLoginDate;
	int loginCounter;
	
	public LinkedInUser() {

	}
	
	public LinkedInUser(String username, String password) {
		super(username, password);
	}
	
	public String getType() { 
		return type;
	}

	public void setType(String P) {
		this.type = P;
	}

	public void incrementLoginCounter() {
		loginCounter++;
		lastLoginDate = new Date();
	}

	public int getLoginCounter() { 
		return loginCounter;
	}

	public Date getLastLoginDate() { 
		return lastLoginDate;
	}

	public void addConnection(LinkedInUser user) throws LinkedInException {

		int index = getConnections().indexOf(user);
		if (index >= 0) {
			throw new LinkedInException("You are already connected with this user");
		} else {
			connections.add(user);
		}

	}

	public void removeConnection(LinkedInUser user) throws LinkedInException {

		int index = connections.indexOf(user);
		if (index < 0) {
			throw new LinkedInException("You are NOT connected with this user");
		} else {
			connections.remove(user);
		}
	}

	public List<LinkedInUser> getConnections() {
		List<LinkedInUser> user1 = new ArrayList<>(connections);
		return user1;

	}

	@Override
	public int compareTo(LinkedInUser o) {
		int rc = this.getUsername().compareToIgnoreCase(o.getUsername());
		return rc;
	}
}
