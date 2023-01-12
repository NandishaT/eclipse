package com.xwork.bean.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.bean.Configuration.TaskConfig;
import com.xwork.bean.thing.Actor;
import com.xwork.bean.thing.Rocket;
import com.xwork.bean.thing.Season;

public class runner {

	public static void main(String[] args) {

		ApplicationContext ref = new AnnotationConfigApplicationContext(TaskConfig.class);

		Season refseason = ref.getBean("season", Season.class);
		System.out.println(refseason.getName());
		System.out.println(refseason.getDuration());
		System.out.println(refseason.getStartingMonth());

		Season refOfSeason1 = ref.getBean("cold", Season.class);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());

		Rocket refOfRocket = ref.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket.toString());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getname());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket1 = ref.getBean("jacket", Rocket.class);
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getname());
		System.out.println(refOfRocket1.getBudget());

		Actor refOfActor = ref.getBean("actor", Actor.class);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.language());
		System.out.println(refOfActor.getAge());

		Actor refOfActor2 = ref.getBean("hero", Actor.class);
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.language());
		System.out.println(refOfActor2.getAge());

	}
}
