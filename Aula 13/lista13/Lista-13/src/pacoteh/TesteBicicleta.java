package pacoteh;

import java.util.Scanner;

public class TesteBicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe o modelo da bicicleta:");
		String mod = leitor.nextLine();
		System.out.print("Informe a marca da bicicleta:");
		String m = leitor.nextLine();
		System.out.print("Informe o preço da bicicleta:");
		double p = leitor.nextDouble();
		
		Bicicleta b1 = new Bicicleta(mod,m,p);
		b1.informacoes();
		leitor.nextLine();
		
		leitor.close();

	}

}
