package com.xworkz.nandish.dto;

import lombok.Data;

@Data
public class FamilyDTO {

	private String fatherName;
	private long fphoneNumber;
	private String motherName;
	private long mphoneNumber;
	private boolean married;
	private String paramnentAddress;
	private String currentAddress;
	private int noOfPeople;
	private int pinCode;
}
