package exercicio4;

public class Aluno {
	public String nome;
	public String curso;
	public String dataDeAdmiss�o;
	public String numeroMatricula;
	
	
	public void informacoes() {
		System.out.println("O nome do aluno � " + this.nome + " cursa " + this.curso + " possui data de admiss�o em "
	+ this.dataDeAdmiss�o + " e possui matr�cula n�mero " + this.numeroMatricula);
	}

}
