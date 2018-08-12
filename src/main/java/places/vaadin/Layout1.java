package places.vaadin;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Link;
import com.vaadin.ui.RadioButtonGroup;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Layout1 extends CssLayout {
	protected ComboBox title;
	protected TextField firstName;
	protected TextField lastName;
	protected TextField otherNames;
	protected HorizontalLayout dateOfBirthWrapper;
	protected TextField month;
	protected TextField day;
	protected TextField year;
	protected ComboBox language;
	protected Button add;
	protected TextField jobTitle;
	protected TextField employer;
	protected DateField employedSince;
	protected CssLayout phoneNumberWrapper;
	protected TextField countryCode;
	protected TextField phoneNumber;
	protected TextField email;
	protected TextArea feedback;
	protected RadioButtonGroup query;
	protected CheckBox checkAgree;
	protected Link linkTerms;
	protected Button submit;
	protected Button cancel;

	public Layout1() {
		Design.read(this);
	}
}
