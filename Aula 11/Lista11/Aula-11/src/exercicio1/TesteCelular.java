package exercicio1;

import java.util.Scanner;

public class TesteCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor =   new Scanner (System.in);
		
		System.out.print("Infome o modelo do celular:");
		String modelo1 = leitor.nextLine();
		System.out.print("Infome a marca do celular:");
		String marca1 = leitor.nextLine();
		
		
		System.out.print("Infome o modelo do celular:");
		String modelo2 = leitor.nextLine();
		System.out.print("Infome a marca do celular:");
		String marca2 = leitor.nextLine();
		
		leitor.close();
		
		
		
		Celular c1 = new Celular();
		c1.modelo = modelo1;
		c1.marca = marca1;
		
		
		
		
		Celular c2 = new Celular();
		c2.modelo = modelo2;
		c2.marca = marca2;
		
		ComparadorCelular c = new ComparadorCelular();
		c.compara(c1, c2);
		
	}

}
