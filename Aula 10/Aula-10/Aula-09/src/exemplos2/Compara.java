package exemplos2;

public class Compara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l1 = new Livro();
		l1.autor = "Fulano";
		l1.titulo = "Java em 21 dias";
		
		Livro l2 = new Livro();
		l2.autor = "Fulano";
		l2.titulo = "Java em 21 dias";
		
		// comparar strings
		// l1 = l2;
		
		//comparando os dois objetos l1 e l2
		if(l1 == l2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		
	}

}
