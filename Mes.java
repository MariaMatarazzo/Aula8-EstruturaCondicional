package Aula20_03;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner (System.in);
		
		int numero;
		
		System.out.print("informe o numero que deseja, para descobrir mes do ano:  ");
		numero = ler.nextInt();
		
		if (numero == 1) {
		System.out.println (" o dia da semana é Janeiro ");
		}
		
		else if (numero == 2) {
			System.out.println("O dia da semana é Fevereiro");
		}
			
		else if (numero == 3) {
				System.out.println("O dia da semana é Março");
		}
		
		else if (numero == 4) {
			System.out.println("O dia da semana é Abril");
		}
		
		else if (numero == 5) {
			System.out.println("O dia da semana é Maio");
		}
		
		else if (numero == 6) {
				System.out.println("O dia da semana é Junho");
		}
		
		else if (numero == 7) {
			System.out.println("O dia da semana é Julho");
		}
		
		else if (numero == 8) {
			System.out.println("O dia da semana é Agosto");
		}
		
		else if (numero == 9) {
			System.out.println("O dia da semana é Setembro");
		}
		else if (numero == 10) {
			System.out.println("O dia da semana é Outubro");
		}
		
		else if (numero == 11) {
			System.out.println("O dia da semana é Novembro");
		}
		
		else if (numero == 12) {
			System.out.println("O dia da semana é Dezembro");
		}
		
		else {
			System.out.println (" Esse mes é invalido");
		}
		ler.close();	
		
		
		

	


	}

}
