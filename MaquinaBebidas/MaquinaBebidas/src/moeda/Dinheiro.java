package moeda;

public class Dinheiro  {

	//atributos
	private String tipo;
	private int qtd;
	private double valor;
	
	//construtor
	public Dinheiro(String tipo, int qtd, double valor) {
		super();
		this.tipo = tipo;
		this.qtd = qtd;
		this.valor = valor;
	}
   
	//GET SET
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
