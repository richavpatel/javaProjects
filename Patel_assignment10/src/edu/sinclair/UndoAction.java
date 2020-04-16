package edu.sinclair;

public class UndoAction {
	private LinkedInUser linkedInUser;
	private int option;
	private String description;
	
	public UndoAction() {}
	
	public UndoAction(LinkedInUser linkedInUser, int option, String description) {
		super();
		this.linkedInUser = linkedInUser;
		this.option = option;
		this.description = description;
	}
	
	public LinkedInUser getLinkedInUser() {
		return linkedInUser;
	}
	public void setLinkedInUser(LinkedInUser linkedInUser) {
		this.linkedInUser = linkedInUser;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
