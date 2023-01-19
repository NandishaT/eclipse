package com.xworkz.soldier.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO {

	private String name;
	private	int id;
	private String rank;
	private String batallion;
	private String country;
}
