package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Crie um programa que leia 10 Strings do usu�rio (use JOptionPane) e calcule o tamanho m�dio
		das Strings. O tamanho m�dio deve ser armazenado em um dado do tipo double (com parte
		fracion�ria). Finalmente, o programa deve mostrar o tamanho m�dio usando um JOptionPane
		 */

		
		double tamanhoMedio;
		double medias;
		
		Scanner leitor = new Scanner (System.in);
		
		String[] palavra = new String[10];

		for (int i = 0; i < palavra.length; i++) {
			String p = JOptionPane.showInputDialog("Digite a palavra:");
			System.out.println(p);
			
			double media = p.lenght();
			double media = new media double[];
			medias[i] = media;
			System.out.println(media +);
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
