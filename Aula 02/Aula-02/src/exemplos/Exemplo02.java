package exemplos;

public class Exemplo02 {

	public static void main(String[] args) {
		byte b = 127;
		//byte gerou overflow acima de 127 (-128 até 127) b-- diminiu um valor de b
		b++;
		System.out.println(b);
		
		
		byte n1 = 10;
		short numero2 = 70;
		int i = 0;
		long var4 = 1000000l;
		System.out.println(n1);
		System.out.println(numero2);
		System.out.println(i);
		System.out.println(var4);
		
		
		float f1 = 19.9f;
		double var5 = 3.1415;
		System.out.println(f1);
		System.out.println(var5);
		
		
		boolean a = true;
		boolean d = false;
		char c = 'A';
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		
		//soma de inteiros
		int i1 = 25;
		int i2 = 75;
		int soma = i1 + i2;
		
		if(i1 == i2) {
			System.out.println("Iguais");
		} else if (i1 > i2) {
			System.out.println(i1);
		} else {
			System.out.println(i2);
		}
		
		
		 

	}

}
