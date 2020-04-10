package exercicios;



import javax.swing.JOptionPane;


public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Crie um programa que leia 2 Strings de 10 caracteres informadas pelo usu�rio.
		Determine o grau de similaridade das Strings analisando o caractere em cada posi��o.
		Por exemplo, considere as duas Strings abaixo:
		TAGATAATAT
		TAGTTAAATA
		Neste exemplo, os caracteres em verde (e fundo cinza) s�o iguais nas posi��es correspondentes,
		por�m os caracteres em vermelho (e fundo amarelo) s�o diferentes nas posi��es
		correspondentes.
		Neste exemplo, temos 6 caracteres iguais e 4 diferentes.
		Logo, h� 60% de similaridade.
		 */
		
		//String[] valores = new String [2]; //ou seria 10
		
		
		String s1 = JOptionPane.showInputDialog("Digite a 1� palavra com 10 caracteres:");
		
		
		String s2 = JOptionPane.showInputDialog("Digite a 2� palavra com 10 caracteres:");
		
		//verifica o tamanho das strings
		if(s1.length() == 10 && s2.length() == 10) {
			int igual = 0;
			
			//verifica todos os caracteres e contamos todos os que s�o iguais
			for (int i = 0; i < i < 10; i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					igual++;
				}
			}
			
			//calcula percentual
			int percentual = igual * 10;
			System.out.println("String s�o "+ percentual + "% similares!");
			
		} else {
			System.out.println("Strings informadas n�o tem 10 caracteres!");
		}
		
	}
}	
		
		
		//*System.out.println(valores.length); // valores no array
		
		/*if (v1.charAt(0) == v2.charAt(0) && v1.charAt(1) == v2.charAt(1) ) {
			System.out.println(v1.charAt(0) + v2.charAt(0));
		} else {
				System.out.println("Falso");	
		} 
		
		
		
	}

}
