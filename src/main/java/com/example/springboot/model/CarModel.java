package com.example.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class CarModel {
    @Id
    private Long id;
    private String manufacturer;
    private String category;


}
