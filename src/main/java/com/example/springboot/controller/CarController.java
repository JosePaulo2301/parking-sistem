package com.example.springboot.controller;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Mapper.CarMapper;
import com.example.springboot.repository.CarRepository;
import com.example.springboot.service.CarService;
import com.example.springboot.service.dto.CarDTO;
import com.example.springboot.service.dto.CarRequestDTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

	private final CarRepository carRepository;
	private final CarMapper carMapper;
	private final CarService carService;

	public CarController(CarRepository carRepository, CarMapper carMapper, CarService carService) {
		this.carRepository = carRepository;
		this.carMapper = carMapper;
		this.carService = carService;
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<CarDTO> findAll () {
		return carService.list();
	}

	@GetMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public CarDTO findById (@PathVariable @NotNull Long id) {
		return carService.getById(id);
	}

	@PostMapping("create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CarDTO create(@RequestBody @Valid CarRequestDTO carDTO) {
		return carService.create(carDTO);
	}

    @PutMapping("/update/{id}")
	@ResponseStatus(code = HttpStatus.OK)
    public CarDTO updateCar(@PathVariable Long id, @RequestBody @Valid @NotNull  CarRequestDTO dto) {
    	return carService.updateCarService(id, dto);
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void deleteCar(@PathVariable @NotNull Long id) {
    	carService.delete(id);
    }




}
