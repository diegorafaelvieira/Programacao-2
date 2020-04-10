package pacoteb;

public class Bebida {
	private String marca;
	private double preco;
	private int quantidadeEstoque;
	
	//GET e SET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	//METODO CONSTRUTOR
	
	public void informacoes() {
		System.out.println("A bebida da marca "+ this.marca +" custa R$"+ this.preco + " e possui "+ this.quantidadeEstoque + " peças em estoque");
	}
	
	

}
