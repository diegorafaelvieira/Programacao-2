package exercicios;



import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Usando um JOptionPane, leia uma String informada pelo usuário e determine se esta String é um
			palíndromo (IGUAL DE TRAS PARA FRENTE). Finalmente, escreva na tela se a String é ou não é um palíndromo.
		 */
		
			Scanner leitor = new Scanner (System.in);
			
			String palavra = JOptionPane.showInputDialog("Digite a palavra:");
		
		    
			if((palavra != null)) && (palavra.leght() >0 )) {
				boolean palindromo = true;
				
				for (int i = 0; i < palavra.length(); i++) {
					if(palavra.charAt(i) != palavra.charAt(palavra.length()-1 -i))
						palindromo = false;
						break
				}
			}
			
			if(palindromo) {
				System.out.println("É palindromo!");
			} else {
				System.out.println("Não é palindromo!");
			}
			
	} else {	
			
			System.out.println("Palavra invalida!");
			
			
	}
}	
			
		    /*String resultado=""; 
		      for(int x=palavra.length()-1;x>=0;x--){
		          resultado+= palavra.charAt(x);
		      }
		      if(resultado.equals(palavra)){
		          System.out.println("A palavra "+palavra+ " é um PALINDROMO");
		      }else{
		          System.out.println("A palavra "+palavra+ " NÃO é um PALINDROMO");;
		      }
		
		      leitor.close();

		

	}

}
