package Aula20_03;

import java.util.Scanner;

public class Semana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner (System.in);
    
	  String diaSemana,diaM;
	
		System.out.print("o dia da semana:  ");
		diaSemana = ler.next();
		diaM = diaSemana.toUpperCase();
		
		if (diaSemana.equals("DOMINGO")) {
			System.out.println(" O dia da semana é referente a 1");
		}
			
	   else if (diaSemana.equals("SEGUNDA")) {
				System.out.println(" O dia da semana é referente a 2");
		}
		
	   else if (diaSemana.equals("TERÇA")) {
				System.out.println(" O dia da semana é referente a 3");
	   }
				
	   else if (diaSemana.equals("QUARTA")) {
							System.out.println(" O dia da semana é referente a 4");
					}
		
	   else if (diaSemana.equals("QUINTA")) {
				System.out.println(" O dia da semana é referente a 5");
		}
		
	   else if (diaSemana.equals("SEXTA")) {
				System.out.println(" O dia da semana é referente a 6");
				
		}
		
	   else if (diaSemana.equals("SABADO")) {
				System.out.println(" O dia da semana é referente a 7");
		}
		
		else{
			System.out.println (" ESSE NUMERO É INVALIDO");

		}
		ler.close();

	}

}
		
		
		
		
		
		
		
	
	
