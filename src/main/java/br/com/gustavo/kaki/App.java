package br.com.gustavo.kaki;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
    	String dataString = String.valueOf(args[0]);//transforma a data de args em uma String;
		LocalDate hoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.parse(dataString, DateTimeFormatter.ISO_LOCAL_DATE);
		
		Integer dias = 0;
		while (dataNascimento.isBefore(hoje)) {
			dataNascimento = dataNascimento.plusDays(1);
			dias++;
		}
		
		System.out.println("Você tem: " + (dias/365) + " anos.");
    }
}
