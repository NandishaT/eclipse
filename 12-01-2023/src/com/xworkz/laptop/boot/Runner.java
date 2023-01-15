package com.xworkz.laptop.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.laptop.Configuration.GhostConfiguration;
import com.xworkz.laptop.thing.Engine;
import com.xworkz.laptop.thing.Ghost;
import com.xworkz.laptop.thing.NewsPaper;
import com.xworkz.laptop.thing.Snake;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext ref = new AnnotationConfigApplicationContext(GhostConfiguration.class);

		System.out.println("\n------------Engine----------\n");
		Engine refOfEngine = ref.getBean(Engine.class);
		System.out.println("Engine Name: " + refOfEngine.getName());
		System.out.println("Engine Type: " + refOfEngine.getType());
		System.out.println("Engine Number: " + refOfEngine.getNum());
		System.out.println("Engine Version: " + refOfEngine.getVersion());
		System.out.println("Engine Company: " + refOfEngine.getCompany());
		System.out.println("Engine Stroke: " + refOfEngine.getStroke());

		System.out.println("\n------------Snake----------\n");
		Snake refOfSnake = ref.getBean(Snake.class);
		System.out.println("SnakeName: " + refOfSnake.getName());
		System.out.println("SnakeType: " + refOfSnake.getType());
		System.out.println("SnakeColor: " + refOfSnake.getColor());
		System.out.println("SnakeLength: " + refOfSnake.getLength());

		System.out.println("\n------------NewsPaper----------\n");
		NewsPaper refOfNewsPaper = ref.getBean(NewsPaper.class);
		System.out.println("NewsPaperId: " + refOfNewsPaper.getId());
		System.out.println("NewsPaperName: " + refOfNewsPaper.getName());
		System.out.println("NewsPaperOwnweName: " + refOfNewsPaper.getOwnerName());
		System.out.println("NewsPaperLanguage: " + refOfNewsPaper.getLanguage());
		System.out.println("NewsPaperPrice: " + refOfNewsPaper.getPrice());

		Ghost refOfGhost = ref.getBean(Ghost.class);
		System.out.println("Ghost Name: " + refOfGhost.getName());
		System.out.println("Ghost Color: " + refOfGhost.getColor());
		System.out.println("Ghost Dress: " + refOfGhost.getDress());
		System.out.println("Ghost Education: " + refOfGhost.getEducation());
		System.out.println("Ghost NoOfHands: " + refOfGhost.getNoOfHands());
		System.out.println("Ghost NoOfLegs: " + refOfGhost.getNoOfLegs());
		System.out.println("Ghost PhNo: " + refOfGhost.getPhNo());
		System.out.println("Ghost Weight: " + refOfGhost.getWeight());
		System.out.println("Ghost Age: " + refOfGhost.getAge());
		System.out.println("Ghost DoB: " + refOfGhost.getDoB());
		System.out.println("Ghost DoD: " + refOfGhost.getDoD());
		System.out.println("Ghost Gender: " + refOfGhost.getGender());
	}

}
