package pacotee;

import java.util.Scanner;



public class TesteViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o local da saída:");
		String s = leitor.nextLine();
		System.out.print("Informe o destino:");
		String d = leitor.nextLine();
		System.out.print("Informe o preço da viagem:");
		double p = leitor.nextDouble();
		
		
		
		Viagem v1 = new Viagem(s,d,p);
		v1.imprimi();
		leitor.nextLine();
		
		leitor.close();

	}

}
