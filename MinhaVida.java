package br.com.enio.beloprojeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MinhaVida {
public static void main(String[] args) {
        
    	String a = args[0];
    	
        LocalDate niver = LocalDate.parse(a,DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate hoje = LocalDate.now();
        
        int dias=0;

        while (niver.isBefore(hoje)){
            niver=niver.plusDays(1);
            dias++;
        }
        System.out.println("Eu tenho "+dias/365+" anos.");
    }

}
