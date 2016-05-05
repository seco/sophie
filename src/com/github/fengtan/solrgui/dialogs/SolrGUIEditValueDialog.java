package com.github.fengtan.solrgui.dialogs;

import org.apache.solr.common.SolrDocument;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SolrGUIEditValueDialog extends Dialog {

	private Text newValue;
	private String originalValue;
	private String fieldName;
	private SolrDocument document;
	
	public SolrGUIEditValueDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new GridLayout(2, false));
		
		// TODO support multiple-value fields.
		new Label(composite, SWT.NULL).setText("New value");
		newValue = new Text(composite, SWT.BORDER);
		newValue.setText(originalValue);
	    
	    return composite;
	}
	
	// Set title of the custom dialog.
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Edit value");
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		// button "OK' has ID "0".
		if (buttonId == 0) {
			document.setField(fieldName, newValue.getText());
		}
		super.buttonPressed(buttonId);
	}
	
	public int open(String originalValue, String fieldName, SolrDocument document) {
		this.originalValue = originalValue;
		this.fieldName = fieldName;
		this.document = document;
		return super.open();
	}
	
}
