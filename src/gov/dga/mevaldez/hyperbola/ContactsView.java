package gov.dga.mevaldez.hyperbola;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;

import gov.dga.mevaldez.hyperbola.model.ContactsEntry;
import gov.dga.mevaldez.hyperbola.model.ContactsGroup;
import gov.dga.mevaldez.hyperbola.model.IContactsListener;
import gov.dga.mevaldez.hyperbola.model.Session;

public class ContactsView extends ViewPart {

	public static final String ID = "gov.dga.mevaldez.hyperbola.views.contacts";
	private TreeViewer treeViewer;
	private Session session;
	
	public ContactsView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		initializeSession();
		treeViewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI| SWT.V_SCROLL);
		getSite().setSelectionProvider(treeViewer);
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		treeViewer.setContentProvider(new BaseWorkbenchContentProvider());
		treeViewer.setInput(session.getRoot());
		session.getRoot().addContactsListener(new IContactsListener(){
		    public void contactsChanged(ContactsGroup contacts,	ContactsEntry entry){
			     treeViewer.refresh();
		    }
		});
		 
	   }

	private void initializeSession() {
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
		treeViewer.getControl().setFocus();

	}

}
