package exercicio4;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe o nome do aluno:");
		String nome = leitor.nextLine();
		System.out.print("Informe o curso:");
		String curso = leitor.nextLine();
		System.out.print("Informe a data de admiss�o:");
		String dataDeAdmissao = leitor.nextLine();
		System.out.print("Informe o n�mero da matr�cula:");
		String numeroMatricula = leitor.nextLine();
		
		
		leitor.close();
		
		
		
		Aluno alu = new Aluno();
		alu.nome = nome;
		alu.curso = curso;
		alu.dataDeAdmiss�o = dataDeAdmissao;
		alu.numeroMatricula = numeroMatricula;
		
		alu.informacoes();
		
		

	}

}
