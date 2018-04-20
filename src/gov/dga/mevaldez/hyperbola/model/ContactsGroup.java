package gov.dga.mevaldez.hyperbola.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ListenerList;

public class ContactsGroup extends Contact {
	private List<ContactsEntry> entries = new ArrayList<ContactsEntry>();
	private ContactsGroup parent;
	private String name;
	private ListenerList<IContactsListener> listeners = new ListenerList<IContactsListener>();

	public ContactsGroup(ContactsGroup parent, String name) {
		super();
		this.parent = parent;
		this.name = name;
	}

	public ContactsGroup() {
		// TODO Auto-generated constructor stub
	}

	public List<ContactsEntry> getEntries() {
		return entries;
	}

	public ContactsGroup getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}

	public ListenerList<IContactsListener> getListeners() {
		return listeners;
	}

	public void addContactsListener(IContactsListener iContactsListener) {
		listeners.add(iContactsListener);
	}

	public void removeContactsListener(IContactsListener iContactsListener) {
		listeners.remove(iContactsListener);
		fireContactsChanged();
	}

	protected void fireContactsChanged() {
		
	}

	public void removeEntry(ContactsEntry entry) {
		entries.remove(entry);
		fireContactsChanged();
	}

	public void addEntry(ContactsEntry entry) {
		entries.add(entry);
		fireContactsChanged();
	}

	public void rename(String name) {
		this.name = name;
		fireContactsChanged();
	}

	public void addEntry(ContactsGroup friendsGroup) {
		// TODO Auto-generated method stub
		
	}

}
