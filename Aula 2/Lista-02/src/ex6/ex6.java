package ex6;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		/*
		 * 6. Escreva um programa que solicite as seguintes informações sobre uma viagem: quilometragem
		inicial do carro, quilometragem do carro após a viagem e o número de litros de combustível
		consumidos. Com base nessas informações calcule a média de consumo do carro por litro e
		imprima na tela.
		 */
		
		double kmInicial,kmFinal,combustivel;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Informe o valor da Km inicial: ");
		kmInicial = leitor.nextDouble();
		
		System.out.print("Informe o valor da Km final: ");
		kmFinal = leitor.nextDouble();
		
		
		System.out.print("Informe a quantidade de litros de combustível consumidos: ");
		combustivel = leitor.nextDouble();
		
		leitor.close();
		
		double media;
		media = ((kmFinal - kmInicial)/combustivel);
		
		System.out.println("A média de litros gastos é de :" + media + "Km por litro");
		
		

	}

}
