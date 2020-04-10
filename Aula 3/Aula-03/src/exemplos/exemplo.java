package exemplos;

public class exemplo {

	//Exemplo brake
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i==5){
				continue;  //imprime pulando o 5 //brake para no 5º valor
			}
			System.out.println(i);
		}

	}

}
