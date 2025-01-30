package com.example.springboot.service.dto;


import java.time.LocalDateTime;

import com.example.springboot.service.TicketService;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRequestDTO {

        @JsonIgnoreProperties
        private Long id;
        private TicketService ticketService;
        private @NotBlank String plate;
        private @NotBlank String color;
        private String manufacturer;
        private String category;
        @CreatedDate
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        private LocalDateTime dataCriacao = LocalDateTime.now();
          
       
        
  }