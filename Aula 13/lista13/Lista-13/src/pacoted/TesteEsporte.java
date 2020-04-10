package pacoted;

import java.util.Scanner;



public class TesteEsporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe a modalidade do esporte:");
		String modalidade = leitor.nextLine();
		System.out.print("Informe a quantidade de atletas:");
		int qtdAtletas = leitor.nextInt();
		System.out.print("Informe a quantidade de tempos:");
		double tempoDuracao = leitor.nextDouble();
		
		leitor.close();
		
		Esporte e1 = new Esporte();
		e1.setModalidade(modalidade);
	    e1.setQtdAtletas(qtdAtletas);
		e1.setTempoDuracao(tempoDuracao);
		e1.informacoes();
		

	}

}
