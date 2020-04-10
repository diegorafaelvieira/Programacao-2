package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Copie o programa acima para um novo arquivo e altere de modo que ele funcione para n
		lan�amentos de um dado com 6 faces. O valor n deve ser informado via teclado. Ap�s simular os n
		lan�amentos, informe na tela o percentual de resultados para cada face do dado.
		 */
		
		Random r = new Random();
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o n�mero de lan�amentos: ");
		int n = entrada.nextInt();
		entrada.close();
		int cont_lado1 = 0;
		int cont_lado2 = 0;
		int cont_lado3 = 0;
		int cont_lado4 = 0;
		int cont_lado5 = 0;
		int cont_lado6 = 0;
		
		for (int i = 0; i < n; i++) {
			int x = 1 + r.nextInt(6);
			if(x==1) {
				System.out.println("Lado 1");
				cont_lado1++;
			}
			else if (x==2) {
					System.out.println("Lado 2");
					cont_lado2++;
			}
			else if (x==3) {
				System.out.println("Lado 3");
				cont_lado3++;
			}
			else if (x==4) {
				System.out.println("Lado 4");
				cont_lado4++;
			}
			else if (x==5) {
				System.out.println("Lado 5");
				cont_lado5++;
			}
			else if (x==6) {
				System.out.println("Lado 6");
				cont_lado6++;
			}
			
		}
		
		
		double porcentagemLado1 = (cont_lado1 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 1 � de "+porcentagemLado1+" %.");
		
		double porcentagemLado2 = (cont_lado2 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 2 � de "+porcentagemLado2+" %.");
		
		double porcentagemLado3 = (cont_lado3 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 3 � de "+porcentagemLado3+" %.");
		
		double porcentagemLado4 = (cont_lado4 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 4 � de "+porcentagemLado4+" %.");
		
		double porcentagemLado5 = (cont_lado5 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 5 � de "+porcentagemLado5+" %.");
		
		double porcentagemLado6 = (cont_lado6 * 100) / n;
		System.out.println("A porcentagem que saiu o lado 6 � de "+porcentagemLado6+" %.");
		
	}

}
