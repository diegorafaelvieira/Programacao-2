package exercicios;



import javax.swing.JOptionPane;


public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Crie um programa que leia 2 Strings de 10 caracteres informadas pelo usuário.
		Determine o grau de similaridade das Strings analisando o caractere em cada posição.
		Por exemplo, considere as duas Strings abaixo:
		TAGATAATAT
		TAGTTAAATA
		Neste exemplo, os caracteres em verde (e fundo cinza) são iguais nas posições correspondentes,
		porém os caracteres em vermelho (e fundo amarelo) são diferentes nas posições
		correspondentes.
		Neste exemplo, temos 6 caracteres iguais e 4 diferentes.
		Logo, há 60% de similaridade.
		 */
		
		//String[] valores = new String [2]; //ou seria 10
		
		
		String s1 = JOptionPane.showInputDialog("Digite a 1ª palavra com 10 caracteres:");
		
		
		String s2 = JOptionPane.showInputDialog("Digite a 2ª palavra com 10 caracteres:");
		
		//verifica o tamanho das strings
		if(s1.length() == 10 && s2.length() == 10) {
			int igual = 0;
			
			//verifica todos os caracteres e contamos todos os que são iguais
			for (int i = 0; i < i < 10; i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					igual++;
				}
			}
			
			//calcula percentual
			int percentual = igual * 10;
			System.out.println("String são "+ percentual + "% similares!");
			
		} else {
			System.out.println("Strings informadas não tem 10 caracteres!");
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
