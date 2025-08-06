package com.example.springboot.Mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Car;
import com.example.springboot.model.CarModel;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;

@Service
public class CarMapper {

    public CarDTO toDTO(Car car) {
    	CarDTO carDTO = new CarDTO();
    	carDTO.setId(car.getId());
    	carDTO.setTicket(car.getTicket());
    	carDTO.setPlate(car.getPlate());
    	carDTO.setColor(car.getColor());
        if (car.getCarModel() != null) {
            carDTO.setManufacturer(car.getCarModel().getManufacturer());
            carDTO.setCategory(car.getCarModel().getCategory());
        }
    	carDTO.setDataCriacao(car.getDataCriacao());
    	
        return carDTO;
    }

    public Car toModel(CarDTO carDTO, CarModel carModel) {
        Car car = new Car();
        car.setPlate(carDTO.getPlate());
        car.setColor(carDTO.getColor());
        car.setCarModel(carModel);
        car.setDataCriacao(carDTO.getDataCriacao());
        car.setTicket(carDTO.getTicket());
        return car;
    }

}
