package exercicios;



import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Usando um JOptionPane, leia uma String informada pelo usu�rio e determine se esta String � um
			pal�ndromo (IGUAL DE TRAS PARA FRENTE). Finalmente, escreva na tela se a String � ou n�o � um pal�ndromo.
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
				System.out.println("� palindromo!");
			} else {
				System.out.println("N�o � palindromo!");
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
		          System.out.println("A palavra "+palavra+ " � um PALINDROMO");
		      }else{
		          System.out.println("A palavra "+palavra+ " N�O � um PALINDROMO");;
		      }
		
		      leitor.close();

		

	}

}
