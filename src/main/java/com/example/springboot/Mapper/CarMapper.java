package com.example.springboot.Mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Car;
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
    	carDTO.setManufacturer(car.getManufacturer());
    	carDTO.setCategory(car.getCategory());
    	carDTO.setDataCriacao(car.getDataCriacao());
    	
        return carDTO;
    }

    public Car toModel (CarRequestDTO carDTO){
            Car car = new Car();
            car.setPlate(carDTO.getPlate());
            car.setTicket(carDTO.getTicketService().generateTicket());
            car.setColor(carDTO.getColor());
            car.setManufacturer(carDTO.getManufacturer());
            car.setCategory(carDTO.getCategory());
            carDTO.getDataCriacao();
			car.setDataCriacao(LocalDateTime.now());
            return car;
    }
    

}
