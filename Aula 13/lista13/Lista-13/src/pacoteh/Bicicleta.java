package pacoteh;

public class Bicicleta {
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
	
	//METODO construtor
	public Bicicleta (String mod,String m,double p) {
		modelo = mod;
		marca  = m;
		preco = p;
	}
	
	public void informacoes() {
		System.out.println("A bicicleta de modelo "+this.modelo+" da marca "+this.marca+" custa R$ "+this.preco);
	}
	
}
