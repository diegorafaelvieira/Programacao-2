package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		/*
		 * 4. Crie um programa que calcule e mostre o volume de uma esfera. O raio da esfera ser� fornecido
		pelo usu�rio atrav�s do teclado (tipo de dado double). Pesquisa a f�rmula para c�lcule de volume
		da esfera e considere para PI o valor 3.14159 (tipo de dado double).
		Obs:
		Os dados lidos devem ser armazenados em vari�veis do tipo double.
		Para ler dados double do teclado, use a seguinte linha:
		double valor = leitor.nextDouble();
		 */
		
		Scanner leitor = new Scanner(System.in);
		

		double pi;
		pi = 3.14159;
		
		System.out.print("Informe o valor do raio da esfera: ");
		double raio = leitor.nextInt();
		System.out.println(4/3 * pi * (raio * raio * raio));
		leitor.close();
	}

}
