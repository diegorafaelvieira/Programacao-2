package exercicio1b;

public class Bebida {
	public String tipo  ;
	public String marca ;
	public double preco;
	
	public void informacoes() {
		System.out.println("A bebida " + this.tipo + " da marca " + this.marca + " custa R$" + this.preco);
	}

}
