package exemplos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe uma string: ");
		String nome = leitor.nextLine();
		System.out.println("Informou " + nome);
		System.out.print("Informe um número: ");
		int numero = leitor.nextInt();
		System.out.println("Informou " + numero);
		leitor.close();

	}

}
