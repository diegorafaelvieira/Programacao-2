package teste;

import java.util.Random;

public class Buscas {
	
	public static void main(String[] args) {
		
		// Cria um array com numeros PARES apenas
		int[] numeros = new int[1000000];
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = i*2;

		Random r = new Random();
		int valorProcurado = r.nextInt(2000000);
		System.out.println("Elemento Buscado=" + valorProcurado);
		
		// Realiza a busca sequencial
		long t1 = System.nanoTime();
		int i1 = busca(numeros,valorProcurado);
		long t2 = System.nanoTime();
		long t2t1 = t2-t1; 

		// Realiza a busca binaria
		long t3 = System.nanoTime();
		int i2 = buscaBinaria(numeros,valorProcurado);
		long t4 = System.nanoTime();
		long t4t3 = t4-t3;

		
		String ei1 = "Sim";
		if(i1 < 0) ei1 = "Nao";
		System.out.println("[Sequencial] Tempo=" + t2t1 + " Encontrou="+ ei1);
		
		String ei2 = "Sim";
		if(i2 < 0) ei2 = "Nao";
		System.out.println("[Binária] Tempo=" + t4t3 + " Encontrou="+ ei2);
	}

	public static int busca(int[] valores, int valorProcurado) {
		int i = 0;
		while(i < valores.length) {
			if(valores[i] == valorProcurado) {
				// Retorna indice se encontrar
				return i;
			} else {
				i++;
			}
		}

		// Retorna -1 se nao encontrar
		return -1;
	}
	
	public static int buscaBinaria(int[] valores, int valorProcurado) {

		// Obtem os valores iniciais dos indices
		int inicio = 0;
		int fim = valores.length - 1;

		do {
			// Calcula o centro do array
			int meio = (inicio + fim) / 2;

			// Se o valor for encontrado, retorna
			// o valor e finaliza a busca
			if(valores[meio] == valorProcurado) 
				return meio;

			// Se o valor procurado for menor que o
			// valor no centro atual da busca, atualiza
			// o indice final
			if(valorProcurado < valores[meio]) 
				fim = meio-1;
			else 
				// Caso contrario, atualiza o indice
				// que marca o inicio
				if(valorProcurado > valores[meio]) 
					inicio = meio+1;	

			// o while sera executado enquanto o 
			// indice inicio for menor ou igual ao fim
		} while(inicio <= fim);

		
		// Retorna -1 se nao encontrar
		return -1;
	}
}