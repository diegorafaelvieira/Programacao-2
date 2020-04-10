package pacotei;

public class Curso {
	private String nome;
	private int qtdAlunos;
	private int qtdSemestres;
	
	//GEt e NET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public int getQtdSemestres() {
		return qtdSemestres;
	}
	public void setQtdSemestres(int qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}
	
	//Metodo construtor
	public Curso(String n,int qtda,int qtds) {
		nome = n;
		qtdAlunos = qtda;
		qtdSemestres = qtds;
	}
	public void informacao() {
		System.out.println("O curso "+this.nome+" possuí "+this.qtdAlunos+" alunos e possuí " + this.qtdSemestres+ " semestres");
	}

}
