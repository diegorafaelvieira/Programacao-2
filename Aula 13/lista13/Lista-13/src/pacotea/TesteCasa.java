package pacotea;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Infome a cor da casa:");
		String cor = leitor.nextLine();
		System.out.print("Infome o número da casa:");
		int numero = leitor.nextInt();
		System.out.print("Infome o número de moradores:");
		int moradores = leitor.nextInt();
		
		
		
		Casa c1 = new Casa();
		c1.setCor(cor);
		c1.setNumero(numero);
		c1.setMoradores(moradores);
		c1.morar();
		
		
		leitor.close();
		
	}

}
