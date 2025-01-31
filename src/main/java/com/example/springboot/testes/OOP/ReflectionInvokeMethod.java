package com.example.springboot.testes.OOP;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionInvokeMethod {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        PersonTwo person = new PersonTwo();
        Class<?> reflectionPerson = person.getClass();

        Method method = reflectionPerson.getDeclaredMethod("sayHello");
        method.invoke(person);

        Method privateMethod = reflectionPerson.getDeclaredMethod("secretMessage");
        privateMethod.setAccessible(true);
        privateMethod.invoke(person);

    }



}

