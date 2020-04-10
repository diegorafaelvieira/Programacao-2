package pacotec;

public class Empresa {
	private String nome;
	private String cidade;
	private int qtdFuncionarios;
	
	//GET e SET
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	
	public void informacoes() {
		System.out.println("A empresa " + this.nome + " localizada na cidade de " + this.cidade + " possui " + this.qtdFuncionarios + " funcionarios");
	}
	
}
