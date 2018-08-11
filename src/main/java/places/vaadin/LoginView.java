package places.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("placestheme")
public class LoginView extends UI{
	@Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField username = new TextField();
        username.setCaption("Tên đăng nhập:");
        
        final PasswordField password = new PasswordField();
        password.setCaption("Mật khẩu:");
        

        Button button = new Button("Đăng nhập");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + username.getValue() 
                    + ", it works!"));
        });
       
        layout.addComponents(username, password, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/login/*", name = "LoginUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = LoginView.class, productionMode = false)
    public static class LoginUIServlet extends VaadinServlet {
    }
}
