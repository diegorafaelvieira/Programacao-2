package exercicio4;

public class Aluno {
	public String nome;
	public String curso;
	public String dataDeAdmissão;
	public String numeroMatricula;
	
	
	public void informacoes() {
		System.out.println("O nome do aluno é " + this.nome + " cursa " + this.curso + " possui data de admissão em "
	+ this.dataDeAdmissão + " e possui matrícula número " + this.numeroMatricula);
	}

}
