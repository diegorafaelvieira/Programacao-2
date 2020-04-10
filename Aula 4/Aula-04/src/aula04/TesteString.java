package aula04;

public class TesteString {

	public static void main(String[] args) {
		String banda = "Iron Maiden";
		System.out.println(banda);
		
		System.out.println(banda.charAt(0));  //Seleciona a 1ª letra
		System.out.println(banda.charAt(2));  //Seleciona a 3ª letra
		System.out.println(banda.charAt(3));  //Seleciona a 4ª letra
		
		
		//comando para saber o tamanho da palavra (10 letras + o espaço)
		int tamanho = banda.length();
		System.out.println("String tem " + tamanho + " caracteres");
		
		////comando que mostra a palvara com o FOR
		for (int i = 0; i < banda.length(); i++) {
			System.out.print(banda.charAt(i));
		}
		
		System.out.println();

		int v1 = 10;
		int v2 = 20;
		System.out.println("soma:" + v1 + v2);

	}

}
