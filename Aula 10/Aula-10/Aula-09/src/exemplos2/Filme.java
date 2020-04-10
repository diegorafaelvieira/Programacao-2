package exemplos2;

public class Filme {
	public String titulo;
	public int ano;
	
	
	public void assistir(String nome) {
		System.out.println(nome + " foi assistir " + this.titulo + " do ano " + this.ano);
		
	}
	
	public String getTituloFormatado() {
		String r = "Titulo: " + this.titulo;
		return r;  //não colocar nada abaixo do return
	}
}
