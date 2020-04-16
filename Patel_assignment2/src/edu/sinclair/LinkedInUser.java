/* Richa Patel
*  Assignment 02 
*  
*/
package edu.sinclair;

import java.util.ArrayList;
import java.util.List;

public class LinkedInUser extends UserAccount implements Comparable<LinkedInUser> {

	private String type;
	private List<LinkedInUser> connections = new ArrayList<>();

	public String getType() {
		return type;

	}

	public void setType(String type) {
		this.type = type;

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
