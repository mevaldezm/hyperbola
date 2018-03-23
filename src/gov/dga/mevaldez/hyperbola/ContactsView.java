package gov.dga.mevaldez.hyperbola;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;

import gov.dga.mevaldez.hyperbola.model.ContactsEntry;
import gov.dga.mevaldez.hyperbola.model.ContactsGroup;
import gov.dga.mevaldez.hyperbola.model.Session;

public class ContactsView extends ViewPart {

	public static final String ID = "gov.dga.mevaldez.hyperbola.views.contacts";
	private TreeViewer treeviewer;
	private Session session;
	
	public ContactsView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		initializeSession();
		treeviewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI| SWT.V_SCROLL);
		getSite().setSelectionProvider(treeviewer);
		treeviewer.setLabelProvider(new WorkbenchLabelProvider());
		treeviewer.setContentProvider(new BaseWorkbenchContentProvider());
		treeviewer.setInput(session.getRoot());
		session.getRoot().addContactsListener(new IContactsListener());
		public void ContactsChanged(ContactsGroup contacts,
				ContactsEntry entry)) {
			treeviewer.refresh();
		}

	}

	private void initializeSession() {
		// TODO Auto-generated method stub
		session = new Session();
		ContactsGroup root = session.getRoot();
		ContactsGroup friendsGroup = new ContactsGroup(root, "friends");
		root.addEntry(friendsGroup);
		friendsGroup.addEntry(new ContactsEntry(friendsGroup, 
				"Alize", "aliz", "localhost"));
		ContactsGroup otherGroup = new ContactsGroup(root, "other");
		otherGroup.addEntry(new ContactsEntry(otherGroup, "Nadine", "nad", "localhost"));
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		treeviewer.getControl().setFocus();

	}

}
