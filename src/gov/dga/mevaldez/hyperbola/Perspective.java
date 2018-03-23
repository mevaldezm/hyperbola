package gov.dga.mevaldez.hyperbola;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		layout.setEditorAreaVisible(true);
		//layout.addView(ContactsView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
		layout.addStandaloneView(ContactsView.ID, false, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}

}
