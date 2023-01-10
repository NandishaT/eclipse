package com.xworkz.Bean;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.TreeConfig;

public class SpringRunner {
	public static void main(String[] args) {
		
		ApplicationContext ref = new AnnotationConfigApplicationContext(TreeConfig.class);
		
		String[] beanName=ref.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beanName));
		
		Map ref1=ref.getBean("pair",Map.class);
		
		Collection<Integer> ref2=ref.getBean("collect",Collection.class);
		
	System.out.println(ref2);
	}

}
