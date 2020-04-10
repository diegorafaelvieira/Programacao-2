package aula04;

public class TesteTypecast {

	public static void main(String[] args) {
		int i = 10;
		
		float f = i;
		double d = i;
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		
		float f1 = 1.5f;
		double d1 = 2.7;
		
		//Apenas imprime a parte inteira do valor
		int i1 = (int)f1;
		int i2 = (int)d1;
		
		System.out.println(i1);
		System.out.println(i2);
		
	}

}
