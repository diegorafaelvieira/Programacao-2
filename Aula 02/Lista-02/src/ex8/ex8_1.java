package ex8;

import java.util.Scanner;

public class ex8_1 {

	public static void main(String[] args) {
		/*
		 * 1. Crie um programa que compute o n�mero m�dio de alunos por turma. Para tal, leia do teclado o
		n�mero de turmas e o n�mero de alunos em cada turma. Nenhuma turma pode ter mais de 32
		alunos! Se o usu�rio informar que uma turma tem mais de 32 alunos, pergunte novamente.
		 */

		int alunos,turmas,soma,contador;
		contador = 0;
		soma = 0;
		float media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o n�mero de turmas: ");
		turmas = leitor.nextInt();
		for (int x = 0; x < turmas; x++) {
			System.out.println("Informe o n�mero de alunos por turma menor do que 32");
			alunos = leitor.nextInt();
			if (alunos > 0 && alunos <= 32) {
				soma = soma + alunos;
				contador++;
				
			}
			else {
				System.out.println("N�meros de alunos inv�lidos por turma,digite novamente");
						x--;
						
			}
		}
		
		leitor.close();
		
		media = soma / turmas;
		
		System.out.println("A m�dia de alunos por turma � de " + media + "alunos por turma");
		
	}

}
