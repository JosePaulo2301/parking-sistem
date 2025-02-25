package com.example.springboot.service.dto;


import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
	
		@JsonIgnoreProperties
        private Long id;
        private String ticket;
        private @NotBlank String plate;
        private @NotBlank String color;
        private @NotBlank String manufacturer;
        private @NotBlank String category;
        @CreatedDate
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        private LocalDateTime dataCriacao = LocalDateTime.now();
          
        
  }