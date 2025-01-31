package com.example.springboot.testes.OOP;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectExemple {
    public static void main(String[] args) {

        // listando os métodos da classe
        Class<?> clazz = Person.class;
        System.out.println("\nMétodos ");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        // Listando os atributos da classe
        System.out.println("\nAtributos");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }


    }

    class Person {
        private String name;
        private int age;

        public void sayHello() {
            System.out.println("Olá");
        }
    }
}
