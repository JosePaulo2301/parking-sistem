package com.example.springboot.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TicketService {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int TICKET_LENGH = 6;

    public static String generateTicket() {
        String letras = gerarLetrasAleatorias();
        String numeros = gerarNumerosAleatorios();
        String dataHora = obterDataHoraAtual();

        return letras + numeros + dataHora;
    }

    private static String gerarLetrasAleatorias() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < TICKET_LENGH; i++) {
            int index = random.nextInt(ALPHABET.length());
            char letra = ALPHABET.charAt(index);
            sb.append(letra);
        }
        return sb.toString();
    }

    private static String gerarNumerosAleatorios() {
        Random random = new Random();
        int numeros = random.nextInt(900000) + 100000;
        return String.valueOf(numeros);
    }

    private static String obterDataHoraAtual() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return now.format(formatter);
    }
}
