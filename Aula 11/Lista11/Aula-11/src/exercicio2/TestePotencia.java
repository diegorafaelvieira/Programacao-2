package exercicio2;

import java.util.Scanner;



public class TestePotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leitor =  new Scanner (System.in);
		
		System.out.print("Infome um valor:");
		int valor = leitor.nextInt();
		System.out.print("Infome o exponte:");
		int exponte = leitor.nextInt();
		
		leitor.close();
		
		
		Potencia p = new Potencia();
		p.a = valor;
		p.x = exponte;
		int r = p.elevadoA();
		System.out.println(r);

		
		
		
		
	}

}
