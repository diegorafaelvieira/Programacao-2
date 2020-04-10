package exercicio1c;

import java.util.Scanner;


public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor =   new Scanner (System.in);
		System.out.print("Infome o nome da empresa:");
		String nome1 = leitor.nextLine();
		
		System.out.print("Infome a cidade da empresa:");
		String cidade1 = leitor.nextLine();
		
		System.out.print("Infome a quantidade de funcionários:");
		int funcionarios1 = leitor.nextInt();
		
		leitor.nextLine();   /// colocar para dar a quebra de linha
		
		System.out.print("Infome o nome da empresa:");
		String nome2 = leitor.nextLine();
		
		System.out.print("Infome a cidade da empresa:");
		String cidade2 = leitor.nextLine();
		
		System.out.print("Infome a quantidade de funcionários:");
		int funcionarios2 = leitor.nextInt();
		
		
		leitor.close();
		
		Empresa emp1 = new Empresa();
		emp1.nome = nome1;
		emp1.cidade = cidade1;
		emp1.funcionarios = funcionarios1;
		
		emp1.informacoes();
		
		Empresa emp2 = new Empresa();
		emp2.nome = nome2;
		emp2.cidade = cidade2;
		emp2.funcionarios = funcionarios2;
		
		emp2.informacoes();

	}

}
