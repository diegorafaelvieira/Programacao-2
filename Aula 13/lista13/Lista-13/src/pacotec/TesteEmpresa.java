package pacotec;

import java.util.Scanner;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe o nome da empresa:");
		String nome = leitor.nextLine();
		System.out.print("Informe a cidade da empresa");
		String cidade = leitor.nextLine();
		System.out.print("Informe a quantidade de funcionários:");
		int qtdFuncionarios = leitor.nextInt();
		
		leitor.close();
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome(nome);
		empresa1.setCidade(cidade);
		empresa1.setQtdFuncionarios(qtdFuncionarios);
		empresa1.informacoes();
		
		

	}

}
