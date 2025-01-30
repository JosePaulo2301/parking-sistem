package com.example.springboot.testes.OOP;

public class MainFalar {
    public static void main(String[] args) {
    AnimalService animalService = new AnimalServiceImpl();

    Animal animal = animalService.falar();

        System.out.println(animal);

    }
}
