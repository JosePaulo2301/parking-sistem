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

    public CarModel(String manufacturer, String category, Car car) {
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public CarModel(Long id, String manufacturer, String category) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.category = category;
    }


}
