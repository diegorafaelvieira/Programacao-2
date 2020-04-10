package usuariosmaquina;

public class Administrador extends Pessoa{


	//atributos
	private String id;
	private String senha;
	
	//construtor
	
	public Administrador(String nomeCompleto, String dataNascimento, String telefone, String endereco, String id, String senha) {
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
