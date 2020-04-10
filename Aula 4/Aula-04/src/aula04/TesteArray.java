package aula04;

//Lista
public class TesteArray {

	public static void main(String[] args) {
		
		int[] valores = {44,12,23,12,17,81,4,9};
		System.out.println(valores[0]);
		System.out.println(valores[4]);
		
		//inserindo um novo valor para o valor 0(zero)
		valores[0] = 666;
		System.out.println(valores[0]);
		
		//inserindo os valores do array string
		String[] nomes = new String[2];
		nomes[0] = "Sonic";
		nomes[1] = "Super Mario";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		
		//array com valores em double
		double [] medias = new double[2];
		medias[0] = 9.5;
		medias[1] = 8.5;
		
		System.out.println(medias[0]);
		System.out.println(medias[1]);
		
		int tamanho = medias.length;
		System.out.println("Ha " + tamanho + " elementos.");
		
		//percorre todo o array usando o comando FOR
		for (int i = 0; i < medias.length; i++) {
			System.out.println(medias[i]);
		}
		
		//percorre o array usando o comando WHILE
		int j = 0;
		while(j < medias.length) {
			System.out.println(medias[j]);
			j++;
		}
		
		
		
	}

}
