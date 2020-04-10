package exercicio1c;



public class Empresa {
	
	
	public String nome;
	public String cidade;
	public int funcionarios;
	
	

	
	public void informacoes() {
		System.out.println("A empresa " + this.nome + " da cidade de " + this.cidade + " possui " + this.funcionarios + " funcionários");
	}
}
