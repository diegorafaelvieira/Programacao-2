package exemplos;

import java.util.Random;

public class TesteRandom {

	public static void main(String[] args) {
		
		Random r = new Random();
		int x = r.nextInt(2);  //dois números são gerados (0 ou 1)  no caso seria o valor 2 - 1=(1 ou 0)
		
		System.out.println(x);
		
		
		for (int i = 0; i < 10; i++) {
			int x2 = 1 + r.nextInt(6); // para simular o uso de um dado de 6 lados
			System.out.println(x2);		
		}

	}

}
