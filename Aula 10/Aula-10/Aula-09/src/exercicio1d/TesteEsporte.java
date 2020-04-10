package exercicio1d;

import java.util.Scanner;

public class TesteEsporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor =   new Scanner (System.in);
		System.out.print("Infome o nome do esporte:");
		String nome1 = leitor.nextLine();
		
		System.out.print("Infome o número de atletas:");
		int atletas1 = leitor.nextInt();
		
		
		leitor.nextLine();   /// colocar para dar a quebra de linha
		
		System.out.print("Infome o nome do esporte:");
		String nome2 = leitor.nextLine();
		
		System.out.print("Infome a quantidade de atletas:");
		int atletas2 = leitor.nextInt();
		
		
		
		leitor.close();
		
		Esporte esporte1 = new Esporte();
		esporte1.nome = nome1;
		esporte1.atletas = atletas1;
		
		esporte1.informacoes();
		
		
		Esporte es2 = new Esporte();
		es2.nome = nome2;
		es2.atletas = atletas2;
		
		es2.informacoes();
		
	}

}
