package pacoteb;

import java.util.Scanner;



public class TesteBebida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a marca da bebida:");
		String marca = leitor.nextLine();
		System.out.print("Informe o preço:");
		double preco = leitor.nextDouble();
		System.out.print("Informe a quantidade em estoque:");
		int quantidadeEstoque = leitor.nextInt();


		
		Bebida b1 = new Bebida();
		b1.setMarca(marca);
		b1.setPreco(preco);
		b1.setQuantidadeEstoque(quantidadeEstoque);
		b1.informacoes();
		
		leitor.close();
		

	}

}
