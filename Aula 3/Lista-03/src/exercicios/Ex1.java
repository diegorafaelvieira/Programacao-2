package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 1. Considere a seguinte estrutura composta por dois laços de repetição aninhados:
		for (int i = 1; ; ) {
		for (int j = 1; ; ) {
		System.out. ;
		}
		System.out. ;
		}
		Complete os espaços em branco de modo que o seu programa imprima a saída abaixo:
		1 10 100 1000 J
		3 30 300 3000
		5 50 500 5000
		7 70 700 7000
		9 90 900 9000
		I */
		
		for (int i = 1; i < 10; i=i+2) {
			for (int j = 1; j <= 1000; j = j * 10) {
				System.out.println(i*j + " ");
			}
			System.out.println();
		}

	}

}
