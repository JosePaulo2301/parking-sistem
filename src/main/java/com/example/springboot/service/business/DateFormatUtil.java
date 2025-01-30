package com.example.springboot.service.business;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.springframework.stereotype.Service;

public class DateFormatUtil {
	
	
    private String formattedDateTime;
    private LocalDateTime localDateTime;
    
    public static DateFormatUtil formatDataTime(LocalDateTime localDateTime) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        return new DateFormatUtil(formattedDateTime, localDateTime);
    }
    
    public static DateTimeFormatter dateFormat() {       
        return new DateTimeFormatterBuilder()
                .appendPattern("dd/MM/yyyy HH:mm:ss")
                .toFormatter();
    }
    
    
    public static void dateFormateISO() {
    	LocalDateTime now = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    	String formattedDateTime = now.format(formatter);

    	System.out.println(formattedDateTime);
    }
    

    

    public DateFormatUtil(String formattedDateTime, LocalDateTime localDateTime) {
        this.formattedDateTime = formattedDateTime;
        this.localDateTime = localDateTime;
    }

	public String getFormattedDateTime() {
        return formattedDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

	public static String dateFormateISO1() {
    	LocalDateTime now = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    	String formattedDateTime = now.format(formatter);
    	return formattedDateTime;
		
	}	

}
