package com.example.springboot.testes.OOP;

public class AnimalServiceImpl implements  AnimalService {
    @Override
    public Animal falar() {
        return new Animal("Cachorro", "Au au ");
    }

	@Override
	public Animal andar() {
		return new Animal("Cachorro", "Andando");
	}
}
