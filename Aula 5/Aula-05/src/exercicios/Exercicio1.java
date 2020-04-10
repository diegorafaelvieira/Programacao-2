package exercicios;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Crie um programa que simule n lançamentos de uma moeda, cujo resultado pode ser cara ou coroa.
			O valor n deve ser informado via teclado. Após simular os n lançamentos, informe na tela o
			percentual de resultados cara e de coroa.
		 */
		
		
		
		 Random r = new Random();
	        Scanner entrada = new Scanner(System.in);
			
			System.out.print("Informe o número de lançamentos: ");
			int n = entrada.nextInt();
			entrada.close();
			int cont_cara = 0;
			int cont_coroa = 0;
			for (int i = 0; i < n; i++) {
				int x = r.nextInt(2);
				if(x==1) {
					System.out.println("Cara");
					cont_cara++;
				}
				else {
					System.out.println("Coroa");
					cont_coroa++;
				}
				
			}
			
			System.out.println("Cara sorteado "+cont_cara+" vezes");
			System.out.println("Coroa sorteado "+cont_coroa+" vezes");
			
			
			double porcentagemCara = (cont_cara * 100) / n;
			System.out.println("A porcentagem que saiu cara é de "+porcentagemCara+" %.");
			
			double porcentagemCoroa = (cont_coroa * 100) / n;
			System.out.println("A porcentagem que saiu cara é de "+porcentagemCoroa+" %.");
		
	 

	}

}
