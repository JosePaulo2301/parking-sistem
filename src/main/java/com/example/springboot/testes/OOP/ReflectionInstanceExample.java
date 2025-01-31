package com.example.springboot.testes.OOP;

import java.lang.reflect.InvocationTargetException;

public class ReflectionInstanceExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> class1 = NewPerson.class;


        // criando um objeto da classe person

        Object obj = class1.getDeclaredConstructor().newInstance();

    }

    class NewPerson {
        public NewPerson() {
            System.out.println("Constutor chaamado");
        }
    }
}
