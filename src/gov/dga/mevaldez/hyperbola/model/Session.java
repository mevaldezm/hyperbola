package gov.dga.mevaldez.hyperbola.model;

public class Session {
	
	
    public ContactsGroup getRoot() {
		return rootGroup;
	}
	
	public String getName() {
		return name;
	}
	
	public String getServer() {
		return server;
	}
	
	public String getDescription() {
		return this.toString();
	}
	
    private ContactsGroup rootGroup;
    private String name;
    private String server;
    public Session() {
    	rootGroup = new ContactsGroup();
    }
  
}
