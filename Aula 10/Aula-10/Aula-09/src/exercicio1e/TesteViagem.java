package exercicio1e;

import java.util.Scanner;

public class TesteViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor =   new Scanner (System.in);
		
		System.out.print("Infome a origem da viagem:");
		String origem1 = leitor.nextLine();
		
		System.out.print("Infome o destino da viagem:");
		String destino1 = leitor.nextLine();
		
		System.out.print("Infome o valor da viagem:");
		double valor1 = leitor.nextDouble();
		
		leitor.nextLine();   /// colocar para dar a quebra de linha
		
		
		System.out.print("Infome a origem da viagem:");
		String origem2 = leitor.nextLine();
		
		System.out.print("Infome o destino da viagem:");
		String destino2 = leitor.nextLine();
		
		System.out.print("Infome o valor da viagem:");
		double valor2 = leitor.nextDouble();
		
		leitor.close();
		
		Viagem v1 = new Viagem();
		v1.origem = origem1;
		v1.destino = destino1;
		v1.valor = valor1;
		
		v1.informacoes();
		
		Viagem v2 = new Viagem();
		v2.origem = origem2;
		v2.destino = destino2;
		v2.valor = valor2;
		
		v2.informacoes();

	}

}
