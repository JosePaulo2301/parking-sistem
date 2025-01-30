package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VacancyOccupation {

    private Long id;
    private Double firstHourValue;
    private Double subsequentHourValue;

}