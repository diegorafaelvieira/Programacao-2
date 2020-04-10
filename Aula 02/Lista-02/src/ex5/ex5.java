package ex5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa que leia do teclado o valor de um salário e a porcentagem de aumento.
		Logo após, imprima na tela o valor do salário inicial, o valor do aumento e o novo valor do salário.
		 */
		double salarioInicial,aumento,porcentagem,salarioAtual;
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		System.out.print("Informe o valor do salário inicial: R$");
		salarioInicial = leitor.nextFloat();
		System.out.print("Informe a porcentagem do aumento: ");
		porcentagem = leitor.nextFloat();
		System.out.println("A porcentagem de aumento digitado foi " + porcentagem);
		
		leitor.close();
		
		aumento = (salarioInicial * porcentagem) / 100;
		salarioAtual = salarioInicial + aumento;
		
		System.out.println("O salário inicial era de :R$" + salarioInicial);
		System.out.println("O aumento foi de :R$" + aumento);
		System.out.println("O salário atual é de :R$" + salarioAtual);
		
				
		
	}
}	



