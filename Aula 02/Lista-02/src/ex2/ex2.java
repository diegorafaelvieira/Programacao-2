package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		/*
		 * 2. Escreva um programa que lê um número do teclado e que determine se ele é par ou impar.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		int valor = leitor.nextInt();
		if (valor % 2 == 0) {
			System.out.println("Valor PAR!");
		} else {
			System.out.println("Valor ÍMPAR!");
		}
		leitor.close();
	}

}
