package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 2. Escreva um programa que leia 2 números double do teclado.
		Usando estes números, teste os diferentes métodos classe Math e imprima o resultado.
		 */
		
		
		double valor1,valor2,valor;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o 1° valor:");
		valor1 = leitor.nextDouble();
		System.out.print("Informe o 2° valor: ");
		valor2 = leitor.nextDouble();
		
		System.out.print("Informe o valor para os demais testes:");
		valor = leitor.nextDouble();
		
		leitor.close();
		
		// raiz quadrada 
		double x1 = Math.sqrt(valor1);
		System.out.println("A raiz quadrada de "+valor1+" é: "+x1);
		
		double y1 = Math.sqrt(valor2);
		System.out.println("A raiz quadrada de "+valor2+" é: "+y1);
		
		// elevado ao quadrado
		double x2 = Math.pow(valor1,2); 
		System.out.println("O valor "+valor1+"elevado ao quadrado é: "+x2);
		
		double y2 = Math.pow(valor2,2); 
		System.out.println("O valor "+valor2+"elevado ao quadrado é: "+y2);
		
		// Retorna o valor maior
		double i = Math.max(valor1,valor2);
		System.out.println("O maior valor entre "+valor1+" e "+valor2+" é: "+i);
		
		// Retorna o valor menor
		double j = Math.min(valor1,valor2);
		System.out.println("O menor valor entre "+valor1+" e "+valor2+" é: "+j);
		
		///////////////////////////////////////////////////////////////
		
		
		//Arredonda o valor para baixo
		double a = Math.floor(valor);
		System.out.println("O valor arredendado de "+valor+" para baixo é: "+a);
		
		//Arredonda o valor para cima
		double b = Math.ceil(valor);
		System.out.println("O valor arredendado de "+valor+" para cima é: "+b);
		
		// Valor absoluto
		double c = Math.abs(valor);
		System.out.println("O valor absoluto de "+valor+" é: "+c);

	}

}
