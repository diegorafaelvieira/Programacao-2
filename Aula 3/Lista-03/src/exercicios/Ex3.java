package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 3. Escreva um aplicativo que localize o menor e o maior de v�rios inteiros informados pelo usu�rio.
		Suponha que o primeiro valor lido � o n�mero de valores a serem digitados pelo usu�rio.
		 */
		
			int qtdValores;
		
			Scanner leitor = new Scanner (System.in);  
		 	System.out.print("Informe a quantidade de valores a serem informados:");
			qtdValores = leitor.nextInt();
	        int valor[] = new int[qtdValores];  
	        int maior = valor[0], menor = Integer.MAX_VALUE;   //essa fun��o n�o foi ensinada
	        for(int i = 0; i < valor.length; i++){  
	            System.out.print("Digite o " +(i+1)+"� valor: ");  
	            valor[i] = leitor.nextInt();  
	            if(valor[i] > maior){   
	                maior = valor[i];  
	            }  
	        }  
	        for (int j = 0; j < valor.length; j++) {  
	            if(valor[j] < menor){  
	                menor = valor[j];  
	            }  
	        }  
	        System.out.println("Maior valor = "+ maior);  
	        System.out.println("Menor valor = "+ menor);
	       
	        leitor.close();
	}

}
