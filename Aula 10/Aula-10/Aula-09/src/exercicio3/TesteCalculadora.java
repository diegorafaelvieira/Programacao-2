package exercicio3;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v1,v2,mostrar;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor");
		v1 = leitor.nextInt();
		
		System.out.print("Informe o primeiro valor");
		v2 = leitor.nextInt();
		
		Calculadora calcula = new Calculadora();
		mostrar = calcula.soma(v1, v2);
		System.out.print("A soma é:" + mostrar);
		mostrar = calcula.subtracao(v1, v2);
		System.out.print("A subtração é:" + mostrar);
		mostrar = calcula.multiplicacao(v1, v2);
		System.out.print("A multiplição é:" + mostrar);
		mostrar = calcula.divisao(v1, v2);
		System.out.print("A divisão é:" + mostrar);
		

	}

}
