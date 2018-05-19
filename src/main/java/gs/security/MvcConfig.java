package gs.security;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class MvcConfig {
	  public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/index").setViewName("index");
	        registry.addViewController("/").setViewName("index");
	        registry.addViewController("/home").setViewName("home");
	        registry.addViewController("/login").setViewName("login");
	    }
}
