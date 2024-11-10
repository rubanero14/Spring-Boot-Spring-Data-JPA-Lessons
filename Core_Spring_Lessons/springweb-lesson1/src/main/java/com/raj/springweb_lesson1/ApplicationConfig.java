package com.raj.springweb_lesson1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


/*
	Best practice for individually creating instances using config files separately using @Configuration so that Spring
	watches for it for start up
*/
@Configuration
public class ApplicationConfig {
    	// Spring instance creation called Bean for DI
    	@Bean("myFirstBean")
		@Primary
		@Qualifier("BeanOne")
    	public MyComponent myFirstBean() {
    		return new MyComponent("Ruban Raj => First Bean");
    	}

		@Bean("mySecondBean")
		@Qualifier("BeanTwo")
		public MyComponent mySecondBean() {
			return new MyComponent("Ruban Raj => Second Bean");
		}
}
