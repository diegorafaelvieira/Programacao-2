package pacote;

import java.util.Scanner;



public class Exercicio2 {

	public static void main(String[] args) {
		float cred = 0;
		float deb = 0;
		int op = 0;
		//Solicita nome,saldo e opera��o
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe seu saldo:R$");
		float saldo = entrada.nextFloat();
		while(op!=3) {
		System.out.print("Informe a Opera��o >(1)Cr�dito,(2)D�bito ou (3)Sair<: ");
		op = entrada.nextInt();
		
		//Condi��o para creditar ou debitar
		if(op == 1) {
			System.out.print("Informe um valor a ser creditado:R$");
			float credi = entrada.nextFloat();
			cred = credi+cred;
		}
		if(op == 2) {
			System.out.print("Informe um valor a ser debitado:R$");
			float debi = entrada.nextFloat();
			deb = deb+debi;
		}
		if(op == 3) {
			System.out.println("Transa��es Encerradas!");
		}
		else if (op != 1 && op != 2 && op!=3){
			System.out.println("Opera��o Inv�lida!");
		}
		 }
		//Objetos
		Correntista c1 = new Correntista(nome, saldo, cred,deb);
		c1.Imprimi();	
		entrada.close();
		
	}

}