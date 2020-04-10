package pacoteg;

import java.util.Scanner;

public class TesteCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o modelo do celular:");
		String mod = leitor.nextLine();
		System.out.print("Informe a marca do celular:");
		String marc = leitor.nextLine();
		System.out.print("Informe o preço do calular:");
		double p = leitor.nextDouble();
		
		Celular c1 = new Celular(mod,marc,p);
		c1.informacoes();
		leitor.nextLine();
		
		leitor.close();

	}

}
