package exemplos2;

public class TesteFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeDaPessoa = "Joãozinho";
		
		Filme f1 = new Filme();
		f1.ano = 2017;
		f1.titulo = "Alien Covenant";
		
		f1.assistir(nomeDaPessoa);
		
		System.out.println(f1.getTituloFormatado());
		
		String r = f1.getTituloFormatado();  //imprime a mesma coisa do print anterior
		System.out.println(r);

	}

}
