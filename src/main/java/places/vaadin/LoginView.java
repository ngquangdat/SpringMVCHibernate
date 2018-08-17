package places.vaadin;


import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.ComponentScan;

import com.vaadin.annotations.Theme;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinServletConfiguration;





@SuppressWarnings("serial")
@Theme("placestheme")
@Route("/login")

public class LoginView extends UI {
	
	public LoginView() {
		final TextField username = new TextField("Tên đăng nhập");
	    
	    final PasswordField password = new PasswordField("Mật khẩu");
	    
	    Button button = new Button("Đăng nhập");
	    
	    add(username, password, button);
	    
	}
	
	
	
	@WebServlet(urlPatterns = "/login/*", name = "loginServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = LoginView.class, productionMode = false)
    public static class LoginUIServlet extends VaadinServlet {
    }
}



