package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TerroristDTO extends AbstractAuditDTO{
	
	@NonNull
	@NotNull(message="Terrorist name cannot be null")
	@Size(min=3,max=20,message="Name is invalid, sholud be more than 3")
	private String name;//not empty,not null,size:3,max 20
	
	@NonNull
	@Min(value=1,message="Age shouldbe greater than 1 or less than 150")
	@Max(value=150,message="Age shouldbe greater than 1 or less than 150")
	private int age;
	
	@NotNull(message="gender cannot be null")
	@Size(max=10,min=3,message="Gender should be between 3 to 20")
	private String gender;
	
	@NotNull(message="Alive cannot be null")
	private boolean alive;
	
	@NotNull(message="prisoned cannot be null")
	private boolean prison;
	
	@NotNull(message="specialization cannot be null")
	@NotEmpty(message="specialization cannot be empty")
	@Size(max=20,min=3,message="Specialization should be between 3 to 20")
	private String specialzation;
	
	@NotNull(message="organization cannot be null")
	@NotEmpty(message="organization cannot be empty")
	@Size(max=20,min=3,message="organization should be between 3 to 20")
	private String organization;
	

}
