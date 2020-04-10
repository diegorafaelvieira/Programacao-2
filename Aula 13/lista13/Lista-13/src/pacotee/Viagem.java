package pacotee;

public class Viagem {
	private String saida;
	private String destino;
	private double preco;
	
	//GET e SET
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	//Metodo construtor
	public Viagem (String s,String d,double p) {
		saida = s;
		destino = d;
		preco = p;
	}
	
	public void imprimi() {
		System.out.println("A viagem tem saída de "+getSaida()+" com destino a "+getDestino()+" e custa R$ "+getPreco());
	}
	

}
