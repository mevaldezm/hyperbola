package gov.dga.mevaldez.hyperbola.model;

public class ContactsEntry extends Contact{
	
	public ContactsEntry() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Presence getPresence() {
		return presence;
	}

	public void setPresence(Presence presence) {
		this.presence = presence;
	}

	public ContactsGroup getGroup() {
		return group;
	}

	public void setGroup(ContactsGroup group) {
		this.group = group;
	}

	private String name;
	private String nickname;
	private String server;
	private Presence presence;
	private ContactsGroup group;
	
	public Object getParent() {
		return this.getParent();
	}
}
