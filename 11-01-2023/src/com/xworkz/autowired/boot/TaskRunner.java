package com.xworkz.autowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.Configuration.TaskConfiguration;
import com.xworkz.autowired.thing.HardwareShop;
import com.xworkz.autowired.thing.Pencil;
import com.xworkz.autowired.thing.Rubber;
import com.xworkz.autowired.thing.Software;
import com.xworkz.autowired.thing.SoftwareEngineer;

public class TaskRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(TaskConfiguration.class);
		System.out.println("----------------HARDWARE SHOP---------------------");

		HardwareShop refOfHardwareShop = container.getBean(HardwareShop.class);
		System.out.println(refOfHardwareShop.getId());
		System.out.println(refOfHardwareShop.getName());
		System.out.println(refOfHardwareShop.getOwnerName());
		System.out.println(refOfHardwareShop.getAddress());
		System.out.println(refOfHardwareShop.getGstNo());

		System.out.println("----------------SOFTWARE---------------------");

		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware);
		System.out.println(refOfSoftware.getName());
		System.out.println(refOfSoftware.getVersion());
		System.out.println(refOfSoftware.getDeveloper());
		System.out.println(refOfSoftware.getDate());

		System.out.println("----------------SOFTWARE ENGINEER---------------------");

		SoftwareEngineer refOfSoftwareEngineer = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfSoftwareEngineer.getName());
		System.out.println(refOfSoftwareEngineer.getCompanyName());
		System.out.println(refOfSoftwareEngineer.getExperience());
		System.out.println(refOfSoftwareEngineer.getSalary());

		System.out.println("----------------PENCIL---------------------");

		Pencil refOfPencil = container.getBean(Pencil.class);

		System.out.println(refOfPencil.getName());
		System.out.println(refOfPencil.getColor());
		System.out.println(refOfPencil.getPrice());
		System.out.println(refOfPencil.getType());

		System.out.println("----------------RUBBER---------------------");

		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber.getName());
		System.out.println(refOfRubber.getColor());
		System.out.println(refOfRubber.getPrice());
		System.out.println(refOfRubber.getShape());
		System.out.println(refOfRubber.getSize());
		System.out.println(refOfRubber.getType());

	}
}
