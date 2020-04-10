package exercicios;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;



public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5. Crie um programa Java que:
		a) Leia 5 valores inteiros do teclado e armazene-os em um array.
		b) Após armazenar os valores no array, faça a contagem de quantos valores são negativos,
			e imprima o resultado da contagem na tela.
		c) Finalmente, imprima os valores positivos na tela.
		 */
		
		
        Scanner leitor = new Scanner(System.in);
        
        int [] numeros = new[5];
        
        for (int i = 0; i < 5; i++) {
			System.out.println("Informe um inteiro:");
			numeros[i] = leitor.nextInt();
		}
        
        int negativo = 0;
        for (int j = 0; j < 5; j++) {
			
		}
        
        
        
        
        
       /* int contP = 0;
        int contN = 0;
        int[] valores = {44,12,23,12,17};
        
        for (int i = 0; i < valores.length; i++) {
			if(i > 0)
				contP++;
			else
				if(i < 0) {
					contN++;
				}
		}
        
        leitor.close();
        
        System.out.println("Positivos:" + contP);
        System.out.println("Negativos:" + contN);
        		
        
	}

}
