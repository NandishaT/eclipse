package com.xworkz.Mvc.component;

import org.springframework.stereotype.Component;

@Component

public class SpringComponent {

	public SpringComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
