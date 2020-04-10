package pacoteg;

public class Celular {
	private String modelo;
	private String marca;
	private double preco;
	
	//GET e SET
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
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
	
	//Metodo construtor
	public Celular (String mod,String marc,double p) {
		modelo = mod;
		marca = marc;
		preco = p;
	}
	
	public void informacoes() {
		System.out.println("O celular é do modelo "+this.modelo+" da marca "+this.marca+" e custa R$"+this.preco);
	}

	
}
