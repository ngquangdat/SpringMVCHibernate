package places.vaadin;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.server.VaadinServletConfiguration;





@SuppressWarnings("serial")
@Theme("placestheme")
public class LoginView extends VerticalLayout{
	
	public LoginView() {
		final TextField username = new TextField("Tên đăng nhập");
	    
	    final PasswordField password = new PasswordField("Mật khẩu");
	    
	    Button button = new Button("Đăng nhập");
	    
	    add(username, password, button);
	    
	}
	
	
	public class LoginUI extends UI{
		protected void init(VaadinRequest vaadinRequest) {
			LoginView loginView = new LoginView();
			add(loginView);
		}
		
	}
	
	@WebServlet(urlPatterns = "/login/*", name = "LoginUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = LoginUI.class, productionMode = false)
    public static class LoginUIServlet extends VaadinServlet {
    }
	
	
}



