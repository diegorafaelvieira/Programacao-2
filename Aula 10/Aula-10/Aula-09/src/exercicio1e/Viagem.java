package exercicio1e;

public class Viagem {
	public String origem;
	public String destino;
	public double valor;
	
	

	
	public void informacoes() {
		System.out.println("A viagem saindo de " + this.origem + " com destino a " + this.destino + " possui  o valor de R$" + this.valor);
	}

}
