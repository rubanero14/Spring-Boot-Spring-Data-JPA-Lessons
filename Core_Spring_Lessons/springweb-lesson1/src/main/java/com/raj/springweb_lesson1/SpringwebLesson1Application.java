package com.raj.springweb_lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringwebLesson1Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringwebLesson1Application.class, args);

		MyComponent myComponent = ctx.getBean(MyComponent.class);
		myComponent.print("System online...");
		myComponent.print(myComponent.greet("Ruban Raj"));
	}


}
