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

import controller.AlunoController;

public class CadastroAluno extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfBairro;
	private JTextField tfNome;
	private JTextField tfRua;
	private JTextField tfNumeroCasa;
	private JTextField tfCidade;
	private JTextField tfEmail;
	
	private JFormattedTextField tfRA;
	private JFormattedTextField tfCPF;
	private JFormattedTextField tfRG;
	private JFormattedTextField tfCEP;
	private JFormattedTextField tfUf;
	private JFormattedTextField tfTelefone;
	private JFormattedTextField tfDataNasc;
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVoltar = new JButton("Voltar");
	
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
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 1350, 731);
		contentPane.add(panel);
		
		JLabel lbl_nome_3 = new JLabel("Bairro");
		lbl_nome_3.setForeground(new Color(0, 65, 100));
		lbl_nome_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3.setBounds(314, 249, 46, 14);
		panel.add(lbl_nome_3);
		
		tfBairro = new JTextField();
		tfBairro.setHorizontalAlignment(SwingConstants.CENTER);
		tfBairro.setColumns(10);
		tfBairro.setBounds(370, 245, 707, 25);
		panel.add(tfBairro);
		
		tfCPF  = new JFormattedTextField(Mascara("###.###.###-##"));
		tfCPF.setHorizontalAlignment(SwingConstants.CENTER);
		tfCPF.setColumns(10);
		tfCPF.setBounds(370, 209, 178, 25);
		panel.add(tfCPF);
		
		tfRG  = new JFormattedTextField(Mascara("##.###.###-#"));
		tfRG.setHorizontalAlignment(SwingConstants.CENTER);
		tfRG.setColumns(10);
		tfRG.setBounds(593, 209, 178, 25);
		panel.add(tfRG);
		
		JLabel lbl_nome_2_1 = new JLabel("RG");
		lbl_nome_2_1.setForeground(new Color(0, 65, 100));
		lbl_nome_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_2_1.setBounds(558, 213, 36, 14);
		panel.add(lbl_nome_2_1);
		
		JLabel lbl_nome_2 = new JLabel("CPF");
		lbl_nome_2.setForeground(new Color(0, 65, 100));
		lbl_nome_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_2.setBounds(324, 213, 36, 14);
		panel.add(lbl_nome_2);
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setColumns(10);
		tfNome.setBounds(370, 163, 707, 25);
		panel.add(tfNome);
		
		tfRA  = new JFormattedTextField(Mascara("#############"));
		tfRA.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		tfRA.setColumns(10);
		tfRA.setBounds(370, 126, 178, 25);
		panel.add(tfRA);
		
		JLabel lbl_nome_1 = new JLabel("Nome");
		lbl_nome_1.setForeground(new Color(0, 65, 100));
		lbl_nome_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_1.setBounds(314, 167, 46, 14);
		panel.add(lbl_nome_1);
		
		JLabel lbl_nome_3_1 = new JLabel("Rua");
		lbl_nome_3_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1.setBounds(324, 367, 36, 14);
		panel.add(lbl_nome_3_1);
		
		JLabel lbl_nome_3_1_1 = new JLabel("N°");
		lbl_nome_3_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_1.setBounds(885, 367, 36, 14);
		panel.add(lbl_nome_3_1_1);
		
		JLabel lblCadastroDoAluno = new JLabel("CADASTRO DO ALUNO");
		lblCadastroDoAluno.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDoAluno.setForeground(new Color(0, 65, 100));
		lblCadastroDoAluno.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCadastroDoAluno.setBounds(370, 65, 551, 35);
		panel.add(lblCadastroDoAluno);
		
		JLabel lbl_nome = new JLabel("RA");
		lbl_nome.setForeground(new Color(0, 65, 100));
		lbl_nome.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome.setBackground(Color.GRAY);
		lbl_nome.setBounds(331, 131, 29, 14);
		panel.add(lbl_nome);
		
		tfRua = new JTextField();
		tfRua.setHorizontalAlignment(SwingConstants.CENTER);
		tfRua.setColumns(10);
		tfRua.setBounds(370, 363, 505, 25);
		panel.add(tfRua);
		
		tfNumeroCasa = new JTextField();
		tfNumeroCasa.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumeroCasa.setColumns(10);
		tfNumeroCasa.setBounds(928, 363, 149, 25);
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
		tfCidade.setBounds(370, 404, 505, 25);
		panel.add(tfCidade);
		
		JLabel lbl_nome_3_1_3 = new JLabel("Cidade");
		lbl_nome_3_1_3.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_3.setBounds(314, 408, 46, 14);
		panel.add(lbl_nome_3_1_3);
		
		tfUf  = new JFormattedTextField(Mascara("AA"));
		tfUf.setHorizontalAlignment(SwingConstants.CENTER);
		tfUf.setColumns(10);
		tfUf.setBounds(928, 404, 149, 25);
		panel.add(tfUf);
		
		
		
		JLabel lbl_nome_3_1_1_1 = new JLabel("UF");
		lbl_nome_3_1_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_1_1_1.setBounds(885, 408, 36, 14);
		panel.add(lbl_nome_3_1_1_1);
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(0, 65, 100));
		btnCadastrar.setBounds(465, 454, 320, 43);
		panel.add(btnCadastrar);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmail.setColumns(10);
		tfEmail.setBounds(370, 281, 354, 25);
		panel.add(tfEmail);
		
		JLabel lbl_nome_3_2 = new JLabel("E-mail");
		lbl_nome_3_2.setForeground(new Color(0, 65, 100));
		lbl_nome_3_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_3_2.setBounds(314, 286, 46, 14);
		panel.add(lbl_nome_3_2);
		
		tfTelefone = new JFormattedTextField(Mascara("(##) #####-####"));
		tfTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(814, 281, 263, 25);
		panel.add(tfTelefone);
		
		JLabel lbl_nome_4 = new JLabel("Telefone");
		lbl_nome_4.setForeground(new Color(0, 65, 100));
		lbl_nome_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_4.setBackground(Color.GRAY);
		lbl_nome_4.setBounds(734, 285, 70, 14);
		panel.add(lbl_nome_4);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastroAluno.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1195, 36, 126, 100);
		panel.add(lblVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1229, 147, 72, 25);
		panel.add(lblVoltar2);
		
		btnVoltar.addActionListener(this);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1143, 40, 178, 132);
		panel.add(btnVoltar);
		
		tfDataNasc = new JFormattedTextField(Mascara("##/##/####"));
		tfDataNasc.setHorizontalAlignment(SwingConstants.CENTER);
		tfDataNasc.setColumns(10);
		tfDataNasc.setBounds(899, 209, 178, 25);
		panel.add(tfDataNasc);
		
		JLabel lbl_nome_2_1_1 = new JLabel("Data Nascimento");
		lbl_nome_2_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_2_1_1.setBounds(781, 213, 108, 14);
		panel.add(lbl_nome_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CadastroAluno.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(34, 601, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastroAluno.class.getResource("/resources/iconAluno.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(52, 29, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
	}
	

	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			AlunoController aluno = new AlunoController();
			
			System.out.println(tfDataNasc.getText());
			
			
			
			if(tfRA.getText().matches("") || tfNome.getText().matches("") ||tfCPF.getText().matches("") || tfRG.getText().matches("")
					|| tfDataNasc.getText().matches("") || tfBairro.getText().matches("")|| tfEmail.getText().matches("")
					|| tfTelefone.getText().matches("") || tfCEP.getText().matches("") || tfRua.getText().matches("") ||
					tfRua.getText().matches("") || tfNumeroCasa.getText().matches("") || tfCidade.getText().matches("") || tfUf.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(aluno.cadastroAluno(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (aluno.cadastroAluno(this) == "RA existe"){
				JOptionPane.showMessageDialog(rootPane, "RA já existente!!");
			}
			else if(aluno.cadastroAluno(this) == "Erro") {
				JOptionPane.showMessageDialog(rootPane, "Erro!!! Verifique com o Administrador");
			}
			
			
		}
		
		else if(e.getSource() == btnVoltar) {
			HomeAdminView h = new HomeAdminView();
			h.setVisible(true);
			this.dispose();
		}
}

	public JTextField getTfBairro() {
		return tfBairro;
	}

	public void setTfBairro(JTextField tfBairro) {
		this.tfBairro = tfBairro;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
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

	public JFormattedTextField getTfRA() {
		return tfRA;
	}

	public void setTfRA(JFormattedTextField tfRA) {
		this.tfRA = tfRA;
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
}
