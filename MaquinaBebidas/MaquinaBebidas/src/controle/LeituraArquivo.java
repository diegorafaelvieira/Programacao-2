package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

import moeda.Dinheiro;
import usuariosmaquina.AbreMaquina;
import usuariosmaquina.Administrador;
import usuariosmaquina.Bebidas;
import usuariosmaquina.Funcionario;


public class LeituraArquivo {

	//metodo leitura bebidas
	public void leituraBebidas(ArrayList<Bebidas> registros) throws IOException {		
		//leitura de bebidas
		File arquivo = new File("Reg/RegistroBebidas/bebidas.txt");	
		FileReader leitor = new FileReader(arquivo);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 

		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String a1 [] = linha.split("/");
			Bebidas b1 = new Bebidas(a1[0],a1[1], Double.parseDouble(a1[2]),Integer.parseInt(a1[3]));
			registros.add(b1);
		}
		sr.close();
		leitor.close();

		System.out.println("Aqui Passou Pelo Metodo de Leitura txt Bebidas!");
	}
	
		//metodo leitura arquivo  logs admin
	public void leituraAdmin(ArrayList<Administrador> registros2)throws IOException {
		File arquivo2 = new File("Reg/RegistroAdministrador/administrador.txt");	
		FileReader leitor = new FileReader(arquivo2);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 

		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String a1 [] = linha.split("/");
			Administrador a = new Administrador(a1[0], a1[1], a1[2], a1[3], a1[4], a1[5]);
			registros2.add(a);
		}
		sr.close();
		ler.close();
		System.out.println("Aqui Passou Pelo Metodo de Leitura txt Login Admin!");
	}
	

	


	//metodo leitura arquivo logs funcionario
	public void leituraFuncionario(ArrayList<Funcionario> registros3)throws IOException {
		File arquivo3 = new File("Reg/RegistroFuncionario/funcionario.txt");
		FileReader leitor = new FileReader(arquivo3);
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader ler = new BufferedReader(leitor);

		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String a1 [] = linha.split("/");
			Funcionario f = new Funcionario(a1[0],a1[1],a1[2],a1[3],a1[4],a1[5]);
			registros3.add(f);

		}
		sr.close();
		ler.close();
		System.out.println("Aqui passou Pelo Metodo de Leitura txt Login Funcionario!");
	}

	//metodo altera arquivo bebidas
	public void alteraBebidas(ArrayList<Bebidas> registros) throws IOException {
		File arquivo = new File("Reg/RegistroBebidas/bebidas.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);

		String conteudo = "";
		Locale.setDefault(Locale.US);
		for (int i = 0; i < registros.size(); i++) {
			conteudo = registros.get(i).getId()+"/"+registros.get(i).getNome()+"/"+String.format("%.2f", registros.get(i).getValor())+"/"+registros.get(i).getQuantidade()+"\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Passou Pelo Metodo de Editar txt Bebidas!");
	}
	
	
	//metodo altera arquivo funcionarios
	public void alteraFuncionarios(ArrayList<Funcionario> registros) throws IOException {
		File arquivo = new File("Reg/RegistroFuncionario/funcionario.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);

		String conteudo = "";
		Locale.setDefault(Locale.US);
		for (int i = 0; i < registros.size(); i++) {
			conteudo = registros.get(i).getId()+"/"+registros.get(i).getSenha()+"/"+registros.get(i).getNomeCompleto()+"/"+registros.get(i).getDataNascimento()+"/"+registros.get(i).getTelefone()+"/"+registros.get(i).getEndereco()+ "\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Passou Pelo Metodo de Editar txt Funcionários!");
	}
	
	
	
	
	//metodo altera arquivo admin
		public void alteraAdministrador(ArrayList<Administrador> registros) throws IOException {
			File arquivo = new File("Reg/RegistroAdministrador/administrador.txt");
			FileWriter escritor = new FileWriter(arquivo,false);
			BufferedWriter buffer = new BufferedWriter(escritor);

			String conteudo = "";
			Locale.setDefault(Locale.US);
			for (int i = 0; i < registros.size(); i++) {
				conteudo = registros.get(i).getNomeCompleto()+"/"+registros.get(i).getDataNascimento()+"/"+registros.get(i).getTelefone()+"/"+registros.get(i).getEndereco()+"/"+registros.get(i).getId()+"/"+registros.get(i).getSenha()+ "\n";
				buffer.write(conteudo);
			}
			buffer.close();
			escritor.close();
			System.out.println("Passou Pelo Metodo de Editar txt Admin!");
		}
	
	//depois coloca esse na parte de leitura ali em cima pra ficar organizado ok
	//leitura de moedas
	//metodo leitura arquivo  moedas
		public void leituraMoedas(ArrayList<Dinheiro> Regmoeda)throws IOException {
			File arquivo = new File("Reg/RegistroMoedas/moedas.txt");	
			FileReader leitor = new FileReader(arquivo);
			InputStreamReader sr = new InputStreamReader(System.in);   
			BufferedReader ler = new BufferedReader(leitor); 
			
			String linha = "";
			while((linha = ler.readLine())!=null) {
				String a1 [] = linha.split("/");
			    Dinheiro d = new Dinheiro(a1[0], Integer.parseInt(a1[1]), Double.parseDouble(a1[2]));   
				Regmoeda.add(d);
			}
			sr.close();
			ler.close();
			System.out.println("Passou Pelo Metodo de Leitura txt Moedas!");
		}

	
	//escrita de moedas
		//metodo altera arquivo de moedas
				public void alteraMoedas(ArrayList<Dinheiro> Regmoeda) throws IOException {
					File arquivo = new File("Reg/RegistroMoedas/moedas.txt");
					FileWriter escritor = new FileWriter(arquivo,false);
					BufferedWriter buffer = new BufferedWriter(escritor);
					
					String conteudo = "";
					Locale.setDefault(Locale.US);
					for (int i = 0; i < Regmoeda.size(); i++) {
					    conteudo = Regmoeda.get(i).getTipo()+"/"+Regmoeda.get(i).getQtd()+"/"+String.format("%.2f", Regmoeda.get(i).getValor())+"\n";
					    buffer.write(conteudo);
					}
					buffer.close();
					escritor.close();
					System.out.println("Passou Pelo Metodo de Editar txt moedas!");
				}		
				
	//aqui tambem coloca na ordem
				
	//leitura vendas
				//metodo leitura arquivo  vendas
				public void leituraVendas(double[]vendas)throws IOException {
					File arquivo4 = new File("Reg/RegistroVendas/vendas.txt");	
					FileReader leitor4 = new FileReader(arquivo4);
					InputStreamReader sr4 = new InputStreamReader(System.in);   
					BufferedReader ler4 = new BufferedReader(leitor4); 
					Locale.setDefault(Locale.US);
					
					String linha = " ";
					while((linha = ler4.readLine())!=null) {
						vendas[0] =  Double.parseDouble(linha);
					}
					
					sr4.close();
					ler4.close();
					System.out.println("Passou Pelo Metodo de Leitura txt vendas!");
				}		
				
				
				
				
				
				
				
				
	//escrita vendas			
				//metodo altera arquivo de vendas
				public void alteraVendas(double[]vendas) throws IOException {
					File arquivo = new File("Reg/RegistroVendas/vendas.txt");
					FileWriter escritor = new FileWriter(arquivo,false);
					BufferedWriter buffer = new BufferedWriter(escritor);
					
					String conteudo = "";
					Locale.setDefault(Locale.US);
					for (int i = 0; i < vendas.length; i++) {
						conteudo = String.valueOf(vendas[i]);
						buffer.write(conteudo);
					}
					buffer.close();
					escritor.close();
					System.out.println("Passou Pelo Metodo de Editar txt vendas!");
				}	
				
				
		//arrumar depois
				//leitura abre maquina
				//metodo leitura arquivo  abre maquina
				public void leituraAbre(ArrayList<AbreMaquina> registros)throws IOException {
					File arquivo4 = new File("Reg/RegistroAbreMaquina/abre.txt");	
					FileReader leitor4 = new FileReader(arquivo4);
					InputStreamReader sr4 = new InputStreamReader(System.in);   
					BufferedReader ler4 = new BufferedReader(leitor4); 
					Locale.setDefault(Locale.US);
					
					String linha = " ";
					while((linha = ler4.readLine())!=null) {
						String a1 [] = linha.split("/");
						AbreMaquina am = new AbreMaquina(a1[0], a1[1]);
						registros.add(am);
					}
					
					sr4.close();
					ler4.close();
					System.out.println("Passou Pelo Metodo de Leitura txt abre!");
				}	
				
				//escrita de abre
				//metodo altera arquivo de abre
						public void alteraAbre(ArrayList<AbreMaquina> registros) throws IOException {
							File arquivo = new File("Reg/RegistroAbreMaquina/abre.txt");
							FileWriter escritor = new FileWriter(arquivo,false);
							BufferedWriter buffer = new BufferedWriter(escritor);
							
							String conteudo = "";
							Locale.setDefault(Locale.US);
							for (int i = 0; i < registros.size(); i++) {
							    conteudo = registros.get(i).getNome()+"/"+registros.get(i).getHora()+"\n";
							    buffer.write(conteudo);
							}
							buffer.close();
							escritor.close();
							System.out.println("Passou Pelo Metodo de Editar txt abre!");
						}		
				
				
	
}
