package com.xworkz.resort.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AbstractAuditDTO {

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
}
