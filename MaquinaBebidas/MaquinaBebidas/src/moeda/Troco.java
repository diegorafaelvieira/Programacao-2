package moeda;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Troco {

	//classe para fazer o troco minimo
	//N = troco
	//moedas é o array de moedas
	//qtd é outro array de moedas
	//arraylist de dinheiro
	public void diminuiMoedas(double N, double [] moedas, int [] qtd_Moedas,ArrayList<Dinheiro> moeda) {
		int i;
		double soma;
		i=0;
		soma = 0;
		while(i<5 && soma != N) {
			if((soma+moedas[i])<=N) {
				qtd_Moedas[i]++;
				soma += moedas[i];
			}
			else {
				i++;
			}
		}
		
		//como funciona ta aqui ok
		//altera array list de objetos moeda com as quantidade do array qtd_Moedas
		//o array qtd  em ordem decrescente de 1 real a >>> 5 centavos segue a ordem do array list
		//joga a qtd alterada nas moedas do array list moedas
		for (int k = 0; k < moedas.length; k++) {
			int cont_Moeda = moeda.get(k).getQtd();
			//verifica se tem algima moeda com qtd < ou igual a 0
			if(moeda.get(k).getQtd()>0) {
				moeda.get(k).setQtd(cont_Moeda-qtd_Moedas[k]);	
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Problemas com o Troco! Moeda de R$"+moeda.get(k).getValor()+" em falta!");
				k++;
				moeda.get(k).setQtd(cont_Moeda-qtd_Moedas[k]);
			}
		}	
		//limpa o array de qtd_moedas
		for (int j = 0; j < qtd_Moedas.length; j++) {
			qtd_Moedas[j] = 0;
		}
	}
}
