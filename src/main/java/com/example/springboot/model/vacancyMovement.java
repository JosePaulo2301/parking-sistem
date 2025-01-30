package com.example.springboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class vacancyMovement{
	private LocalDateTime occupationDate;
	private LocalDateTime occupationStartDdate;
	private LocalDateTime occupationEndDate;
}




