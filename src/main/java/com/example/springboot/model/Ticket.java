package com.example.springboot.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @OneToOne
    @JoinColumn(name = "car_id_ticket")
    private Car car;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
