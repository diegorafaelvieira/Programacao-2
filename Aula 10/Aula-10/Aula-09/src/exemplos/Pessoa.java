package exemplos;

public class Pessoa {
	//Atributos
	public String nome;
	public int idade;
	public String time;
	public String endereco;
	public String pais;
	
	//Métodos
	public void nascer() {
		this.nome = "Joãozinho";
		this.idade = 0;
		this.time = "Inter";
		this.endereco = "Rua ABC 123";
		this.pais = "Brasil";
	}
	
	public void falar(String frase) {
		System.out.println(this.nome + " falou:" + frase );
	}
	
	

}
