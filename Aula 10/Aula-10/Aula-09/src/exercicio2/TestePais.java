package exercicio2;

import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome do país:");
		String nome = leitor.nextLine();
		System.out.print("Informe a capital:");
		String capital = leitor.nextLine();
		System.out.print("Informe o número de habitantes:");
		int habitantes = leitor.nextInt();
		
		leitor.close();
		
		Pais p1 = new Pais();
		p1.nome = nome;
		p1.capital = capital;
		p1.habitantes = habitantes;
		
		p1.informacoes();

	}

}
