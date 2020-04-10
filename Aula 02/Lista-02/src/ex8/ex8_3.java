package ex8;

import java.util.Scanner;

public class ex8_3 {

	public static void main(String[] args) {
		/*
		 * 3. Crie um programa que leia um n�mero inteiro correspondente � idade de uma pessoa em dias.
		Logo ap�s, o seu programa deve informar a idade da pessoa em anos, meses e dias. Para facilitar
		o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. Por exemplo, se o usu�rio
		informar 400 dias, a sa�da dever� ser 1 ano, 1 m�s e 5 dias.
		 * 
		 */

		int idade,idadeDia,idadeAno,idadeMes;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a sua idade em dias: ");
		idade = leitor.nextInt();
		leitor.close();
		
		idadeAno = idade / 365;
		idadeMes = (idade % 365) / 30;
		idadeDia = (idade % 365) % 30;
		
		
		System.out.println("Sua idade � de "+idadeAno+" ano(s), "+idadeMes+" mes(es) "+"e "+idadeDia+" dia(s).");
		
	}

}
