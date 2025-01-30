package com.example.springboot.testes.OOP;

public class Animal {
    private String nome;
    private String som;

    public Animal() {
    }

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
    
    @Override
    public String toString(){
        return nome + "faz" + som;
    }
}
