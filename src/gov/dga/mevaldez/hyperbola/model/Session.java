package gov.dga.mevaldez.hyperbola.model;

public class Session {
	
  public ContactsGroup getRoot() {
		return rootGroup;
	}
	public void setRoot(ContactsGroup rootGroup) {
		this.rootGroup = rootGroup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getDescription() {
		return this.toString();
	}
private ContactsGroup rootGroup;
  private String name;
  private String server;
  public Session() {}
  
}
