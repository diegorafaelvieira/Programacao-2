package ex7;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		/*
		 * 7. Escreva um programa que pergunte o sal�rio do funcion�rio e calcule o valor do aumento.
		Para sal�rios at� R$1.000,00 calcule um aumento de 20%.
		Para sal�rios maiores que R$1.000,00 at� R$2.000,00 calcule 15% de aumento.
		Finalmente, para sal�rios maiores que R$2.000,00 calcule 10% de aumento.
		 */
		double salario,aumento,salarioNovo;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Informe o valor do sal�rio: ");
		salario = leitor.nextDouble();
		leitor.close();
		
		if (salario >= 0 && salario <= 1000) {
			aumento = (salario*20)/100;
			salarioNovo = aumento + salario;
			System.out.println("Novo sal�rio � de: R$" + salarioNovo);
			System.out.println("Aumento de: R$" + aumento);
	
		} else if (salario > 1000 && salario <= 2000) {
				aumento = (salario*15)/100;
				salarioNovo = aumento + salario;
				System.out.println("Novo sal�rio � de: R$" + salarioNovo);
				System.out.println("Aumento de: R$" + aumento);
			} else if (salario > 2000) {
				aumento = (salario*10)/100;
				salarioNovo = aumento + salario;
				System.out.println("Novo sal�rio � de: R$" + salarioNovo);
				System.out.println("Aumento de: R$" + aumento);
		}
			

	}

}
