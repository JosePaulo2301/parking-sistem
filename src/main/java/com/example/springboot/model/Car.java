package com.example.springboot.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String plate;
	private String color;
	private String ticket;
	@ManyToOne
	private CarModel carModel;
	@CreatedDate
	private LocalDateTime dataCriacao =  LocalDateTime.now();

}
