package exercicios;

import java.util.Scanner;



public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Crie um programa que leia os seguintes dados do usuário:
			a) Preço da gasolina (R$ por litro)
			b) Distância a ser percorrida em uma viagem (em quilômetros)
			c) Consumo médio do carro na estrada (em quilômetros por litro)
			d) Gasto com pedágios (em R$)
 		Informe para o usuário o custo total da viagem em R$.
		 */
		
		 //Declaração de variáveis
       
        double distancia;
        double litros;
        double valorLitro;
        double media;
        double pedagio;
        double gastoTotal;
        
        Scanner leitor = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Informe a distancia a ser percorrida:");
        distancia = leitor.nextDouble();
        System.out.print("Informe a quantidade de litros de combustivel:");
        litros = leitor.nextDouble();
        System.out.print("Informe o valor do litro de gasolina:");
        valorLitro = leitor.nextDouble();
        System.out.print("Informe o valor do pedágio:");
        pedagio = leitor.nextDouble();
        
        leitor.close();
        
        media = distancia/litros; //Fórmula - processamento
        gastoTotal = (litros * valorLitro) + pedagio;
                
        //Saida de dados
        System.out.println("A média de consumo eh " + media +" u.d./litros");
        System.out.println("O gasto total da viagem é de R$"+gastoTotal);
	        
     
	
	}

}
