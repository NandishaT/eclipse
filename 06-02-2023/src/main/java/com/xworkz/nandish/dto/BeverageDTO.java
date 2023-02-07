package com.xworkz.nandish.dto;

import lombok.Data;

@Data
public class BeverageDTO {

	private String brand;
	private double price;
	private int quantity;
	private boolean alcohol;
	private boolean testesGood;
	private boolean goodForHealth;
	private boolean madeOfFruit;
	private String color;

}
