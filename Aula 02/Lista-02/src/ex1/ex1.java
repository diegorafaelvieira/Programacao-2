package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que leia 2 números inteiros do teclado e que imprima na tela a soma,
substração, multiplicação, divisão e resto da divisão desses dois números.
		 */
		
		
		Scanner leitor = new Scanner(System.in);
				
		
		System.out.print("Entre com o primeiro número: ");
		int valor1 = leitor.nextInt();
        System.out.print("Entre com o segundo número: ");
        int valor2 = leitor.nextInt();
        System.out.println("Soma: " + valor1 + valor2);
        System.out.println("Subtração: " +  (valor1 - valor2));
        System.out.println("Multiplicação: " + valor1 * valor2);
        System.out.println("Divisão: " + valor1 / valor2);
        System.out.println("Resto: " + valor1 % valor2);
        leitor.close();
        
        
	}

}
