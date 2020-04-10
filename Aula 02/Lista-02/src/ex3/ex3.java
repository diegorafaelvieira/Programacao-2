package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		/*
		 * 3. Faça um programa que leia 2 números inteiros do teclado e que imprima se os números são iguais
ou diferentes. Caso sejam diferentes, imprima o maior deles apenas.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o 1° valor: ");
		int valor1 = leitor.nextInt();
		System.out.print("Informe o 2° valor: ");
		int valor2 = leitor.nextInt();
		if (valor1 == valor2) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		 if (valor1 > valor2)
			System.out.println(valor1);
		 if (valor1 < valor2)
				System.out.println(valor2);
		    }
		
		leitor.close();

	}

}
