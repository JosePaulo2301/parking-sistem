package com.example.springboot.model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Ticket {
    @OneToOne
    @JoinColumn(name = "car_id_ticket")
    private Car car;
    @Id
    private Long id;
}
