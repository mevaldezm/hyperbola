package gov.dga.mevaldez.hyperbola.model;

public class ContactsEntry extends Contact{
	
	public ContactsEntry(ContactsGroup group, String name, String nickName, String server) {
		super();
		this.group = group;
		this.name = name;
		this.nickname = nickName;
		this.server = server;
		
	}
	@Override
	public String getName() {
		return name;
	}

	
	public String getNickname() {
		return nickname;
	}

	public String getServer() {
		return server;
	}

	
	public Presence getPresence() {
		return presence;
	}

	private String name;
	private String nickname;
	private String server;
	private ContactsGroup group;
	private Presence presence;
	
	public void setPresence(Presence presence) {
		this.presence = presence;
	}

	
	
	public ContactsGroup getParent() {
		return group;
	}
}
