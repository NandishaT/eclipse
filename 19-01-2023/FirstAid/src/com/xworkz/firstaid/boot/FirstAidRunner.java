package com.xworkz.firstaid.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstaid.DTO.FirstAidDTO;
import com.xworkz.firstaid.configuration.FirstAidConfiguration;
import com.xworkz.firstaid.service.FirstAidService;


public class FirstAidRunner{
public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(FirstAidConfiguration.class);
	FirstAidService service=container.getBean(FirstAidService.class);
	boolean ref = service.validateAndSave(new FirstAidDTO());
	System.out.println(ref);
}
}