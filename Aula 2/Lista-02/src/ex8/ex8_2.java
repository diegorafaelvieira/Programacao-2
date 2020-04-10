package ex8;

import java.util.Scanner;

public class ex8_2 {

	public static void main(String[] args) {
		/*
		 * 2. Crie um programa que calcule e mostre o volume de uma esfera. O raio da esfera será fornecido
		pelo usuário através do teclado. Pesquise a fórmula para cálculo de volume da esfera e considere
		para PI o valor 3.14159.
		 */
		
		Scanner leitor = new Scanner(System.in);
		

		double pi;
		pi = 3.14159;
		
		System.out.print("Informe o valor do raio da esfera: ");
		double raio = leitor.nextDouble();
		System.out.println(4/3 * pi * (raio * raio * raio));
		leitor.close();
	}

}
