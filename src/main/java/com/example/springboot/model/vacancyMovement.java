package com.example.springboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class VacancyMovement{
	private LocalDateTime occupationDate;
	private LocalDateTime occupationStartDdate;
	private LocalDateTime occupationEndDate;
}




