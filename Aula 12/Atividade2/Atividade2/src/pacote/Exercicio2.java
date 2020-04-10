package pacote;

import java.util.Scanner;



public class Exercicio2 {

	public static void main(String[] args) {
		float cred = 0;
		float deb = 0;
		int op = 0;
		//Solicita nome,saldo e operação
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe seu saldo:R$");
		float saldo = entrada.nextFloat();
		while(op!=3) {
		System.out.print("Informe a Operação >(1)Crédito,(2)Débito ou (3)Sair<: ");
		op = entrada.nextInt();
		
		//Condição para creditar ou debitar
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
			System.out.println("Transações Encerradas!");
		}
		else if (op != 1 && op != 2 && op!=3){
			System.out.println("Operação Inválida!");
		}
		 }
		//Objetos
		Correntista c1 = new Correntista(nome, saldo, cred,deb);
		c1.Imprimi();	
		entrada.close();
		
	}

}