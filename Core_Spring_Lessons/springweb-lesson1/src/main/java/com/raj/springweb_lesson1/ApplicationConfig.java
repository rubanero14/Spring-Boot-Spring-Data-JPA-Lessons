package com.raj.springweb_lesson1;

import org.springframework.context.annotation.*;


// Best practice for individually creating instances using config files separately using @Configuration
@Configuration
public class ApplicationConfig {
    	// Spring instance creation called Bean for DI
    	@Bean("myFirstBean")
    	public MyComponent myComponent() {
    		return new MyComponent("Ruban Raj");
    	}
}
