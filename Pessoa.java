package br.com.enio.beloprojeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private LocalDate dataNascimento;
	
	public Pessoa(LocalDate niver) {
		this.dataNascimento = niver;
	}
	public Integer getIdade() {
		LocalDate niver = LocalDate.parse(args[0],DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate hoje = LocalDate.now();
        
        int dias=0;

        while (niver.isBefore(hoje)){
            niver=niver.plusDays(1);
            dias++;
        }
	}
}
