package com.example.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springboot.Mapper.CarMapper;
import com.example.springboot.exception.RecordNotFoundException;
import com.example.springboot.model.Car;
import com.example.springboot.repository.CarRepository;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;

@Service
public class CarService {

	private final CarRepository carRepository;
	private final CarMapper carMapper;

	public CarService(CarRepository carRepository, CarMapper carMapper) {
		this.carRepository = carRepository;
		this.carMapper = carMapper;
	}

	public CarDTO getById(Long id) {
		return carRepository.findById(id)
							.map(carMapper::toDTO)
							.orElseThrow(() -> new RecordNotFoundException("Car not exist with id :"  + id));
	}

	public CarDTO create (CarRequestDTO carDTO){
		Car car = carMapper.toModel(carDTO);
		return carMapper.toDTO(carRepository.save(car));
	}
	public List<CarDTO> list() {
		return carRepository.findAll()
				.stream()
				.map(carMapper::toDTO)
				.collect(Collectors.toList());
	}


	public CarDTO updateCarService(Long id, CarRequestDTO dto) {
		Car car = carRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Car not exist with id :" + id));
		car.setId(dto.getId());
		car.setPlate(dto.getPlate());
		car.setColor(dto.getColor());
		car.setCategory(dto.getCategory());
		car.setManufacturer(dto.getManufacturer());
		car.setDataCriacao(dto.getDataCriacao());
		Car carUpdate = carRepository.save(car);
		
		return carMapper.toDTO(carUpdate);
	}
	
	public void delete (Long id) {
		carRepository.delete(carRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Car not exist with id :" + id)));
	}
}
