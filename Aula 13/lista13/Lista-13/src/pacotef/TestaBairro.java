package pacotef;

import java.util.Scanner;

public class TestaBairro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe o nome do bairro:");
		String n = leitor.nextLine();
		System.out.print("Informe o número de habitantes:");
		int h = leitor.nextInt();
		System.out.print("Informe o número de casas:");
		int nc = leitor.nextInt();
		
		
		Bairro b1 = new Bairro(n,h,nc);
		b1.informacoes();
		leitor.nextLine();
		
		leitor.close();
	}

}
