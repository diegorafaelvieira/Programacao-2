package exercicios;

import java.util.Scanner;



public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Crie um programa que leia os seguintes dados do usu�rio:
			a) Pre�o da gasolina (R$ por litro)
			b) Dist�ncia a ser percorrida em uma viagem (em quil�metros)
			c) Consumo m�dio do carro na estrada (em quil�metros por litro)
			d) Gasto com ped�gios (em R$)
 		Informe para o usu�rio o custo total da viagem em R$.
		 */
		
		 //Declara��o de vari�veis
       
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
        System.out.print("Informe o valor do ped�gio:");
        pedagio = leitor.nextDouble();
        
        leitor.close();
        
        media = distancia/litros; //F�rmula - processamento
        gastoTotal = (litros * valorLitro) + pedagio;
                
        //Saida de dados
        System.out.println("A m�dia de consumo eh " + media +" u.d./litros");
        System.out.println("O gasto total da viagem � de R$"+gastoTotal);
	        
     
	
	}

}
