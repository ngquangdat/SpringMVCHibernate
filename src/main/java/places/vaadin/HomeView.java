package places.vaadin;

import javax.servlet.annotation.WebServlet;

import com.github.appreciated.app.layout.AppLayout;
import com.github.appreciated.app.layout.behaviour.AppLayoutComponent;
import com.github.appreciated.app.layout.behaviour.Behaviour;
import com.github.appreciated.app.layout.builder.design.AppLayoutDesign;
import com.github.appreciated.app.layout.builder.elements.builders.SubmenuBuilder;
import com.github.appreciated.app.layout.builder.entities.DefaultBadgeHolder;
import com.github.appreciated.app.layout.builder.entities.DefaultNotificationHolder;
import com.github.appreciated.app.layout.component.MenuHeader;
import com.github.appreciated.app.layout.component.button.AppBarNotificationButton;
import com.github.appreciated.app.layout.interceptor.DefaultViewNameInterceptor;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("placestheme")
public class HomeView extends UI{
	@Override
    protected void init(VaadinRequest vaadinRequest) {
		View1 view = new View1();
		view.addComponent(new Button("Hihi"));
		view.addComponent(new Layout());
		
		
		DefaultNotificationHolder notifications = new DefaultNotificationHolder();
	    DefaultBadgeHolder badge = new DefaultBadgeHolder();
	    

	    AppLayoutComponent layout = AppLayout.getDefaultBuilder(Behaviour.LEFT_RESPONSIVE)
	            .withTitle("Places")
	            .addToAppBar(new AppBarNotificationButton(notifications, true))
	            .withViewNameInterceptor(new DefaultViewNameInterceptor())
	            .withDefaultNavigationView(View1.class)
	            .withDesign(AppLayoutDesign.MATERIAL)
	            .add(new MenuHeader("Version 0.9.22", new ThemeResource("logo.png")))
	            .add("Home", VaadinIcons.HOME, badge, view)
	            .add(SubmenuBuilder.get("My Submenu", VaadinIcons.PLUS)
	                    .add("Charts", "test", VaadinIcons.SPLINE_CHART, View1.class)
	                    .add("Contact", VaadinIcons.CONNECT, View1.class)
	                    .add("More", VaadinIcons.COG, View1.class)
	                    .build())
	            .add("Menu", VaadinIcons.MENU, View1.class)
	            .add("Elements", VaadinIcons.LIST, View1.class)
	            .build();
	    
	    
	    setContent(layout);
	}
	@WebServlet(urlPatterns = "/home/*", name = "HomeUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = HomeView.class, productionMode = false)
    public static class HomeUIServlet extends VaadinServlet {
    }
}
