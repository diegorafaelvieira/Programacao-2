package ex8;

import java.util.Scanner;

public class ex8_3 {

	public static void main(String[] args) {
		/*
		 * 3. Crie um programa que leia um número inteiro correspondente à idade de uma pessoa em dias.
		Logo após, o seu programa deve informar a idade da pessoa em anos, meses e dias. Para facilitar
		o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Por exemplo, se o usuário
		informar 400 dias, a saída deverá ser 1 ano, 1 mês e 5 dias.
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
		
		
		System.out.println("Sua idade é de "+idadeAno+" ano(s), "+idadeMes+" mes(es) "+"e "+idadeDia+" dia(s).");
		
	}

}
