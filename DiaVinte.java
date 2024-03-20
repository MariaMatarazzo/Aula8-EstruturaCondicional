package Aula20_03;

import java.util.Scanner;

public class DiaVinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.print("informe o numero: ");
		numero = ler.nextInt();
		
		if (numero > 10) {
			System.out.println ("O numero é maior que 10");
		}
		ler.close();

	}

}
