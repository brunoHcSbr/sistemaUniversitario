package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.ProfessorController;


public class CadastroProfessorView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfBairro;
	private JTextField tfRua;
	private JTextField tfNumeroCasa;
	private JTextField tfCidade;
	private JTextField tfEmail;
	private JTextField tfCategoria;
	
	private JFormattedTextField tfMatricula;
	private JFormattedTextField tfCodCoordenador;
	private JFormattedTextField tfCPF;
	private JFormattedTextField tfRG;
	private JFormattedTextField tfCEP;
	private JFormattedTextField tfUf;
	private JFormattedTextField tfTelefone;
	private JFormattedTextField tfDataNasc;
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVoltar = new JButton("");
	
public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
 } 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessorView frame = new CadastroProfessorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProfessorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1350, 731);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_nome_3 = new JLabel("Bairro");
		lbl_nome_3.setBounds(314, 249, 46, 14);
		panel.add(lbl_nome_3);
		lbl_nome_3.setForeground(new Color(0, 65, 100));
		lbl_nome_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		tfBairro = new JTextField();
		tfBairro.setHorizontalAlignment(SwingConstants.CENTER);
		tfBairro.setBounds(370, 245, 702, 25);
		panel.add(tfBairro);
		tfBairro.setColumns(10);
		
		tfCPF  = new JFormattedTextField(Mascara("###.###.###-##"));
		tfCPF.setHorizontalAlignment(SwingConstants.CENTER);
		
		tfCPF.setBounds(370, 209, 178, 25);
		panel.add(tfCPF);
		tfCPF.setColumns(10);
		
		tfRG  = new JFormattedTextField(Mascara("##.###.###-#"));
		tfRG.setHorizontalAlignment(SwingConstants.CENTER);
		tfRG.setBounds(593, 209, 178, 25);
		panel.add(tfRG);
		tfRG.setColumns(10);
		
		JLabel lbl_nome_2_1 = new JLabel("RG");
		lbl_nome_2_1.setBounds(558, 213, 36, 14);
		panel.add(lbl_nome_2_1);
		lbl_nome_2_1.setForeground(new Color(0, 65, 100));
		lbl_nome_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		JLabel lbl_nome_2 = new JLabel("CPF");
		lbl_nome_2.setBounds(324, 213, 36, 14);
		panel.add(lbl_nome_2);
		lbl_nome_2.setForeground(new Color(0, 65, 100));
		lbl_nome_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setBounds(370, 163, 702, 25);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		tfMatricula  = new JFormattedTextField(Mascara("#####"));
		tfMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		tfMatricula.setBounds(370, 126, 178, 25);
		panel.add(tfMatricula);
		tfMatricula.setColumns(10);
		
		JLabel lbl_nome_1 = new JLabel("Nome");
		lbl_nome_1.setBounds(314, 167, 46, 14);
		panel.add(lbl_nome_1);
		lbl_nome_1.setForeground(new Color(0, 65, 100));
		lbl_nome_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		JLabel lbl_nome_3_1 = new JLabel("Rua");
		lbl_nome_3_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1.setBounds(324, 367, 36, 14);
		panel.add(lbl_nome_3_1);
		
		JLabel lbl_nome_3_1_1 = new JLabel("N°");
		lbl_nome_3_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_1.setBounds(877, 367, 36, 14);
		panel.add(lbl_nome_3_1_1);
		
		JLabel lbl_nome = new JLabel("Matricula");
		lbl_nome.setForeground(new Color(0, 65, 100));
		lbl_nome.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome.setBackground(new Color(0, 65, 100));
		lbl_nome.setBounds(290, 131, 70, 14);
		panel.add(lbl_nome);
		
		tfRua = new JTextField();
		tfRua.setHorizontalAlignment(SwingConstants.CENTER);
		tfRua.setColumns(10);
		tfRua.setBounds(370, 363, 497, 25);
		panel.add(tfRua);
		
		tfNumeroCasa = new JTextField();
		tfNumeroCasa.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumeroCasa.setColumns(10);
		tfNumeroCasa.setBounds(923, 363, 149, 25);
		panel.add(tfNumeroCasa);
		
		tfCEP  = new JFormattedTextField(Mascara("#####-###"));
		tfCEP.setHorizontalAlignment(SwingConstants.CENTER);
		tfCEP.setColumns(10);
		tfCEP.setBounds(372, 326, 149, 25);
		panel.add(tfCEP);
		
		JLabel lbl_nome_3_1_2 = new JLabel("CEP");
		lbl_nome_3_1_2.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_2.setBounds(324, 330, 36, 14);
		panel.add(lbl_nome_3_1_2);
		
		tfCidade = new JTextField();
		tfCidade.setHorizontalAlignment(SwingConstants.CENTER);
		tfCidade.setColumns(10);
		tfCidade.setBounds(370, 404, 497, 25);
		panel.add(tfCidade);
		
		JLabel lbl_nome_3_1_3 = new JLabel("Cidade");
		lbl_nome_3_1_3.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_3.setBounds(314, 408, 46, 14);
		panel.add(lbl_nome_3_1_3);
		
		tfUf  = new JFormattedTextField(Mascara("AA"));
		tfUf.setHorizontalAlignment(SwingConstants.CENTER);
		tfUf.setColumns(10);
		tfUf.setBounds(923, 404, 149, 25);
		panel.add(tfUf);
		
		JLabel lbl_nome_3_1_1_1 = new JLabel("UF");
		lbl_nome_3_1_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_1_1.setBounds(877, 408, 36, 14);
		panel.add(lbl_nome_3_1_1_1);
		
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(0, 65, 100));
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCadastrar.setBounds(465, 454, 320, 43);
		panel.add(btnCadastrar);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setColumns(10);
		tfEmail.setBounds(370, 281, 334, 25);
		panel.add(tfEmail);
		
		JLabel lbl_nome_3_2 = new JLabel("E-mail");
		lbl_nome_3_2.setForeground(new Color(0, 65, 100));
		lbl_nome_3_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_2.setBounds(314, 286, 46, 14);
		panel.add(lbl_nome_3_2);
		
		tfTelefone = new JFormattedTextField(Mascara("(##) #####-####"));
		tfTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(809, 281, 263, 25);
		panel.add(tfTelefone);
		
		JLabel lbl_nome_4 = new JLabel("Telefone");
		lbl_nome_4.setForeground(new Color(0, 65, 100));
		lbl_nome_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_4.setBackground(Color.GRAY);
		lbl_nome_4.setBounds(727, 285, 70, 14);
		panel.add(lbl_nome_4);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastroProfessorView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1179, 47, 126, 100);
		panel.add(lblVoltar);
		
		btnVoltar.addActionListener(this);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1153, 47, 157, 125);
		panel.add(btnVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1206, 147, 72, 25);
		panel.add(lblVoltar2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CadastroProfessorView.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(30, 595, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DO PROFESSOR");
		lblNewLabel.setBounds(482, 68, 319, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 65, 100));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		tfDataNasc = new JFormattedTextField(Mascara("##/##/####"));
		tfDataNasc.setHorizontalAlignment(SwingConstants.CENTER);
		tfDataNasc.setColumns(10);
		tfDataNasc.setBounds(894, 209, 178, 25);
		panel.add(tfDataNasc);
		
		JLabel lbl_nome_2_1_1 = new JLabel("Data Nascimento");
		lbl_nome_2_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_2_1_1.setBounds(776, 214, 108, 14);
		panel.add(lbl_nome_2_1_1);
		
		JLabel lbl_nome_5 = new JLabel("CÓDIGO DO COORDENADOR");
		lbl_nome_5.setForeground(new Color(0, 65, 100));
		lbl_nome_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5.setBackground(new Color(0, 65, 100));
		lbl_nome_5.setBounds(558, 130, 189, 14);
		panel.add(lbl_nome_5);
		
		tfCodCoordenador  = new JFormattedTextField(Mascara("#####"));
		tfCodCoordenador.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodCoordenador.setColumns(10);
		tfCodCoordenador.setBounds(750, 127, 178, 25);
		panel.add(tfCodCoordenador);
		
		JLabel lbl_nome_5_1 = new JLabel("CATEGORIA");
		lbl_nome_5_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(936, 131, 83, 14);
		panel.add(lbl_nome_5_1);
		
		tfCategoria = new JTextField();
		tfCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		tfCategoria.setColumns(10);
		tfCategoria.setBounds(1018, 126, 54, 25);
		panel.add(tfCategoria);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastroProfessorView.class.getResource("/resources/iconProfessor.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(42, 21, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
	}
	
	public JTextField getTfNome() {
		return tfNome;
	}



	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}



	public JTextField getTfBairro() {
		return tfBairro;
	}



	public void setTfBairro(JTextField tfBairro) {
		this.tfBairro = tfBairro;
	}



	public JTextField getTfRua() {
		return tfRua;
	}



	public void setTfRua(JTextField tfRua) {
		this.tfRua = tfRua;
	}



	public JTextField getTfNumeroCasa() {
		return tfNumeroCasa;
	}



	public void setTfNumeroCasa(JTextField tfNumeroCasa) {
		this.tfNumeroCasa = tfNumeroCasa;
	}



	public JTextField getTfCidade() {
		return tfCidade;
	}



	public void setTfCidade(JTextField tfCidade) {
		this.tfCidade = tfCidade;
	}



	public JTextField getTfEmail() {
		return tfEmail;
	}



	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}



	public JTextField getTfCategoria() {
		return tfCategoria;
	}



	public void setTfCategoria(JTextField tfCategoria) {
		this.tfCategoria = tfCategoria;
	}



	public JFormattedTextField getTfMatricula() {
		return tfMatricula;
	}



	public void setTfMatricula(JFormattedTextField tfMatricula) {
		this.tfMatricula = tfMatricula;
	}



	public JFormattedTextField getTfCodCoordenador() {
		return tfCodCoordenador;
	}



	public void setTfCodCoordenador(JFormattedTextField tfCodCoordenador) {
		this.tfCodCoordenador = tfCodCoordenador;
	}



	public JFormattedTextField getTfCPF() {
		return tfCPF;
	}



	public void setTfCPF(JFormattedTextField tfCPF) {
		this.tfCPF = tfCPF;
	}



	public JFormattedTextField getTfRG() {
		return tfRG;
	}



	public void setTfRG(JFormattedTextField tfRG) {
		this.tfRG = tfRG;
	}



	public JFormattedTextField getTfCEP() {
		return tfCEP;
	}



	public void setTfCEP(JFormattedTextField tfCEP) {
		this.tfCEP = tfCEP;
	}



	public JFormattedTextField getTfUf() {
		return tfUf;
	}



	public void setTfUf(JFormattedTextField tfUf) {
		this.tfUf = tfUf;
	}



	public JFormattedTextField getTfTelefone() {
		return tfTelefone;
	}



	public void setTfTelefone(JFormattedTextField tfTelefone) {
		this.tfTelefone = tfTelefone;
	}



	public JFormattedTextField getTfDataNasc() {
		return tfDataNasc;
	}



	public void setTfDataNasc(JFormattedTextField tfDataNasc) {
		this.tfDataNasc = tfDataNasc;
	}



	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			ProfessorController professor = new ProfessorController();
			
			System.out.println(tfDataNasc.getText());
			
			
			
			if(tfMatricula.getText().matches("") || tfNome.getText().matches("") ||tfCPF.getText().matches("") || tfRG.getText().matches("")
					|| tfDataNasc.getText().matches("") || tfBairro.getText().matches("")|| tfEmail.getText().matches("")
					|| tfTelefone.getText().matches("") || tfCEP.getText().matches("") || tfRua.getText().matches("") 
					|| tfRua.getText().matches("") || tfNumeroCasa.getText().matches("") || tfCidade.getText().matches("")
					|| tfUf.getText().matches("")|| tfCodCoordenador.getText().matches("")|| tfCategoria.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(professor.cadastrarProfessor(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (professor.cadastrarProfessor(this) == "Matricula existe"){
				JOptionPane.showMessageDialog(rootPane, "Matricula já existente!!");
			}
			else if(professor.cadastrarProfessor(this) == "Erro") {
				JOptionPane.showMessageDialog(rootPane, "Erro!!! Verifique com o Administrador");
			}
			
			
		}
		
		else if(e.getSource() == btnVoltar) {
			HomeAdminView h = new HomeAdminView();
			h.setVisible(true);
			this.dispose();
		}
		
		
}
	
}
