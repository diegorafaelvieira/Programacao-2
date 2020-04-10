package usuariosmaquina;

public class Funcionario extends Pessoa{

	
	//atributos
	private String id;
	private String senha;
	
	//construtor
	public Funcionario( String id,String senha,String nomeCompleto, String dataNascimento, String telefone,
			String endereco) {
		super(nomeCompleto, dataNascimento, telefone, endereco);
		this.id = id;
		this.senha = senha;
	}

	//GET e SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	
	
}	
	
