package br.com.gustavo.kaki;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    	Integer tamanho = 0;
    	String quebrar;
    	String fritar;
    	Integer contFritar = 0;
    	
    	try (Scanner ler = new Scanner(System.in);){
    		System.out.println("Informe o tamanho do ovo: ");
        	tamanho = ler.nextInt();
        	Ovo ovo = new Ovo(tamanho);
        	
        	System.out.println("Deseja quebrar o ovo?");
        	quebrar = ler.next();
        	
        	if ("sim".equalsIgnoreCase(quebrar)) {
    			ovo.quebrarOvo();
    		}
        	
        	if (ovo.getQuebrado()) {
        		do {
            		System.out.println("Deseja fritar o ovo?");
            		fritar = ler.next();
            		
            		if ("sim".equalsIgnoreCase(fritar)) {
        				contFritar++;
        			}
            	} while(!"parar".equalsIgnoreCase(fritar));
        		
        		for (Integer i = 0; i < contFritar; i++) {
        			ovo.fritar();
        		}
        		
        		ovo.getStatus();
        		System.out.println(ovo.getStatus());
    		} else {
    			System.out.println("Você não quebrou o ovo!");
    		}
    	} catch (Exception e) {
    		System.out.println("Erro!");
    	}
    }
}
