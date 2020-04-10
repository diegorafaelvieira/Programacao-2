package telabebidas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.text.MaskFormatter;

import controle.LeituraArquivo;
import moeda.Dinheiro;
import moeda.Troco;
import usuariosmaquina.AbreMaquina;
import usuariosmaquina.Administrador;
import usuariosmaquina.Bebidas;
import usuariosmaquina.Funcionario;
import usuariosmaquina.Moedas;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;

public class TelaInicial {

	private JFrame frmAdministrador;
	private JPanel panel_Administrador;
	private JPanel panel_Funcionario;
	private int selecionaBebida = 0;
	double valorBebida = 0;
	double valorPago = 0;
	private JPanel panel_Menu;
	private JPanel panel_Consumidor;
	private JLabel lbl_ValTroco;
	private JLabel lbl_Total;
	private JButton btn_VoltarMenuFuncionario;
	private JButton btn_VoltarMenuAdministrador;
	private JButton btn_VoltarMenuConsumidor;
	private JLabel lbl_TotalMoedas;
	private int cont5 = 0;
	private int cont10 = 0;
	private int cont25 = 0;
	private int cont50 = 0;
	private int cont1 = 0;
	private double falta = 0;
	private JLabel lbl_PegueBebida;
	private ArrayList<Bebidas> regBebida =  new ArrayList<Bebidas>();
	private ArrayList<Administrador> regAdministrador = new ArrayList<Administrador>();
	private ArrayList<Funcionario> regFuncionario = new ArrayList<Funcionario>();
	private ArrayList<Dinheiro> regMoeda = new ArrayList<Dinheiro>();
	private ArrayList<AbreMaquina> registros = new ArrayList<AbreMaquina>();
	private double moedas [] = {1,0.50,0.25,0.10,0.05};
	private int qtd_Moedas [] = {0,0,0,0,0,0};
	private double [] vendas = new double[1];
	private double somaVendas = 0;
	private JTextField txtUsuarioAdministrador; 
	private JPasswordField passwordSenhaAdministrador;
	private JPanel panel_Do_Autorizado;
	private JPanel panel_ConsultaBebida;
	private JTextArea txtEstoque;
	private JPanel panel_CadastrarBebida;
	private JPanel panel_EditarBebida;
	private JPanel panel_CadastrarFuncionario;
	private JPanel panel_ConsultaFuncionario;
	private JPanel panel_EditarFuncionario;
	private JTextField txt_UsuarioFuncionario;
	private JPasswordField passwordSenhaFuncionario;
	private JTextArea txtConsultaFuncionario;
	private JTextField txt_EditaIdBebida;
	private JTextField txt_EditaNomeBebida;
	private JFormattedTextField txt_EditaValorBebida;
	private JTextField txt_InsereNomeFuncionarioCompleto;
	private JTextField txt_InsereFuncionarioSenha;
	private JTextField txt_InsereFuncionarioEndereco;
	private JTextField txt_InsereId;
	private JTextField txt_InsereNome;
	private JTextField txt_EditaFuncionarioSenha;
	private JTextField txt_EditaFuncionarioNome;
	private JTextField txt_EditaFuncionarioEndereco;
	private JTextField txt_EditaFuncionarioId;
	private JPanel panel_DeletaBebida;
	private JTextField txtIdParaEditarBebida;
	private JFormattedTextField txt_EditaFucnionarioDataNascimento;
	private JTextField txt_IdAltera;
	private JFormattedTextField txt_EditaFuncionarioTelefone;
	private JFormattedTextField txt_InsereFuncionarioDataNascimento;
	private JFormattedTextField txt_InsereFuncionarioTelefone;
	private JTextField txt_InsereFuncionarioId;
	private JButton btn_CadBebida;
	private JButton btn_CadFuncionario;
	private JButton btn_DeletarFuncionario;
	private JButton btn_ConsultaFuncionario;
	private JButton btn_DeletarBebida;
	private JButton btn_EditaFuncionario;
	private JButton btn_EditaBebida;
	private JButton btn_RetirarSaldo;
	private JButton btn_InserirSaldo;
	private JTextField txt_DeletaBebidaId;
	private JTextField txt_DeletarFuncionarioId;
	private JPanel panel_DeletaFuncionario;
	private JPanel panel_InsereMoeda;
	private JSpinner spinnerInsere5;
	private JSpinner spinnerInsere10;
	private JSpinner spinnerInsere25;
	private JSpinner spinnerInsere50;
	private JSpinner spinnerInsere1;
	private JPanel panel_RetiraSaldo;
	private JTextField txt_RetiraSaldo;
	private JTextArea txtConsultaAbreMaquina;
	private JPanel panel_ConsultaAbre;
	private JButton btn_ConsultarAbertura;
	private JPanel panel_RecuperaSenha;
	private JFormattedTextField txt_CellRecupera;
	private JTextField txt_RedefiniUsuarioAdmin;
	private JTextField txt_RedefiniSenhaAdmin;
	private JPanel panel_RedefinirSenha;
	private JPanel panel_ConsultaSaldo;
	private JTextField txtConsultaSaldo;
	private JButton btn_ConsultarSaldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmAdministrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public int getCont5() {
		return cont5;
	}



	public void setCont5(int cont5) {
		this.cont5 = cont5;
	}



	public int getCont10() {
		return cont10;
	}



	public void setCont10(int cont10) {
		this.cont10 = cont10;
	}



	public int getCont25() {
		return cont25;
	}



	public void setCont25(int cont25) {
		this.cont25 = cont25;
	}



	public int getCont50() {
		return cont50;
	}



	public void setCont50(int cont50) {
		this.cont50 = cont50;
	}



	public int getCont1() {
		return cont1;
	}



	public void setCont1(int cont1) {
		this.cont1 = cont1;
	}



	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public TelaInicial() throws IOException, ParseException {
		initialize();
		//aqui faz a leitura ao inciar o programa
		new LeituraArquivo().leituraBebidas(regBebida);
		new LeituraArquivo().leituraAdmin(regAdministrador);
		new LeituraArquivo().leituraFuncionario(regFuncionario);
		new LeituraArquivo().leituraMoedas(regMoeda);
		new LeituraArquivo().leituraVendas(vendas);
		new LeituraArquivo().leituraAbre(registros);
		somaVendas = vendas[0];
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmAdministrador = new JFrame();
		frmAdministrador.setForeground(Color.BLACK);
		frmAdministrador.setResizable(false);
		frmAdministrador.setTitle("Drink\u00B4Soft");
		frmAdministrador.setBounds(100, 100, 657, 564);
		frmAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministrador.getContentPane().setLayout(new CardLayout(0, 0));

		panel_Menu = new JPanel();
		frmAdministrador.getContentPane().add(panel_Menu, "name_1074864867302702");
		panel_Menu.setLayout(null);

		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Menu.setVisible(false);
				panel_Administrador.setVisible(true);
			}
		});
		btnAdministrador.setBounds(249, 167, 125, 50);
		panel_Menu.add(btnAdministrador);

		JButton btnConsumidor = new JButton("Consumidor");
		btnConsumidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Menu.setVisible(false);
				panel_Consumidor.setVisible(true);
			}
		});
		btnConsumidor.setBounds(249, 250, 125, 50);
		panel_Menu.add(btnConsumidor);

		JButton btnFuncionario = new JButton("Funcion\u00E1rio");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Menu.setVisible(false);
				panel_Funcionario.setVisible(true);
			}
		});
		btnFuncionario.setBounds(249, 340, 125, 50);
		panel_Menu.add(btnFuncionario);

		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo");
		lblSejaBemVindo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSejaBemVindo.setForeground(Color.RED);
		lblSejaBemVindo.setBounds(189, 62, 247, 37);
		panel_Menu.add(lblSejaBemVindo);

		JLabel lblSelecioneAOpo = new JLabel("Selecione a op\u00E7\u00E3o desejada");
		lblSelecioneAOpo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelecioneAOpo.setBounds(189, 123, 271, 34);
		panel_Menu.add(lblSelecioneAOpo);
		
		JLabel label_25 = new JLabel("");
		//label_25.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\logotipo.png"));
		label_25.setIcon(new ImageIcon("imagens\\logotipo.png"));
		label_25.setBounds(402, 436, 239, 78);
		panel_Menu.add(label_25);
		
		JLabel label_26 = new JLabel("SAC (51)36350000");
		label_26.setBounds(522, 510, 119, 14);
		panel_Menu.add(label_26);
		
		JLabel label_29 = new JLabel("");
		//label_29.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\Logo.jpeg"));
		label_29.setIcon(new ImageIcon("imagens\\Logo.jpeg"));
		label_29.setBounds(126, 415, 100, 99);
		panel_Menu.add(label_29);

		panel_Administrador = new JPanel();
		frmAdministrador.getContentPane().add(panel_Administrador, "name_1075019758948003");
		panel_Administrador.setLayout(null);

		JLabel lblBemVindoAdministrador = new JLabel("Bem vindo Administrador");
		lblBemVindoAdministrador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemVindoAdministrador.setBounds(209, 11, 190, 14);
		panel_Administrador.add(lblBemVindoAdministrador);

		btn_VoltarMenuAdministrador = new JButton("Voltar Menu");
		btn_VoltarMenuAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Menu.setVisible(true);
				panel_Administrador.setVisible(false);
			}
		});
		btn_VoltarMenuAdministrador.setBounds(24, 491, 119, 23);
		panel_Administrador.add(btn_VoltarMenuAdministrador);

		JLabel label_13 = new JLabel("");
		//label_13.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\usuario.png"));
		label_13.setIcon(new ImageIcon("imagens\\usuario.png"));
		label_13.setBounds(247, 58, 100, 100);
		panel_Administrador.add(label_13);

		JLabel label_14 = new JLabel("Usu\u00E1rio:");
		label_14.setBounds(275, 172, 59, 14);
		panel_Administrador.add(label_14);

		txtUsuarioAdministrador = new JTextField();
		txtUsuarioAdministrador.setColumns(10);
		txtUsuarioAdministrador.setBounds(199, 197, 200, 25);
		panel_Administrador.add(txtUsuarioAdministrador);

		JLabel label_15 = new JLabel("Senha:");
		label_15.setBounds(275, 233, 46, 14);
		panel_Administrador.add(label_15);

		passwordSenhaAdministrador = new JPasswordField();
		passwordSenhaAdministrador.setBounds(199, 258, 200, 25);
		panel_Administrador.add(passwordSenhaAdministrador);

		JButton btn_Limpar = new JButton("Limpar");
		btn_Limpar.addActionListener(new ActionListener() {
			//evento do botão para limpar os campos de login admin
			public void actionPerformed(ActionEvent e) {
				txtUsuarioAdministrador.setText("");
				passwordSenhaAdministrador.setText("");
			}
		});
		btn_Limpar.setBounds(258, 491, 119, 23);
		panel_Administrador.add(btn_Limpar);

		JButton btn_Logar = new JButton("Logar");
		btn_Logar.addActionListener(new ActionListener() {
			//evento botao logar
			public void actionPerformed(ActionEvent e) {
				//verificação de login do admin
				for (int i = 0; i < regAdministrador.size(); i++) {
					//aqui pega a senha do password e transforma em string
					// percorre o array e compara se o objeto admin com o id e senha é igual ao que esta nos campos
					String senha = new String(passwordSenhaAdministrador.getPassword());
					if((regAdministrador.get(i).getId().equals(txtUsuarioAdministrador.getText()))&& (regAdministrador.get(i).getSenha().equals(senha))){
						JOptionPane.showMessageDialog(null, "Logado");
						//aki abre a tela do admin se passar no login
						//ativa novamente os botoes restritos ao funcionario
						//pega hora e data sistema
					    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
					    Date date = new Date();
					    AbreMaquina adm = new AbreMaquina(regAdministrador.get(i).getId().toString(), dateFormat.format(date));
					    registros.add(adm);
					    //salva no txt abre
					    try {
							new LeituraArquivo().alteraAbre(registros);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					    
						btn_CadBebida.setEnabled(true);
						btn_CadFuncionario.setEnabled(true);
						btn_DeletarFuncionario.setEnabled(true);
						btn_ConsultaFuncionario.setEnabled(true);
						btn_DeletarBebida.setEnabled(true);
						btn_EditaFuncionario.setEnabled(true);
						btn_RetirarSaldo.setEnabled(true);
						btn_InserirSaldo.setEnabled(true);
						txt_EditaIdBebida.setEnabled(true);
						txt_EditaNomeBebida.setEnabled(true);
						txt_EditaValorBebida.setEnabled(true);
						btn_ConsultarAbertura.setEnabled(true);
						btn_ConsultarSaldo.setEnabled(true);
						//paineis
						panel_Administrador.setVisible(false);
						panel_Do_Autorizado.setVisible(true);
					}
					else {
						//senao login invalido
						JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
						break;
					}
				}
			}
		});
		btn_Logar.setBounds(490, 491, 119, 23);
		panel_Administrador.add(btn_Logar);
		
		JLabel label_30 = new JLabel("");
		//label_30.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\Logo.jpeg"));
		label_30.setIcon(new ImageIcon("imagens\\Logo.jpeg"));
		label_30.setBounds(79, 333, 100, 99);
		panel_Administrador.add(label_30);
		
		JLabel label_31 = new JLabel("");
		//label_31.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\logotipo.png"));
		label_31.setIcon(new ImageIcon("imagens\\logotipo.png"));
		label_31.setBounds(355, 354, 239, 78);
		panel_Administrador.add(label_31);
		
		JLabel label_32 = new JLabel("SAC (51)36350000");
		label_32.setBounds(475, 428, 119, 14);
		panel_Administrador.add(label_32);
		
		JButton btn_RecupereSuaSenha = new JButton("<html>Recuperar Senha</html>");
		btn_RecupereSuaSenha.addActionListener(new ActionListener() {
			//evento botão recupera senha
			public void actionPerformed(ActionEvent arg0) {
				panel_Administrador.setVisible(false);
				panel_RecuperaSenha.setVisible(true);
			}
		});
		btn_RecupereSuaSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_RecupereSuaSenha.setBounds(236, 316, 141, 27);
		panel_Administrador.add(btn_RecupereSuaSenha);

		panel_Funcionario = new JPanel();
		frmAdministrador.getContentPane().add(panel_Funcionario, "name_1075048199311700");
		panel_Funcionario.setLayout(null);

		JLabel lblBemVindoFuncionrio = new JLabel("Bem vindo Funcion\u00E1rio");
		lblBemVindoFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemVindoFuncionrio.setBounds(246, 11, 190, 14);
		panel_Funcionario.add(lblBemVindoFuncionrio);

		btn_VoltarMenuFuncionario = new JButton("Voltar Menu");
		btn_VoltarMenuFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Menu.setVisible(true);
				panel_Funcionario.setVisible(false);
			}
		});
		btn_VoltarMenuFuncionario.setBounds(42, 491, 119, 23);
		panel_Funcionario.add(btn_VoltarMenuFuncionario);

		JLabel label_12 = new JLabel("");
		//label_12.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\usuario.png"));
		label_12.setIcon(new ImageIcon("imagens\\usuario.png"));
		label_12.setBounds(279, 58, 100, 100);
		panel_Funcionario.add(label_12);

		JLabel label_16 = new JLabel("Usu\u00E1rio:");
		label_16.setBounds(307, 172, 59, 14);
		panel_Funcionario.add(label_16);

		txt_UsuarioFuncionario = new JTextField();
		txt_UsuarioFuncionario.setColumns(10);
		txt_UsuarioFuncionario.setBounds(231, 197, 200, 25);
		panel_Funcionario.add(txt_UsuarioFuncionario);

		JLabel label_17 = new JLabel("Senha:");
		label_17.setBounds(307, 233, 46, 14);
		panel_Funcionario.add(label_17);

		passwordSenhaFuncionario = new JPasswordField();
		passwordSenhaFuncionario.setBounds(231, 258, 200, 25);
		panel_Funcionario.add(passwordSenhaFuncionario);

		JButton btn_limpar = new JButton("Limpar");
		btn_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_UsuarioFuncionario.setText("");
				passwordSenhaFuncionario.setText("");
			}
		});
		btn_limpar.setBounds(279, 491, 119, 23);
		panel_Funcionario.add(btn_limpar);
		/////AQUI		
		JButton btn_logar = new JButton("Logar");
		btn_logar.addActionListener(new ActionListener() {
			//evento botao logar
			public void actionPerformed(ActionEvent e) {
				//verifica usuario e senha funcionario se batem com o txt
				int x = 0;
				for (int i = 0; i < regFuncionario.size(); i++) {
					String senha = new String(passwordSenhaFuncionario.getPassword());
					if((regFuncionario.get(i).getId().equals(txt_UsuarioFuncionario.getText()))&& (regFuncionario.get(i).getSenha().equals(senha))){
						JOptionPane.showMessageDialog(null, "Logado");
						//pega hora e data sistema
					    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //AQUI DA PRA PEGAR A ORDEM DA FILA
					    Date date = new Date();
					    AbreMaquina fun = new AbreMaquina(regFuncionario.get(i).getId(), dateFormat.format(date));
					    registros.add(fun);
					    //salva no txt abre
					    try {
							new LeituraArquivo().alteraAbre(registros);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//panels
						panel_Funcionario.setVisible(false);
						panel_Do_Autorizado.setVisible(true);
						//restriçoes funcionario o false desabilita o botão/ campos
						btn_CadBebida.setEnabled(false);
						btn_CadFuncionario.setEnabled(false);
						btn_DeletarFuncionario.setEnabled(false);
						btn_ConsultaFuncionario.setEnabled(false);
						btn_DeletarBebida.setEnabled(false);
						btn_EditaFuncionario.setEnabled(false);
						btn_RetirarSaldo.setEnabled(false);
						btn_InserirSaldo.setEnabled(false);
						btn_ConsultarAbertura.setEnabled(false);
						btn_ConsultarSaldo.setEnabled(false);
						txt_EditaIdBebida.setEnabled(false);
						txt_EditaNomeBebida.setEnabled(false);
						txt_EditaValorBebida.setEnabled(false);
						break;
					}
					else{
						x++;
					}
					
					if(x==regFuncionario.size()) {
						JOptionPane.showMessageDialog(null, "Erro");
						break;
					}
				}	
			}
		});
		btn_logar.setBounds(492, 491, 119, 23);
		panel_Funcionario.add(btn_logar);
		
		JLabel label_33 = new JLabel("");
		//label_33.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\Logo.jpeg"));
		label_33.setIcon(new ImageIcon("imagens\\Logo.jpeg"));
		label_33.setBounds(84, 354, 100, 99);
		panel_Funcionario.add(label_33);
		
		JLabel label_34 = new JLabel("");
		//label_34.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\logotipo.png"));
		label_34.setIcon(new ImageIcon("imagens\\logotipo.png"));
		label_34.setBounds(360, 375, 239, 78);
		panel_Funcionario.add(label_34);
		
		JLabel label_35 = new JLabel("SAC (51)36350000");
		label_35.setBounds(480, 449, 119, 14);
		panel_Funcionario.add(label_35);

		panel_Consumidor = new JPanel();
		frmAdministrador.getContentPane().add(panel_Consumidor, "name_1075476621397839");
		panel_Consumidor.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		panel.setBounds(387, 24, 239, 294);
		panel_Consumidor.add(panel);

		JLabel label_1 = new JLabel("Pagamento");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1.setBounds(60, 11, 134, 23);
		panel.add(label_1);

		JLabel label_2 = new JLabel("5 Centavos");
		label_2.setBounds(25, 70, 81, 14);
		panel.add(label_2);

		JSpinner spinner_5centavos = new JSpinner();
		spinner_5centavos.addChangeListener(new ChangeListener() {
			//evento sppiner cont 5
			public void stateChanged(ChangeEvent arg0) {
				setCont5(Integer.parseInt(spinner_5centavos.getValue().toString()));
				lbl_TotalMoedas.setText(String.format("%.2f",new Moedas(cont5, cont10, cont25, cont50, cont1).valorPago()));
			}
		});
		spinner_5centavos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_5centavos.setBounds(116, 67, 50, 20);
		panel.add(spinner_5centavos);


		JLabel label_3 = new JLabel("10 Centavos");
		label_3.setBounds(25, 101, 81, 14);
		panel.add(label_3);

		JSpinner spinner_10centavos = new JSpinner();
		spinner_10centavos.addChangeListener(new ChangeListener() {
			//evento sppiner cont 10
			public void stateChanged(ChangeEvent arg0) {
				setCont10(Integer.parseInt(spinner_10centavos.getValue().toString()));
				lbl_TotalMoedas.setText(String.format("%.2f",new Moedas(cont5, cont10, cont25, cont50, cont1).valorPago()));
			}
		});
		spinner_10centavos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_10centavos.setBounds(116, 98, 50, 20);
		panel.add(spinner_10centavos);

		JLabel label_4 = new JLabel("25 Centavos");
		label_4.setBounds(25, 134, 81, 14);
		panel.add(label_4);

		JSpinner spinner_25centavos = new JSpinner();
		spinner_25centavos.addChangeListener(new ChangeListener() {
			//evento spinner cont 25
			public void stateChanged(ChangeEvent e) {
				setCont25(Integer.parseInt(spinner_25centavos.getValue().toString()));
				lbl_TotalMoedas.setText(String.format("%.2f",new Moedas(cont5, cont10, cont25, cont50, cont1).valorPago()));
			}
		});
		spinner_25centavos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_25centavos.setBounds(116, 131, 50, 20);
		panel.add(spinner_25centavos);

		JLabel label_5 = new JLabel("50 Centavos");
		label_5.setBounds(25, 161, 81, 14);
		panel.add(label_5);

		JSpinner spinner_50centavos = new JSpinner();
		spinner_50centavos.addChangeListener(new ChangeListener() {
			//evento spinner cont 50
			public void stateChanged(ChangeEvent e) {
				setCont50(Integer.parseInt(spinner_50centavos.getValue().toString()));
				lbl_TotalMoedas.setText(String.format("%.2f",new Moedas(cont5, cont10, cont25, cont50, cont1).valorPago()));
			}
		});
		spinner_50centavos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_50centavos.setBounds(116, 158, 50, 20);
		panel.add(spinner_50centavos);

		JLabel label_6 = new JLabel("1 Real");
		label_6.setBounds(25, 192, 65, 14);
		panel.add(label_6);

		JSpinner spinner_1real = new JSpinner();
		spinner_1real.addChangeListener(new ChangeListener() {
			//evento cont 1
			public void stateChanged(ChangeEvent e) {
				setCont1(Integer.parseInt(spinner_1real.getValue().toString()));
				lbl_TotalMoedas.setText(String.format("%.2f",new Moedas(cont5, cont10, cont25, cont50, cont1).valorPago()));
			}
		});
		spinner_1real.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1real.setBounds(116, 189, 50, 20);
		panel.add(spinner_1real);

		JButton btn_Comprar = new JButton("Comprar");
		btn_Comprar.setForeground(Color.BLACK);
		btn_Comprar.setBackground(Color.GREEN);
		btn_Comprar.addActionListener(new ActionListener() {
			//evento do botão comprar
			public void actionPerformed(ActionEvent arg0) {
				//criado objeto da classe moeda para receber os parametros
				Moedas m1 = new Moedas(cont5, cont10, cont25, cont50, cont1);

				//Switch para escolha de cada bebida e mostrar valores de troco e afins
				switch (selecionaBebida) {
				case 0:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));  //modelo final
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAmarela.png"));
						lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;
				case 1:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAmarela.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;
				case 2:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAmarela.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAmarela.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 3:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaRoxa.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;
				case 4:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaRoxa.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;
				case 5:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaRoxa.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaRoxa.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 6:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVerde.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 7:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVerde.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 8:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVerde.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVerde.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;
				case 9:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVermelha.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 10:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVermelha.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 11:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaVermelha.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaVermelha.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;		
				case 12:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAzul.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 13:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAzul.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;	
				case 14:
					m1.devolverTroco(valorBebida, m1.valorPago());
					lbl_ValTroco.setText(String.format("%.2f",m1.getValorPago()));
					falta = m1.getValorFalta();
					if(falta==0){
						//aqui se não falta dinheiro quer dizer que vendeu certo
						//soma a venda da bebida ao total de vendas
	                	somaVendas += valorBebida;
						//altera a quantidade no txt
	                	int quantidade = regBebida.get(selecionaBebida).getQuantidade();
	                	quantidade--;
	                	regBebida.get(selecionaBebida).setQuantidade(quantidade);
	                	//altera txt bebida
	                	try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//lblPegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));  modelo final
						//lbl_PegueBebida.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\latinhaAzul.png"));
	                	lbl_PegueBebida.setIcon(new ImageIcon("imagens\\latinhaAzul.png"));
	                	lbl_ValTroco.setText(String.format("%.2f", m1.getValorTroco()));
					}
					else{
						JOptionPane.showMessageDialog(null, "Atenção Falta R$ "+String.format("%.2f", m1.getValorFalta()));
					}
					break;		
				default:
					JOptionPane.showMessageDialog(null,"Nenhuma Bebida Foi Selecionada!");
					break;
				}
				
				//final dos case
				//verificações depois que compra uma bebida
				//valor de somas das vendas contidas na variavel, váo para o array que será salvo no txt de vendas
				vendas[0] = somaVendas;
				try {
					new LeituraArquivo().alteraVendas(vendas);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			
			
				//aqui diminui as moedas caso haja troco
				//m1 é o objeto da classe moedas que pega o valor de troco para passar ao metodo
				if(m1.getValorTroco()> 0) {
					//altera a qtd de moedas da maquina
					double N = m1.getValorTroco();
					//metodo troco minimo, aviso problema com troco e alteração no arraylist moedas
					new Troco().diminuiMoedas(N, moedas, qtd_Moedas,regMoeda);
					
					//metodo de alterar arquivo txt moedas
					try {
						new LeituraArquivo().alteraMoedas(regMoeda); 
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				//verifica quantidade de latas em estoque
				if(regBebida.get(selecionaBebida).getQuantidade()>0 && regBebida.get(selecionaBebida).getQuantidade()<=3) {
					JOptionPane.showMessageDialog(null, "Bebida "+regBebida.get(selecionaBebida).getNome()+" abaixo  de 3 latas!");
				}
				
				//verifica os 200 reais de saldo
				if(vendas[0]>=200) {
					JOptionPane.showMessageDialog(null, "O Valor de Vendas é Igual ou Superior à R$200,00!");
				}
			}
		});
		btn_Comprar.setBounds(77, 220, 89, 23);
		panel.add(btn_Comprar);

		JButton btn_Cancelar = new JButton("Cancelar");
		btn_Cancelar.setForeground(Color.BLACK);
		btn_Cancelar.setBackground(Color.RED);
		btn_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = -1;
				spinner_5centavos.setValue(0);
				spinner_10centavos.setValue(0);
				spinner_25centavos.setValue(0);
				spinner_50centavos.setValue(0);
				spinner_1real.setValue(0);
				lbl_ValTroco.setText("0");
				lbl_Total.setText("0");


			}
		});
		btn_Cancelar.setBounds(77, 254, 89, 23);
		panel.add(btn_Cancelar);

		JLabel label11 = new JLabel("Total R$");
		label11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label11.setForeground(Color.RED);
		label11.setBounds(41, 45, 65, 14);
		panel.add(label11);

		//Falta exibir na interface ===== não sei como fazer
		lbl_TotalMoedas = new JLabel("0");
		lbl_TotalMoedas.setForeground(Color.RED);
		lbl_TotalMoedas.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_TotalMoedas.setBounds(116, 45, 78, 14);
		panel.add(lbl_TotalMoedas);

		JLabel label_7 = new JLabel("1");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(16, 135, 20, 14);
		panel_Consumidor.add(label_7);

		JLabel label_8 = new JLabel("2");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(16, 196, 20, 14);
		panel_Consumidor.add(label_8);

		JLabel label_9 = new JLabel("3");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(16, 275, 20, 14);
		panel_Consumidor.add(label_9);

		JLabel lbl_1 = new JLabel("TOTAL R$");
		lbl_1.setBounds(272, 49, 64, 14);
		panel_Consumidor.add(lbl_1);

		lbl_Total = new JLabel("0");
		lbl_Total.setBounds(272, 64, 64, 14);
		panel_Consumidor.add(lbl_Total);

		JLabel lbl_TotalOuTroco = new JLabel("TROCO R$");
		lbl_TotalOuTroco.setBounds(272, 106, 64, 14);
		panel_Consumidor.add(lbl_TotalOuTroco);

		lbl_ValTroco = new JLabel("0");
		lbl_ValTroco.setBounds(272, 121, 64, 14);
		panel_Consumidor.add(lbl_ValTroco);

		JButton btn_Amarelo1 = new JButton("");
		btn_Amarelo1.addActionListener(new ActionListener() {
			//evento botao 1 fila 1
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 0;
				 //o regBebida é teu arraylist de bebidas
				// ele faz um if que se esse array de bebidas pega a posição escolha
				// no caso aqui 0 que é a tua bebida na posição 0 do array
				//se a qtd dessa bebida 0 é igual a 0 ele exibe a mensagem e zera os label de total e spinner
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
				
			}
		});
		btn_Amarelo1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Amarelo1.setBackground(Color.YELLOW);
		btn_Amarelo1.setBounds(272, 190, 20, 20);
		panel_Consumidor.add(btn_Amarelo1);

		JButton btn_Roxo1 = new JButton("");
		btn_Roxo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 3;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Roxo1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Roxo1.setBackground(Color.MAGENTA);
		btn_Roxo1.setBounds(272, 209, 20, 20);
		panel_Consumidor.add(btn_Roxo1);

		JButton btn_Verde1 = new JButton("");
		btn_Verde1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 6;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Verde1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Verde1.setBackground(Color.GREEN);
		btn_Verde1.setBounds(272, 231, 20, 20);
		panel_Consumidor.add(btn_Verde1);

		JButton btn_Vermelho1 = new JButton("");
		btn_Vermelho1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 9;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Vermelho1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Vermelho1.setBackground(Color.RED);
		btn_Vermelho1.setBounds(272, 250, 20, 20);
		panel_Consumidor.add(btn_Vermelho1);

		JButton btn_Azul1 = new JButton("");
		btn_Azul1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 12;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Azul1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Azul1.setBackground(Color.CYAN);
		btn_Azul1.setBounds(272, 269, 20, 20);
		panel_Consumidor.add(btn_Azul1);

		JButton btn_Azul2 = new JButton("");
		btn_Azul2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 13;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Azul2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Azul2.setBackground(Color.CYAN);
		btn_Azul2.setBounds(294, 269, 20, 20);
		panel_Consumidor.add(btn_Azul2);

		JButton btn_Vermelho2 = new JButton("");
		btn_Vermelho2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 10;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Vermelho2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Vermelho2.setBackground(Color.RED);
		btn_Vermelho2.setBounds(294, 250, 20, 20);
		panel_Consumidor.add(btn_Vermelho2);

		JButton btn_Verde2 = new JButton("");
		btn_Verde2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 7;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Verde2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Verde2.setBackground(Color.GREEN);
		btn_Verde2.setBounds(294, 231, 20, 20);
		panel_Consumidor.add(btn_Verde2);

		JButton btn_Roxo2 = new JButton("");
		btn_Roxo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 4;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Roxo2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Roxo2.setBackground(Color.MAGENTA);
		btn_Roxo2.setBounds(294, 209, 20, 20);
		panel_Consumidor.add(btn_Roxo2);

		JButton btn_Amarelo2 = new JButton("");
		btn_Amarelo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 1;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Amarelo2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Amarelo2.setBackground(Color.YELLOW);
		btn_Amarelo2.setBounds(294, 190, 20, 20);
		panel_Consumidor.add(btn_Amarelo2);

		JButton btn_Amarelo3 = new JButton("");
		btn_Amarelo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 2;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Amarelo3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Amarelo3.setBackground(Color.YELLOW);
		btn_Amarelo3.setBounds(316, 190, 20, 20);
		panel_Consumidor.add(btn_Amarelo3);

		JButton btn_Roxo3 = new JButton("");
		btn_Roxo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 5;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Roxo3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Roxo3.setBackground(Color.MAGENTA);
		btn_Roxo3.setBounds(316, 209, 20, 20);
		panel_Consumidor.add(btn_Roxo3);

		JButton btn_Verde3 = new JButton("");
		btn_Verde3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 8;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Verde3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Verde3.setBackground(Color.GREEN);
		btn_Verde3.setBounds(316, 231, 20, 20);
		panel_Consumidor.add(btn_Verde3);

		JButton btn_Azul3 = new JButton("");
		btn_Azul3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 14;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Azul3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Azul3.setBackground(Color.CYAN);
		btn_Azul3.setBounds(316, 269, 20, 20);
		panel_Consumidor.add(btn_Azul3);

		JButton btn_Vermelho3 = new JButton("");
		btn_Vermelho3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionaBebida = 11;
				 //verifica se tem bebida no estoque
                if(regBebida.get(selecionaBebida).getQuantidade() == 0) {
                	JOptionPane.showMessageDialog(null, "Esta bebida não está disponível!");
    				lbl_TotalMoedas.setText("0.00");
    				spinner_5centavos.setValue(0);
    				spinner_10centavos.setValue(0);
    				spinner_25centavos.setValue(0);
    				spinner_50centavos.setValue(0);
    				spinner_1real.setValue(0);
                }
                else{
                	//aqui o valor da bebida recebe o getValor() do array de bebidas na posição escolhida
				// selecionaBebida como indice de busca
				valorBebida = regBebida.get(selecionaBebida).getValor();
				lbl_Total.setText(String.format("%.2f", valorBebida));
                }
			}
		});
		btn_Vermelho3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_Vermelho3.setBackground(Color.RED);
		btn_Vermelho3.setBounds(316, 250, 20, 20);
		panel_Consumidor.add(btn_Vermelho3);

		JLabel label_10 = new JLabel("1    2    3");
		label_10.setBounds(279, 174, 46, 14);
		panel_Consumidor.add(label_10);

		btn_VoltarMenuConsumidor = new JButton("Sair");
		btn_VoltarMenuConsumidor.setForeground(Color.BLACK);
		btn_VoltarMenuConsumidor.setBackground(Color.ORANGE);
		btn_VoltarMenuConsumidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Menu.setVisible(true);
				panel_Consumidor.setVisible(false);
			}
		});
		btn_VoltarMenuConsumidor.setBounds(454, 329, 119, 23);
		panel_Consumidor.add(btn_VoltarMenuConsumidor);

		lbl_PegueBebida = new JLabel("");
		lbl_PegueBebida.addMouseListener(new MouseAdapter() {
			@Override
			//evento label pegar lata
			public void mouseClicked(MouseEvent arg0) {
				//aqui vamos zerar a maquina
				lbl_PegueBebida.setIcon(null);
				lbl_Total.setText("0");
				lbl_ValTroco.setText("0");
				lbl_TotalMoedas.setText("0");
				spinner_5centavos.setValue(0);
				spinner_10centavos.setValue(0);
				spinner_25centavos.setValue(0);
				spinner_50centavos.setValue(0);
				spinner_1real.setValue(0);
			}
		});
		lbl_PegueBebida.setBounds(96, 397, 89, 36);
		panel_Consumidor.add(lbl_PegueBebida);

		JLabel label = new JLabel("");
		//label.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\Maquina2.0.png"));
		label.setIcon(new ImageIcon("imagens\\Maquina2.0.png"));
		label.setBounds(0, -11, 364, 520);
		panel_Consumidor.add(label);

		JLabel label_11 = new JLabel("");
		//label_11.setIcon(new ImageIcon("C:\\Users\\DIEGO\\Desktop\\Workspace\\MaquinaBebidas\\imagens\\logotipo.png"));
		label_11.setIcon(new ImageIcon("imagens\\logotipo.png"));
		label_11.setBounds(387, 397, 239, 78);
		panel_Consumidor.add(label_11);
		
		JLabel lblSac = new JLabel("SAC (51)36350000");
		lblSac.setBounds(507, 471, 119, 14);
		panel_Consumidor.add(lblSac);
		
		JLabel lblObrigadoPelaPreferncia = new JLabel("Obrigado pela prefer\u00EAncia ");
		lblObrigadoPelaPreferncia.setForeground(Color.RED);
		lblObrigadoPelaPreferncia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObrigadoPelaPreferncia.setBounds(426, 363, 187, 23);
		panel_Consumidor.add(lblObrigadoPelaPreferncia);

		panel_Do_Autorizado = new JPanel();
		frmAdministrador.getContentPane().add(panel_Do_Autorizado, "name_177212011598851");
		panel_Do_Autorizado.setLayout(null);

		JLabel lblVoceEstaNa = new JLabel("SELECIONE A OP\u00C7\u00C3O DESEJADA");
		lblVoceEstaNa.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblVoceEstaNa.setBounds(162, 28, 318, 27);
		panel_Do_Autorizado.add(lblVoceEstaNa);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			//evento botao sair da area admin
			public void actionPerformed(ActionEvent e) {
				//quando sai limpa os campos de usuario admin
				//txtConsultaFuncionario.setText("");
				passwordSenhaFuncionario.setText("");
				txtUsuarioAdministrador.setText("");
				passwordSenhaAdministrador.setText("");
				txt_UsuarioFuncionario.setText("");
				passwordSenhaFuncionario.setText("");
				panel_Do_Autorizado.setVisible(false);
				panel_Menu.setVisible(true);
			}
		});
		btnSair.setBounds(286, 491, 89, 23);
		panel_Do_Autorizado.add(btnSair);

		btn_CadBebida = new JButton("Cadastrar Bebida");
		btn_CadBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// mostra o painel para cadastrar bebida
				panel_Do_Autorizado.setVisible(false);
				panel_CadastrarBebida.setVisible(true);
			}
		});
		btn_CadBebida.setBounds(87, 77, 133, 71);
		panel_Do_Autorizado.add(btn_CadBebida);

		btn_CadFuncionario = new JButton("<html>Cadastrar Funcion\u00E1rio</html>");
		btn_CadFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostra o painel para cadastrar o funcionario
				panel_Do_Autorizado.setVisible(false);
				panel_CadastrarFuncionario.setVisible(true);
			}
		});
		btn_CadFuncionario.setBounds(87, 187, 133, 71);
		panel_Do_Autorizado.add(btn_CadFuncionario);

		JButton btn_ConsultaBebida = new JButton("Consultar Bebida");
		btn_ConsultaBebida.addActionListener(new ActionListener() {
			//evento botão consulta bebida
			public void actionPerformed(ActionEvent e) {
				//percorre array de bebidas
				for (int i = 0; i < regBebida.size(); i++) {
					//pega o que ta no array bebidas e joga no campo consulta igual quando printamos usando um for para percorrer
					txtEstoque.setText("/"+regBebida.get(i).getId()+"/"+regBebida.get(i).getNome()+"/"+regBebida.get(i).getValor()+"/"+regBebida.get(i).getQuantidade()+"/\n"+txtEstoque.getText());
				}
				//aqui temos a abertura do painel de consulta ao clicar no botao consultar bebida
				panel_Do_Autorizado.setVisible(false);
				panel_ConsultaBebida.setVisible(true);
			}
		});
		btn_ConsultaBebida.setBounds(265, 77, 133, 71);
		panel_Do_Autorizado.add(btn_ConsultaBebida);

		btn_ConsultaFuncionario = new JButton("<html>Consultar Funcion\u00E1rio</html>");
		btn_ConsultaFuncionario.addActionListener(new ActionListener() {
			//evento botão consulta funcionario
			public void actionPerformed(ActionEvent e) {
				//percorre array de funcionarios
				for (int i = 0; i < regFuncionario.size(); i++) {
					//pega o que ta no array funcionarios e joga no campo consulta igual quando printamos usando um for para percorrer
					txtConsultaFuncionario.setText("/"+regFuncionario.get(i).getId()+"/"+regFuncionario.get(i).getSenha()+"/"+regFuncionario.get(i).getNomeCompleto()+"/"+regFuncionario.get(i).getDataNascimento()+"/"+regFuncionario.get(i).getTelefone()+"/"+regFuncionario.get(i).getEndereco()+" \n"+txtConsultaFuncionario.getText());
				}
				//aqui temos a abertura do painel de consulta ao clicar no botao consultar funcionario
				panel_ConsultaFuncionario.setVisible(true);
				panel_Do_Autorizado.setVisible(false);
			}
		});
		btn_ConsultaFuncionario.setBounds(265, 187, 133, 71);
		panel_Do_Autorizado.add(btn_ConsultaFuncionario);

		btn_EditaBebida = new JButton("Editar Bebida");
		btn_EditaBebida.addActionListener(new ActionListener() {
			// entra no menu para editar as bebidas
			public void actionPerformed(ActionEvent e) {
				panel_Do_Autorizado.setVisible(false);
				panel_EditarBebida.setVisible(true);
			}
		});
		btn_EditaBebida.setBounds(432, 77, 133, 71);
		panel_Do_Autorizado.add(btn_EditaBebida);

		btn_EditaFuncionario = new JButton("<html>Editar Funcion\u00E1rio</html>");
		btn_EditaFuncionario.addActionListener(new ActionListener() {
			// entrar no menu para editar o funcionario
			public void actionPerformed(ActionEvent e) {
				panel_Do_Autorizado.setVisible(false);
				panel_EditarFuncionario.setVisible(true);
			}
		});
		btn_EditaFuncionario.setBounds(432, 187, 133, 71);
		panel_Do_Autorizado.add(btn_EditaFuncionario);
		
		btn_DeletarFuncionario = new JButton("<html>Deletar Funcion\u00E1rio</html>");
		btn_DeletarFuncionario.addActionListener(new ActionListener() {
			//evento abre tela deleta funcionário
			public void actionPerformed(ActionEvent e) {
				panel_Do_Autorizado.setVisible(false);
				panel_DeletaFuncionario.setVisible(true);
			}
		});
		btn_DeletarFuncionario.setBounds(87, 292, 133, 71);
		panel_Do_Autorizado.add(btn_DeletarFuncionario);
		
		btn_DeletarBebida = new JButton("<html>Deletar Bebida</html>");
		btn_DeletarBebida.addActionListener(new ActionListener() {
			//entra no painel deletar bebida
			public void actionPerformed(ActionEvent e) {
				panel_Do_Autorizado.setVisible(false);
				panel_DeletaBebida.setVisible(true);
			}
		});
		btn_DeletarBebida.setBounds(265, 292, 133, 71);
		panel_Do_Autorizado.add(btn_DeletarBebida);
		
		btn_RetirarSaldo = new JButton("<html>Retirar Saldo</html>");
		btn_RetirarSaldo.addActionListener(new ActionListener() {
			//entra no menu retira saldo
			public void actionPerformed(ActionEvent e) {
				panel_Do_Autorizado.setVisible(false);
				panel_RetiraSaldo.setVisible(true);
			}
		});
		btn_RetirarSaldo.setBounds(432, 292, 133, 71);
		panel_Do_Autorizado.add(btn_RetirarSaldo);
		
		btn_InserirSaldo = new JButton("<html>Inserir Saldo</html>");
		btn_InserirSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Do_Autorizado.setVisible(false);
				panel_InsereMoeda.setVisible(true);
			}
		});
		btn_InserirSaldo.setBounds(432, 394, 133, 71);
		panel_Do_Autorizado.add(btn_InserirSaldo);
		
		btn_ConsultarAbertura = new JButton("<html>Consultar Abertura</html>");
		btn_ConsultarAbertura.addActionListener(new ActionListener() {
			//entra na tela de consulta de abertura da máquina
			public void actionPerformed(ActionEvent e) {
				
				//percorre array de bebidas
				for (int i = 0; i < registros.size(); i++) {
					//pega o que ta no array bebidas e joga no campo consulta igual quando printamos usando um for para percorrer
					txtConsultaAbreMaquina.setText("/"+registros.get(i).getNome()+"/"+registros.get(i).getHora()+"/\n"+txtConsultaAbreMaquina.getText());
				}
				panel_Do_Autorizado.setVisible(false);
				panel_ConsultaAbre.setVisible(true);
			}
		});
		btn_ConsultarAbertura.setBounds(265, 394, 133, 71);
		panel_Do_Autorizado.add(btn_ConsultarAbertura);
		
		btn_ConsultarSaldo = new JButton("<html>Consultar Saldo</html>");
		btn_ConsultarSaldo.addActionListener(new ActionListener() {
			//Entrar na consulta saldo
			public void actionPerformed(ActionEvent arg0) {
				txtConsultaSaldo.setText(String.format("%.2f",vendas[0] ));
				panel_Do_Autorizado.setVisible(false);
				panel_ConsultaSaldo.setVisible(true);
			}
		});
		btn_ConsultarSaldo.setBounds(87, 394, 133, 71);
		panel_Do_Autorizado.add(btn_ConsultarSaldo);

		panel_ConsultaBebida = new JPanel();
		frmAdministrador.getContentPane().add(panel_ConsultaBebida, "name_179674197694324");
		panel_ConsultaBebida.setLayout(null);

		JLabel lblBebidasEmEstoque = new JLabel("BEBIDAS EM ESTOQUE");
		lblBebidasEmEstoque.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblBebidasEmEstoque.setBounds(217, 55, 232, 14);
		panel_ConsultaBebida.add(lblBebidasEmEstoque);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 127, 502, 279);
		panel_ConsultaBebida.add(scrollPane);

		txtEstoque = new JTextArea();
		scrollPane.setViewportView(txtEstoque);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			//botao volta para o painel de menu admin
			public void actionPerformed(ActionEvent e) {
				//limpa o campo de consulta
				txtEstoque.setText("");
				panel_ConsultaBebida.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btnVoltar.setBounds(293, 463, 89, 23);
		panel_ConsultaBebida.add(btnVoltar);

		JLabel lbl_idnomevalorquatidade = new JLabel("/ID/NOME/VALOR/QUANTIDADE/");
		lbl_idnomevalorquatidade.setFont(new Font("Arial Black", Font.BOLD, 12));
		lbl_idnomevalorquatidade.setBounds(217, 103, 247, 14);
		panel_ConsultaBebida.add(lbl_idnomevalorquatidade);

		panel_CadastrarBebida = new JPanel();
		frmAdministrador.getContentPane().add(panel_CadastrarBebida, "name_181484120525560");
		panel_CadastrarBebida.setLayout(null);

		JLabel lblAdicioneAsBebidas = new JLabel("CADASTRO DE BEBIDAS");
		lblAdicioneAsBebidas.setFont(new Font("Arial", Font.BOLD, 14));
		lblAdicioneAsBebidas.setBounds(203, 11, 165, 25);
		panel_CadastrarBebida.add(lblAdicioneAsBebidas);

		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.addActionListener(new ActionListener() {
			//botão volta para o painel menu admin
			public void actionPerformed(ActionEvent e) {
				//limpa os campos 
				panel_Do_Autorizado.setVisible(true);
				panel_CadastrarBebida.setVisible(false);
			}
		});
		btnVoltar_1.setBounds(279, 491, 89, 23);
		panel_CadastrarBebida.add(btnVoltar_1);
		
		JLabel lblId_1 = new JLabel("ID:");
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId_1.setBounds(180, 100, 34, 14);
		panel_CadastrarBebida.add(lblId_1);
		
		txt_InsereId = new JTextField();
		txt_InsereId.setBounds(224, 98, 109, 20);
		panel_CadastrarBebida.add(txt_InsereId);
		txt_InsereId.setColumns(10);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome_1.setBounds(163, 175, 46, 14);
		panel_CadastrarBebida.add(lblNome_1);
		
		txt_InsereNome = new JTextField();
		txt_InsereNome.setBounds(224, 173, 200, 20);
		panel_CadastrarBebida.add(txt_InsereNome);
		txt_InsereNome.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreo.setBounds(163, 245, 46, 14);
		panel_CadastrarBebida.add(lblPreo);
		
		JLabel lblQuantidade_1 = new JLabel("Quantidade:");
		lblQuantidade_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade_1.setBounds(143, 305, 85, 14);
		panel_CadastrarBebida.add(lblQuantidade_1);
		
		JSpinner spinner_InsereQtdBebida = new JSpinner();
		spinner_InsereQtdBebida.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_InsereQtdBebida.setBounds(224, 303, 46, 20);
		panel_CadastrarBebida.add(spinner_InsereQtdBebida);
		
		//insere o preço no formato com 2 casas antes e depois da vírgula
		MaskFormatter format2 = new MaskFormatter("##.##");	
		JFormattedTextField txt_InserePreco = new JFormattedTextField(format2);
		txt_InserePreco.setBounds(224, 243, 65, 20);
		panel_CadastrarBebida.add(txt_InserePreco);
		
		JButton button_2 = new JButton("Salvar");
		button_2.addActionListener(new ActionListener() {
			//cadastra nova bebida
			public void actionPerformed(ActionEvent e) {
				//verifica se o ID é nulo
				if((txt_InsereId.getText().equals(""))) {
						JOptionPane.showMessageDialog(null, "Insira um ID. Campo Obrigatório!");		
				}
				
				//senão cadastra bebida
				else {
					//antes verifica se o id não existe
					int i = 0;
					while(i < regBebida.size()) {
						if(txt_InsereId.getText().equals(regBebida.get(i).getId())){
							JOptionPane.showMessageDialog(null, "ID inserido já existe! Use outro!");
							break;
						}
						else if(!txt_InsereId.getText().equals(regBebida.get(i).getId())){
							i++;
							if(i==regBebida.size()) {
								JOptionPane.showMessageDialog(null, "Nova Bebida Cadastrada com Sucesso!");
								Bebidas b1 = new Bebidas(txt_InsereId.getText(),txt_InsereNome.getText(), Double.parseDouble(txt_InserePreco.getText()),Integer.parseInt(spinner_InsereQtdBebida.getValue().toString()));
								regBebida.add(b1);
								//cadastra bebida no txt
								try {
									new LeituraArquivo().alteraBebidas(regBebida);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								break;
							}
						}
					}					
				}		
			}
		});
		button_2.setBounds(349, 402, 89, 23);
		panel_CadastrarBebida.add(button_2);
		
		JButton button_3 = new JButton("Limpar");
		button_3.addActionListener(new ActionListener() {
			//aqui limpa os valores 
			public void actionPerformed(ActionEvent e) {
				txt_InsereId.setText("");
				txt_InsereNome.setText("");
				txt_InserePreco.setText("");
				spinner_InsereQtdBebida.setValue(0);
			}
		});
		button_3.setBounds(203, 402, 89, 23);
		panel_CadastrarBebida.add(button_3);

		panel_EditarBebida = new JPanel();
		frmAdministrador.getContentPane().add(panel_EditarBebida, "name_182607694202421");
		panel_EditarBebida.setLayout(null);

		JLabel lblEditarBebida = new JLabel("EDITAR BEBIDA");
		lblEditarBebida.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblEditarBebida.setBounds(233, 11, 156, 14);
		panel_EditarBebida.add(lblEditarBebida);

		JButton btnVoltar_2 = new JButton("Voltar");
		btnVoltar_2.addActionListener(new ActionListener() {
			//botão volta para o painel menu admin
			public void actionPerformed(ActionEvent e) {
				//limpa os campos
				panel_Do_Autorizado.setVisible(true);
				panel_EditarBebida.setVisible(false);
			}
		});
		btnVoltar_2.setBounds(300, 491, 89, 23);
		panel_EditarBebida.add(btnVoltar_2);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblId.setBounds(247, 128, 46, 14);
		panel_EditarBebida.add(lblId);
		
		txt_EditaIdBebida = new JTextField();
		txt_EditaIdBebida.setBounds(284, 126, 86, 20);
		panel_EditarBebida.add(txt_EditaIdBebida);
		txt_EditaIdBebida.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNome.setBounds(224, 196, 69, 14);
		panel_EditarBebida.add(lblNome);
		
		txt_EditaNomeBebida = new JTextField();
		txt_EditaNomeBebida.setBounds(284, 194, 163, 20);
		panel_EditarBebida.add(txt_EditaNomeBebida);
		txt_EditaNomeBebida.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblValor.setBounds(224, 261, 52, 14);
		panel_EditarBebida.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblQuantidade.setBounds(182, 354, 92, 14);
		panel_EditarBebida.add(lblQuantidade);
		
		JSpinner spinner_EditaQuantidadeBebida = new JSpinner();
		spinner_EditaQuantidadeBebida.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_EditaQuantidadeBebida.setBounds(284, 352, 45, 20);
		panel_EditarBebida.add(spinner_EditaQuantidadeBebida);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//aqui zera os atributos da edição de bebidas
				txt_EditaIdBebida.setText("");
				txt_EditaNomeBebida.setText("");
				txt_EditaValorBebida.setText("");
				spinner_EditaQuantidadeBebida.setValue(0);
			}
		});
		btnLimpar.setBounds(212, 433, 89, 23);
		panel_EditarBebida.add(btnLimpar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			//evento salvar edição bebida
		
			public void actionPerformed(ActionEvent arg0) {
				//alterar arquivo txt bebida
					for (int i = 0; i < regBebida.size(); i++) {							
						//verifica se encontra bebida a alterar
						if(regBebida.get(i).getId().equals(String.format("%s",txtIdParaEditarBebida.getText()))) {
							if(!txt_EditaIdBebida.getText().equals("")) {
								regBebida.get(i).setId(txt_EditaIdBebida.getText());
							}
							if(!txt_EditaNomeBebida.getText().equals("")) {
								regBebida.get(i).setNome(txt_EditaNomeBebida.getText());
							}
							if(!txt_EditaValorBebida.getText().equals("  .  ")) {
								regBebida.get(i).setValor(Double.parseDouble(txt_EditaValorBebida.getText()));
							}
							if(Integer.parseInt(spinner_EditaQuantidadeBebida.getValue().toString()) != 0) {
								regBebida.get(i).setQuantidade(Integer.parseInt(spinner_EditaQuantidadeBebida.getValue().toString()));
							}
							
							
							//altera txt bebidas
							try {
								new LeituraArquivo().alteraBebidas(regBebida);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							JOptionPane.showMessageDialog(null, "Registro da Bebida Alterado Com Sucesso!");
						}
						//senao diz q n encontrou
						else {
							i++;
							if(i==regBebida.size()) {
								JOptionPane.showMessageDialog(null, "Bebida não Encontrada!");
							}
					}
						
				}
			}
		});
		btnSalvar.setBounds(358, 433, 89, 23);
		panel_EditarBebida.add(btnSalvar);
		
		MaskFormatter format = new MaskFormatter("##.##");
		txt_EditaValorBebida = new JFormattedTextField(format);
		txt_EditaValorBebida.setBounds(284, 259, 79, 20);
		panel_EditarBebida.add(txt_EditaValorBebida);
		
		JLabel label_24 = new JLabel("ID :");
		label_24.setFont(new Font("Arial Black", Font.BOLD, 12));
		label_24.setBounds(247, 54, 46, 14);
		panel_EditarBebida.add(label_24);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 36, 641, 5);
		panel_EditarBebida.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 83, 641, 5);
		panel_EditarBebida.add(separator_1);
		
		JLabel lblBebidaEditar = new JLabel("Bebida \u00E0 Editar:");
		lblBebidaEditar.setBounds(71, 55, 156, 14);
		panel_EditarBebida.add(lblBebidaEditar);
		
		txtIdParaEditarBebida = new JTextField();
		txtIdParaEditarBebida.setBounds(300, 52, 86, 20);
		panel_EditarBebida.add(txtIdParaEditarBebida);
		txtIdParaEditarBebida.setColumns(10);

		panel_CadastrarFuncionario = new JPanel();
		frmAdministrador.getContentPane().add(panel_CadastrarFuncionario, "name_183014485660173");
		panel_CadastrarFuncionario.setLayout(null);

		JLabel lblCadastrarFuncionrio = new JLabel("CADASTRAR FUNCION\u00C1RIO");
		lblCadastrarFuncionrio.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCadastrarFuncionrio.setBounds(175, 25, 235, 21);
		panel_CadastrarFuncionario.add(lblCadastrarFuncionrio);

		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.addActionListener(new ActionListener() {
			//botão para voltar para o painel de admin
			public void actionPerformed(ActionEvent e) {
				//limpa os campos
				panel_Do_Autorizado.setVisible(true);
				panel_CadastrarFuncionario.setVisible(false);
			}
		});
		btnVoltar_3.setBounds(264, 491, 89, 23);
		panel_CadastrarFuncionario.add(btnVoltar_3);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeCompleto.setBounds(141, 138, 111, 14);
		panel_CadastrarFuncionario.add(lblNomeCompleto);
		
		txt_InsereNomeFuncionarioCompleto = new JTextField();
		txt_InsereNomeFuncionarioCompleto.setBounds(262, 136, 240, 20);
		panel_CadastrarFuncionario.add(txt_InsereNomeFuncionarioCompleto);
		txt_InsereNomeFuncionarioCompleto.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(126, 192, 141, 14);
		panel_CadastrarFuncionario.add(lblDataDeNascimento);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(199, 94, 58, 14);
		panel_CadastrarFuncionario.add(lblSenha);
		
		txt_InsereFuncionarioSenha = new JTextField();
		txt_InsereFuncionarioSenha.setBounds(269, 92, 141, 20);
		panel_CadastrarFuncionario.add(txt_InsereFuncionarioSenha);
		txt_InsereFuncionarioSenha.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(190, 240, 66, 14);
		panel_CadastrarFuncionario.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEndereo.setBounds(194, 295, 66, 14);
		panel_CadastrarFuncionario.add(lblEndereo);
		
		txt_InsereFuncionarioEndereco = new JTextField();
		txt_InsereFuncionarioEndereco.setBounds(264, 293, 269, 20);
		panel_CadastrarFuncionario.add(txt_InsereFuncionarioEndereco);
		txt_InsereFuncionarioEndereco.setColumns(10);
		
		JButton button = new JButton("Limpar");
		button.addActionListener(new ActionListener() {
			//aqui limpa os campos do cadastro de funcionarios
			public void actionPerformed(ActionEvent e) {
				txt_InsereFuncionarioSenha.setText("");
				txt_InsereNomeFuncionarioCompleto.setText("");
				txt_InsereFuncionarioDataNascimento.setText("");
				txt_InsereFuncionarioTelefone.setText("");
				txt_InsereFuncionarioEndereco.setText("");
			}
		});
		button.setBounds(189, 403, 89, 23);
		panel_CadastrarFuncionario.add(button);
		
		JButton button_1 = new JButton("Salvar");
		button_1.addActionListener(new ActionListener() {
			//cadastra funcionário
			public void actionPerformed(ActionEvent e) {
				//verifica se o Id de funcionario é nulo
				if((txt_InsereFuncionarioId.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Insira um ID de Funcionário. Campo Obrigatório!");		
				}
				//senão cadastra funcionário
				else {
					//antes verifica se o ID não existe
					int i = 0;
					while(i < regFuncionario.size()) {
						if(txt_InsereFuncionarioId.getText().equals(regFuncionario.get(i).getId())){
							JOptionPane.showMessageDialog(null, "ID já cadastrado! Use Outro!");
							break;
						}
						else if(!txt_InsereFuncionarioId.getText().equals(regFuncionario.get(i).getId())){
							i++;
							if(i==regFuncionario.size()) {
								JOptionPane.showMessageDialog(null, "Cadastro de Funcionário Realizado com Sucesso!");
								Funcionario f1 = new Funcionario(txt_InsereFuncionarioId.getText(), txt_InsereFuncionarioSenha.getText(), txt_InsereNomeFuncionarioCompleto.getText(), txt_InsereFuncionarioDataNascimento.getText(), txt_InsereFuncionarioTelefone.getText(), txt_InsereFuncionarioEndereco.getText());
								regFuncionario.add(f1); 
								//cadastra funcionario no txt
								try {
									new LeituraArquivo().alteraFuncionarios(regFuncionario);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}		
								break;
							}
						}
					}					
				}
			}
		});
		button_1.setBounds(335, 403, 89, 23);
		panel_CadastrarFuncionario.add(button_1);
		
		MaskFormatter format5 = new MaskFormatter("##-##-####");
		txt_InsereFuncionarioDataNascimento = new JFormattedTextField(format5);
		txt_InsereFuncionarioDataNascimento.setBounds(264, 190, 111, 20);
		panel_CadastrarFuncionario.add(txt_InsereFuncionarioDataNascimento);
		
		MaskFormatter format6 = new MaskFormatter("(##)-########");
		txt_InsereFuncionarioTelefone = new JFormattedTextField(format6);
		txt_InsereFuncionarioTelefone.setBounds(264, 238, 111, 20);
		panel_CadastrarFuncionario.add(txt_InsereFuncionarioTelefone);
		
		JLabel lblId_3 = new JLabel("ID:");
		lblId_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId_3.setBounds(216, 61, 58, 14);
		panel_CadastrarFuncionario.add(lblId_3);
		
		txt_InsereFuncionarioId = new JTextField();
		txt_InsereFuncionarioId.setBounds(267, 61, 86, 20);
		panel_CadastrarFuncionario.add(txt_InsereFuncionarioId);
		txt_InsereFuncionarioId.setColumns(10);

		panel_ConsultaFuncionario = new JPanel();
		frmAdministrador.getContentPane().add(panel_ConsultaFuncionario, "name_183418706889862");
		panel_ConsultaFuncionario.setLayout(null);

		JButton btnVoltar_4 = new JButton("Voltar");
		btnVoltar_4.addActionListener(new ActionListener() {
			// botão para voltar para o painel admin
			public void actionPerformed(ActionEvent e) {
				txtConsultaFuncionario.setText("");
				panel_ConsultaFuncionario.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btnVoltar_4.setBounds(280, 491, 89, 23);
		panel_ConsultaFuncionario.add(btnVoltar_4);

		JLabel lblConsultarFuncionrios = new JLabel("CONSULTAR FUNCION\u00C1RIOS");
		lblConsultarFuncionrios.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblConsultarFuncionrios.setBounds(213, 11, 263, 14);
		panel_ConsultaFuncionario.add(lblConsultarFuncionrios);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(49, 68, 502, 279);
		panel_ConsultaFuncionario.add(scrollPane_1);
		
		txtConsultaFuncionario = new JTextArea();
		scrollPane_1.setViewportView(txtConsultaFuncionario);
		
		JLabel lblidsenhanomedataNascimentotelefoneendereo = new JLabel("/ID/SENHA/NOME/DATA NASCIMENTO/TELEFONE/ENDERE\u00C7O");
		lblidsenhanomedataNascimentotelefoneendereo.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblidsenhanomedataNascimentotelefoneendereo.setBounds(62, 43, 472, 14);
		panel_ConsultaFuncionario.add(lblidsenhanomedataNascimentotelefoneendereo);

		panel_EditarFuncionario = new JPanel();
		frmAdministrador.getContentPane().add(panel_EditarFuncionario, "name_184170701714785");
		panel_EditarFuncionario.setLayout(null);

		JLabel lblEditarFuncionrio = new JLabel("EDITAR FUNCION\u00C1RIO");
		lblEditarFuncionrio.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblEditarFuncionrio.setBounds(185, 11, 217, 23);
		panel_EditarFuncionario.add(lblEditarFuncionrio);

		JButton btnVoltar_5 = new JButton("Voltar");
		btnVoltar_5.addActionListener(new ActionListener() {
			//botão para retornar para o painel admin
			public void actionPerformed(ActionEvent e) {
				panel_EditarFuncionario.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btnVoltar_5.setBounds(262, 491, 89, 23);
		panel_EditarFuncionario.add(btnVoltar_5);
		
		JLabel label_18 = new JLabel("Senha:");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_18.setBounds(172, 157, 58, 14);
		panel_EditarFuncionario.add(label_18);
		
		txt_EditaFuncionarioSenha = new JTextField();
		txt_EditaFuncionarioSenha.setColumns(10);
		txt_EditaFuncionarioSenha.setBounds(242, 155, 141, 20);
		panel_EditarFuncionario.add(txt_EditaFuncionarioSenha);
		
		JLabel label_19 = new JLabel("Nome Completo:");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_19.setBounds(119, 203, 111, 14);
		panel_EditarFuncionario.add(label_19);
		
		txt_EditaFuncionarioNome = new JTextField();
		txt_EditaFuncionarioNome.setColumns(10);
		txt_EditaFuncionarioNome.setBounds(240, 201, 240, 20);
		panel_EditarFuncionario.add(txt_EditaFuncionarioNome);
		
		JLabel label_20 = new JLabel("Data de Nascimento:");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_20.setBounds(104, 257, 141, 14);
		panel_EditarFuncionario.add(label_20);
		
		JLabel label_21 = new JLabel("Telefone:");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_21.setBounds(168, 305, 66, 14);
		panel_EditarFuncionario.add(label_21);
		
		txt_EditaFuncionarioEndereco = new JTextField();
		txt_EditaFuncionarioEndereco.setColumns(10);
		txt_EditaFuncionarioEndereco.setBounds(242, 358, 269, 20);
		panel_EditarFuncionario.add(txt_EditaFuncionarioEndereco);
		
		JLabel label_23 = new JLabel("Endere\u00E7o:");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_23.setBounds(172, 360, 66, 14);
		panel_EditarFuncionario.add(label_23);
		
		JButton button_4 = new JButton("Limpar");
		button_4.addActionListener(new ActionListener() {
			//aqui lima pos campos do edita funcionário
			public void actionPerformed(ActionEvent e) {
				txt_EditaFuncionarioId.setText("");
				txt_EditaFuncionarioSenha.setText("");
				txt_EditaFuncionarioNome.setText("");
				txt_EditaFucnionarioDataNascimento.setText("");
				txt_EditaFuncionarioTelefone.setText("");
				txt_EditaFuncionarioEndereco.setText("");
			}
		});
		button_4.setBounds(185, 434, 89, 23);
		panel_EditarFuncionario.add(button_4);
		
		JButton button_5 = new JButton("Salvar");
		button_5.addActionListener(new ActionListener() {
			//evento editar funcionário
			public void actionPerformed(ActionEvent e) {
				//alterar arquivo txt funcionário
					for (int i = 0; i < regFuncionario.size(); i++) {							
						//verifica se encontra funcionario a alterar
						if(regFuncionario.get(i).getId().equals(String.format("%s",txt_IdAltera.getText().toString()))) {
							regFuncionario.get(i).setId(txt_EditaFuncionarioId.getText());
							regFuncionario.get(i).setSenha(txt_EditaFuncionarioSenha.getText());
							regFuncionario.get(i).setNomeCompleto(txt_EditaFuncionarioNome.getText());
							regFuncionario.get(i).setDataNascimento(txt_EditaFucnionarioDataNascimento.getText());
							regFuncionario.get(i).setTelefone(txt_EditaFuncionarioTelefone.getText());
							regFuncionario.get(i).setEndereco(txt_EditaFuncionarioEndereco.getText());
							try{
								new LeituraArquivo().alteraFuncionarios(regFuncionario);
							} catch (IOException e1) {
							// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Registro do Funcionário Alterado Com Sucesso!");
						}
						//senao diz q n encontrou
						else {
							i++;
							if(i==regFuncionario.size()) {
								JOptionPane.showMessageDialog(null, "Funcionário não Encontrado!");
							}
						}
					}					
			}
		});
		button_5.setBounds(331, 434, 89, 23);
		panel_EditarFuncionario.add(button_5);
		
		JLabel lblId_2 = new JLabel("ID:");
		lblId_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId_2.setBounds(189, 125, 35, 14);
		panel_EditarFuncionario.add(lblId_2);
		
		txt_EditaFuncionarioId = new JTextField();
		txt_EditaFuncionarioId.setBounds(242, 123, 86, 20);
		panel_EditarFuncionario.add(txt_EditaFuncionarioId);
		txt_EditaFuncionarioId.setColumns(10);
		
		MaskFormatter format3 = new MaskFormatter("##-##-####");
		txt_EditaFucnionarioDataNascimento = new JFormattedTextField(format3);
		txt_EditaFucnionarioDataNascimento.setBounds(242, 255, 86, 20);
		panel_EditarFuncionario.add(txt_EditaFucnionarioDataNascimento);
		
		JLabel lblInformeOId = new JLabel("Informe o ID do Funcion\u00E1rio \u00E0 Alterar:");
		lblInformeOId.setBounds(10, 52, 235, 14);
		panel_EditarFuncionario.add(lblInformeOId);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 42, 641, 2);
		panel_EditarFuncionario.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 94, 641, 2);
		panel_EditarFuncionario.add(separator_3);
		
		txt_IdAltera = new JTextField();
		txt_IdAltera.setBounds(242, 73, 86, 20);
		panel_EditarFuncionario.add(txt_IdAltera);
		txt_IdAltera.setColumns(10);
		
		JLabel label_22 = new JLabel("ID:");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_22.setBounds(185, 77, 35, 14);
		panel_EditarFuncionario.add(label_22);
		
		JLabel lblAlteraesFuncionrio = new JLabel("Altera\u00E7\u00F5es Funcion\u00E1rio:");
		lblAlteraesFuncionrio.setBounds(21, 107, 166, 14);
		panel_EditarFuncionario.add(lblAlteraesFuncionrio);
		
		MaskFormatter format4 = new MaskFormatter("(##)-########");
		txt_EditaFuncionarioTelefone = new JFormattedTextField(format4);
		txt_EditaFuncionarioTelefone.setBounds(239, 303, 105, 20);
		panel_EditarFuncionario.add(txt_EditaFuncionarioTelefone);
		
		panel_DeletaBebida = new JPanel();
		frmAdministrador.getContentPane().add(panel_DeletaBebida, "name_72821493400962");
		panel_DeletaBebida.setLayout(null);
		
		JLabel lblDeletarBebida = new JLabel("DELETAR BEBIDA");
		lblDeletarBebida.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDeletarBebida.setBounds(195, 11, 188, 21);
		panel_DeletaBebida.add(lblDeletarBebida);
		
		JButton button_6 = new JButton("Voltar");
		button_6.addActionListener(new ActionListener() {
			//retorna ao menu do autorizado
			public void actionPerformed(ActionEvent e) {
				panel_DeletaBebida.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		button_6.setBounds(224, 464, 89, 43);
		panel_DeletaBebida.add(button_6);
		
		JLabel lblInformeOId_1 = new JLabel("Informe o ID da bebida \u00E0 Deletar:");
		lblInformeOId_1.setBounds(181, 104, 231, 14);
		panel_DeletaBebida.add(lblInformeOId_1);
		
		JLabel lblId_4 = new JLabel("ID:");
		lblId_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId_4.setBounds(254, 178, 46, 14);
		panel_DeletaBebida.add(lblId_4);
		
		txt_DeletaBebidaId = new JTextField();
		txt_DeletaBebidaId.setBounds(157, 216, 214, 20);
		panel_DeletaBebida.add(txt_DeletaBebidaId);
		txt_DeletaBebidaId.setColumns(10);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.addActionListener(new ActionListener() {
			//limpar campo id deleta bebida
			public void actionPerformed(ActionEvent e) {
				txt_DeletaBebidaId.setText("");
			}
		});
		btnLimpar_1.setBounds(224, 385, 89, 43);
		panel_DeletaBebida.add(btnLimpar_1);
		
		JButton btnDeletarBebida = new JButton("<html>Deletar Bebida</html>");
		btnDeletarBebida.addActionListener(new ActionListener() {
			//evento deletar bebida
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				for (int i = 0; i < regBebida.size(); i++) {
					if(regBebida.get(i).getId().equals(String.format("%s",txt_DeletaBebidaId.getText().toString()))) {
						regBebida.remove(i);
						//regrava o txt  sem o objeto excluido
						try {
							new LeituraArquivo().alteraBebidas(regBebida);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Bebida Deletada com Sucesso!");
						break;
					}
					else{
						x++;
					}
					if(x==regBebida.size()){
						JOptionPane.showMessageDialog(null, "Bebida Não Encontrada!");
						break;
					}
				}
			}
		});
		btnDeletarBebida.setBounds(224, 302, 89, 43);
		panel_DeletaBebida.add(btnDeletarBebida);
		
		panel_DeletaFuncionario = new JPanel();
		frmAdministrador.getContentPane().add(panel_DeletaFuncionario, "name_73416444854423");
		panel_DeletaFuncionario.setLayout(null);
		
		JLabel lblDeletaFuncionrio = new JLabel("DELETA FUNCION\u00C1RIO");
		lblDeletaFuncionrio.setBounds(222, 5, 196, 21);
		lblDeletaFuncionrio.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_DeletaFuncionario.add(lblDeletaFuncionrio);
		
		JButton btn_Voltar_6 = new JButton("Voltar");
		btn_Voltar_6.addActionListener(new ActionListener() {
			//botao voltar deleta funcionario
			public void actionPerformed(ActionEvent e) {
				panel_DeletaFuncionario.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btn_Voltar_6.setBounds(307, 476, 89, 48);
		panel_DeletaFuncionario.add(btn_Voltar_6);
		
		JButton btn_Limpar_2 = new JButton("Limpar");
		btn_Limpar_2.addActionListener(new ActionListener() {
			//limpa campo deletar funcionario
			public void actionPerformed(ActionEvent e) {
				txt_DeletarFuncionarioId.setText("");
			}
		});
		btn_Limpar_2.setBounds(307, 401, 89, 48);
		panel_DeletaFuncionario.add(btn_Limpar_2);
		
		JButton btn_DeletaFuncionario = new JButton("<html>Deleta Funcion\u00E1rio</html>");
		btn_DeletaFuncionario.addActionListener(new ActionListener() {
			//evento deleta funcionário
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				for (int i = 0; i < regFuncionario.size(); i++) {
					if(regFuncionario.get(i).getId().equals(String.format("%s",txt_DeletarFuncionarioId.getText().toString()))) {
						regFuncionario.remove(i);
						//regrava o txt  sem o objeto excluido
						try {
							new LeituraArquivo().alteraFuncionarios(regFuncionario);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Funcionário Deletado com Sucesso!");
						break;
					}
					else{
						x++;
					}
					if(x==regFuncionario.size()){
						JOptionPane.showMessageDialog(null, "Funcionário Não Encontrado!");
						break;
					}
				}
			}
		});
		btn_DeletaFuncionario.setBounds(307, 327, 89, 48);
		panel_DeletaFuncionario.add(btn_DeletaFuncionario);
		
		JLabel lblInformeOId_2 = new JLabel("Informe o ID para Demitir um Funcion\u00E1rio:");
		lblInformeOId_2.setBounds(223, 69, 211, 14);
		panel_DeletaFuncionario.add(lblInformeOId_2);
		
		JLabel lblId_5 = new JLabel("ID:");
		lblId_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId_5.setBounds(317, 119, 46, 14);
		panel_DeletaFuncionario.add(lblId_5);
		
		txt_DeletarFuncionarioId = new JTextField();
		txt_DeletarFuncionarioId.setBounds(233, 190, 201, 20);
		panel_DeletaFuncionario.add(txt_DeletarFuncionarioId);
		txt_DeletarFuncionarioId.setColumns(10);
		
		panel_InsereMoeda = new JPanel();
		frmAdministrador.getContentPane().add(panel_InsereMoeda, "name_142526237138672");
		panel_InsereMoeda.setLayout(null);
		
		JButton button_7 = new JButton("Limpar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			spinnerInsere5.setValue(0);
			spinnerInsere10.setValue(0);
			spinnerInsere25.setValue(0);
			spinnerInsere50.setValue(0);
			spinnerInsere1.setValue(0);
			}
		});
		button_7.setBounds(216, 412, 89, 23);
		panel_InsereMoeda.add(button_7);
		
		JButton button_8 = new JButton("Salvar");
		button_8.addActionListener(new ActionListener() {
			//salva no txt inserir moedas
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Moedas Inseridas com Sucesso!");
				
				//insere moedas no txt
				try {
						new LeituraArquivo().alteraMoedas(regMoeda);
				} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}		
			}
		});
		button_8.setBounds(362, 412, 89, 23);
		panel_InsereMoeda.add(button_8);
		
		JButton button_9 = new JButton("Voltar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_InsereMoeda.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		button_9.setBounds(292, 501, 89, 23);
		panel_InsereMoeda.add(button_9);
		
		JLabel lblInsereMoedas = new JLabel("Insere Moedas");
		lblInsereMoedas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInsereMoedas.setBounds(197, 23, 206, 14);
		panel_InsereMoeda.add(lblInsereMoedas);
		
		spinnerInsere5 = new JSpinner();
		spinnerInsere5.addChangeListener(new ChangeListener() {
			//evento insere moedas 5 centavos
			public void stateChanged(ChangeEvent arg0) {
				//seta a qtd de moedas na posição 4 ou seja a de 5 centavos com o que ta no spinner 
				regMoeda.get(4).setQtd(Integer.parseInt(spinnerInsere5.getValue().toString()));
			}
		});
		spinnerInsere5.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerInsere5.setBounds(290, 104, 54, 20);
		panel_InsereMoeda.add(spinnerInsere5);
		
		spinnerInsere10 = new JSpinner();
		spinnerInsere10.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//aqui é a de 10
				regMoeda.get(3).setQtd(Integer.parseInt(spinnerInsere10.getValue().toString()));
			}
		});
		spinnerInsere10.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerInsere10.setBounds(292, 147, 52, 20);
		panel_InsereMoeda.add(spinnerInsere10);
		
		spinnerInsere25 = new JSpinner();
		spinnerInsere25.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//aqui é a de 25
				regMoeda.get(2).setQtd(Integer.parseInt(spinnerInsere25.getValue().toString()));
			}
		});
		spinnerInsere25.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerInsere25.setBounds(292, 194, 52, 20);
		panel_InsereMoeda.add(spinnerInsere25);
		
		spinnerInsere50 = new JSpinner();
		spinnerInsere50.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//aqui a de 50
				regMoeda.get(1).setQtd(Integer.parseInt(spinnerInsere50.getValue().toString()));
			}
		});
		spinnerInsere50.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerInsere50.setBounds(292, 245, 52, 20);
		panel_InsereMoeda.add(spinnerInsere50);
		
		spinnerInsere1 = new JSpinner();
		spinnerInsere1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//aqui de 1 real
				regMoeda.get(0).setQtd(Integer.parseInt(spinnerInsere1.getValue().toString()));
			}
		});
		spinnerInsere1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerInsere1.setBounds(290, 294, 54, 20);
		panel_InsereMoeda.add(spinnerInsere1);
		
		JLabel lblVaiDo = new JLabel("10 centavos");
		lblVaiDo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVaiDo.setBounds(176, 150, 89, 14);
		panel_InsereMoeda.add(lblVaiDo);
		
		JLabel label_36 = new JLabel("5 centavos");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_36.setBounds(176, 105, 89, 14);
		panel_InsereMoeda.add(label_36);
		
		JLabel lblCentavos = new JLabel("25 centavos");
		lblCentavos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCentavos.setBounds(176, 197, 89, 14);
		panel_InsereMoeda.add(lblCentavos);
		
		JLabel lblCentavos_1 = new JLabel("50 centavos");
		lblCentavos_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCentavos_1.setBounds(176, 248, 89, 14);
		panel_InsereMoeda.add(lblCentavos_1);
		
		JLabel lblReal = new JLabel("1 Real");
		lblReal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReal.setBounds(176, 297, 89, 14);
		panel_InsereMoeda.add(lblReal);
		
		panel_RetiraSaldo = new JPanel();
		frmAdministrador.getContentPane().add(panel_RetiraSaldo, "name_27031558253087");
		panel_RetiraSaldo.setLayout(null);
		
		JButton button_10 = new JButton("Limpar");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt_RetiraSaldo.setText("");
			}
		});
		button_10.setBounds(215, 392, 89, 23);
		panel_RetiraSaldo.add(button_10);
		
		JButton button_11 = new JButton("Salvar");
		button_11.addActionListener(new ActionListener() {
			//evento botao retirar saldo
			public void actionPerformed(ActionEvent arg0) {
			    double saldo = vendas[0];
				if(saldo>0){
					double subtrai = saldo-Double.parseDouble(txt_RetiraSaldo.getText().toString());
					vendas[0] = subtrai; 
					JOptionPane.showMessageDialog(null, "Dinheiro Sacado com Sucesso!");
					//altera txt vendas
					try {
						new LeituraArquivo().alteraVendas(vendas);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Saldo abaixo de R$ 0.00 ! Impossível fazer o saque!");
				}
				
			}
		});
		button_11.setBounds(385, 392, 89, 23);
		panel_RetiraSaldo.add(button_11);
		
		JButton button_12 = new JButton("Voltar");
		button_12.addActionListener(new ActionListener() {
			//retorna ao menu anterior
			public void actionPerformed(ActionEvent arg0) {
				panel_RetiraSaldo.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		button_12.setBounds(291, 481, 89, 23);
		panel_RetiraSaldo.add(button_12);
		
		JLabel lblInformeOValor = new JLabel("Informe o valor que deseja retirar ");
		lblInformeOValor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInformeOValor.setBounds(189, 35, 299, 23);
		panel_RetiraSaldo.add(lblInformeOValor);
		
		JLabel lblR = new JLabel("R$");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblR.setBounds(258, 117, 46, 14);
		panel_RetiraSaldo.add(lblR);
		
		
		MaskFormatter format7 = new MaskFormatter("##.##");
		txt_RetiraSaldo = new JFormattedTextField(format7);
		txt_RetiraSaldo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_RetiraSaldo.setBounds(283, 115, 86, 20);
		panel_RetiraSaldo.add(txt_RetiraSaldo);
		txt_RetiraSaldo.setColumns(10);
		
		panel_ConsultaAbre = new JPanel();
		frmAdministrador.getContentPane().add(panel_ConsultaAbre, "name_87373940240136");
		panel_ConsultaAbre.setLayout(null);
		
		JLabel lblConsultaAberturaMquina = new JLabel("Consulta Abertura M\u00E1quina");
		lblConsultaAberturaMquina.setBounds(199, 38, 215, 14);
		panel_ConsultaAbre.add(lblConsultaAberturaMquina);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(68, 99, 502, 279);
		panel_ConsultaAbre.add(scrollPane_2);
		
		txtConsultaAbreMaquina = new JTextArea();
		scrollPane_2.setViewportView(txtConsultaAbreMaquina);
		
		JButton btnVoltar_6 = new JButton("Voltar");
		btnVoltar_6.addActionListener(new ActionListener() {
			//retornar ao menu do consumidor
			public void actionPerformed(ActionEvent e) {
				txtConsultaAbreMaquina.setText("");
				panel_ConsultaAbre.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btnVoltar_6.setBounds(272, 436, 89, 23);
		panel_ConsultaAbre.add(btnVoltar_6);
		
		panel_RecuperaSenha = new JPanel();
		frmAdministrador.getContentPane().add(panel_RecuperaSenha, "name_191776243175991");
		panel_RecuperaSenha.setLayout(null);
		
		JLabel lblRecuperarUsuriosenha = new JLabel("Recuperar Usu\u00E1rio/Senha");
		lblRecuperarUsuriosenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRecuperarUsuriosenha.setBounds(245, 46, 211, 14);
		panel_RecuperaSenha.add(lblRecuperarUsuriosenha);
		
		JLabel lblInformeSeuNmero = new JLabel("Informe seu n\u00FAmero de celular:");
		lblInformeSeuNmero.setBounds(135, 124, 189, 14);
		panel_RecuperaSenha.add(lblInformeSeuNmero);
		
		MaskFormatter format10 = new MaskFormatter("(##)-########");
		txt_CellRecupera = new JFormattedTextField(format10);
		txt_CellRecupera.setBounds(334, 121, 157, 20);
		panel_RecuperaSenha.add(txt_CellRecupera);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			//evento botão enviar
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				String entrada = "";
				String codigo = "";
				//verifica se numero admin ou funcionario esta cadastrado
				for (int i = 0; i < regAdministrador.size();) {
					if((regAdministrador.get(i).getTelefone().equals(txt_CellRecupera.getText()))){
						codigo = String.valueOf(r.nextInt(5000));
						JOptionPane.showMessageDialog(null, "Código "+codigo+" enviado ao telefone "+regAdministrador.get(i).getTelefone());
						entrada = JOptionPane.showInputDialog("Informe o código enviado ao telefone "+regAdministrador.get(i).getTelefone()+" :");
						if(entrada.equals(codigo) && entrada != ""){
							JOptionPane.showMessageDialog(null, "Código aceito! Abre Tela de Recuperação...");
							panel_RecuperaSenha.setVisible(false);
							panel_RedefinirSenha.setVisible(true);
						}
						else{
							JOptionPane.showMessageDialog(null, "Código Incorreto!");	
						}
						break;
					}
					else{
						JOptionPane.showMessageDialog(null, "Esse telefone não foi encontrado no registro!");
						break;
					}
				}
				
			}
		});
		btnEnviar.setBounds(300, 270, 89, 23);
		panel_RecuperaSenha.add(btnEnviar);
		
		JButton btnLimpar_2 = new JButton("Limpar");
		btnLimpar_2.addActionListener(new ActionListener() {
			//limpar campos recupera senha
			public void actionPerformed(ActionEvent e) {
				txt_CellRecupera.setText("");
			}
		});
		btnLimpar_2.setBounds(300, 324, 89, 23);
		panel_RecuperaSenha.add(btnLimpar_2);
		
		JButton btnVoltar_7 = new JButton("Voltar");
		btnVoltar_7.addActionListener(new ActionListener() {
			//volta
			public void actionPerformed(ActionEvent e) {
				panel_RecuperaSenha.setVisible(false);
				panel_Administrador.setVisible(true);
			}
		});
		btnVoltar_7.setBounds(300, 380, 89, 23);
		panel_RecuperaSenha.add(btnVoltar_7);
		
		JLabel lblObsAoDigitar = new JLabel("<html>OBS: Ao digitar seu telefone cadastrado uma mensagem com um c\u00F3digo ser\u00E1 enviada ao seu n\u00FAmero. Digite-o para recuperar sua senha!</html>");
		lblObsAoDigitar.setForeground(Color.RED);
		lblObsAoDigitar.setBounds(54, 186, 569, 34);
		panel_RecuperaSenha.add(lblObsAoDigitar);
		
		panel_RedefinirSenha = new JPanel();
		frmAdministrador.getContentPane().add(panel_RedefinirSenha, "name_195155583765227");
		panel_RedefinirSenha.setLayout(null);
		
		JLabel lblNovoUsurio = new JLabel("Usu\u00E1rio:");
		lblNovoUsurio.setBounds(298, 102, 79, 14);
		panel_RedefinirSenha.add(lblNovoUsurio);
		
		txt_RedefiniUsuarioAdmin = new JTextField();
		txt_RedefiniUsuarioAdmin.setBounds(218, 127, 227, 20);
		panel_RedefinirSenha.add(txt_RedefiniUsuarioAdmin);
		txt_RedefiniUsuarioAdmin.setColumns(10);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setBounds(310, 171, 46, 14);
		panel_RedefinirSenha.add(lblSenha_1);
		
		txt_RedefiniSenhaAdmin = new JTextField();
		txt_RedefiniSenhaAdmin.setBounds(218, 196, 227, 20);
		panel_RedefinirSenha.add(txt_RedefiniSenhaAdmin);
		txt_RedefiniSenhaAdmin.setColumns(10);
		
		JButton btnSalvar_1 = new JButton("Salvar");
		btnSalvar_1.addActionListener(new ActionListener() {
			//salva redefinição
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < regAdministrador.size(); i++) {
					if(regAdministrador.get(i).getTelefone().equals(txt_CellRecupera.getText())){
						regAdministrador.get(i).setId(txt_RedefiniUsuarioAdmin.getText());
						regAdministrador.get(i).setSenha(txt_RedefiniSenhaAdmin.getText());
						try {
							new LeituraArquivo().alteraAdministrador(regAdministrador);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					}
				}
				panel_RedefinirSenha.setVisible(false);
				panel_Administrador.setVisible(true);
			}
		});
		btnSalvar_1.setBounds(300, 275, 89, 23);
		panel_RedefinirSenha.add(btnSalvar_1);
		
		JLabel lblRedefinirSenha = new JLabel("Redefinir Senha");
		lblRedefinirSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRedefinirSenha.setBounds(258, 26, 184, 14);
		panel_RedefinirSenha.add(lblRedefinirSenha);
		
		JButton btnLimpar_3 = new JButton("Limpar");
		btnLimpar_3.addActionListener(new ActionListener() {
			//limpar campos redefinir senha
			public void actionPerformed(ActionEvent e) {
				txt_RedefiniUsuarioAdmin.setText("");
				txt_RedefiniSenhaAdmin.setText("");
			}
		});
		btnLimpar_3.setBounds(298, 340, 89, 23);
		panel_RedefinirSenha.add(btnLimpar_3);
		
		panel_ConsultaSaldo = new JPanel();
		frmAdministrador.getContentPane().add(panel_ConsultaSaldo, "name_250347370752047");
		panel_ConsultaSaldo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Saldo");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(259, 34, 151, 21);
		panel_ConsultaSaldo.add(lblNewLabel);
		
		JButton btnVoltar_8 = new JButton("Voltar");
		btnVoltar_8.addActionListener(new ActionListener() {
			//Retorna ao menu do autorizado
			public void actionPerformed(ActionEvent arg0) {
				txtConsultaSaldo.setText("");
				panel_ConsultaSaldo.setVisible(false);
				panel_Do_Autorizado.setVisible(true);
			}
		});
		btnVoltar_8.setBounds(307, 404, 89, 23);
		panel_ConsultaSaldo.add(btnVoltar_8);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(153, 91, 400, 278);
		panel_ConsultaSaldo.add(scrollPane_3);
		
		txtConsultaSaldo = new JTextField();
		scrollPane_3.setViewportView(txtConsultaSaldo);
		txtConsultaSaldo.setColumns(10);
	}
}