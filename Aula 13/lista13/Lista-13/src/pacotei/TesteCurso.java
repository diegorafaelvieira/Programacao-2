package pacotei;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome do curso:");
		String n =leitor.nextLine();
		System.out.print("Informe a quantidade de alunos matriculados:");
		int qtda = leitor.nextInt();
		System.out.print("Informe a quantidade de semestres:");
		int qtds = leitor.nextInt();
		
		Curso c1 = new Curso(n,qtda,qtds);
		c1.informacao();
		leitor.nextLine();
		
		leitor.close();

	}

}
