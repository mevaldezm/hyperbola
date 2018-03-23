package gov.dga.mevaldez.hyperbola.model;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.swt.widgets.List;


public class ContactsGroup extends Contact {
	private List entries;
	private ContactsGroup parent;
	private String name;
	private ListenerList<Contact> listeners;
	
	public ContactsGroup() {
		listeners = new ListenerList<Contact>();
		
	}
	public List getEntries() {
		return entries;
	}
	public void setEntries(List entries) {
		this.entries = entries;
	}
	public ContactsGroup getParent() {
		return parent;
	}
	public void setParent(ContactsGroup parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ListenerList<Contact> getListeners() {
		return listeners;
	}
	public void setListeners(ListenerList<Contact> listeners) {
		this.listeners = listeners;
	}
	public void addContactsListener(Contact contact) {
		listeners.add(contact);
	}
	public void removeContactsListener(Contact contact) {
		listeners.remove(contact);
	}
	public void fireContactsChanged() {}
	public void removeEntry() {}
	public void addEntry() {}
	public void rename() {}
	

}
