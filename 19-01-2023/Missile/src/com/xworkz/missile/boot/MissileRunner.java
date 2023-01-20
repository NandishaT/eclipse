package com.xworkz.missile.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.missile.configuration.SpringConfiguration;
import com.xworkz.missile.dto.MissileDTO;
import com.xworkz.missile.service.MissileServiceImpl;

public class MissileRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileServiceImpl service= container.getBean(MissileServiceImpl.class);
		service.validateAndSave(new MissileDTO());
	}
}
 