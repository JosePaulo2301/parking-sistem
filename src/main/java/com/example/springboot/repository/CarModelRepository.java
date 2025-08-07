package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends JpaRepository<Car, Long> {

}
