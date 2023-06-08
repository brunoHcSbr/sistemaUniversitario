package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.NotasController;
import controller.ProfessorController;
import controller.TurmaController;

public class ModeloNotaView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> comboBoxTurma;
	private JTextField tfDescricao;
	private JFormattedTextField tfSiglaNota;
	private JFormattedTextField tfPesoNota;

	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btn_InserirNotas = new JButton("");
	JButton btn_InformaPessoais = new JButton("");
	JButton btnInicio = new JButton("");
	
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
					ModeloNotaView frame = new ModeloNotaView();
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
	public ModeloNotaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 783);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel containerFundo = new JPanel();
		containerFundo.setLayout(null);
		containerFundo.setBackground(Color.WHITE);
		containerFundo.setBounds(0, 0, 1348, 746);
		contentPane.add(containerFundo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(69, 69, 69));
		panel.setBounds(-12, -11, 286, 757);
		containerFundo.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblNewLabel.setBounds(46, 282, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(Color.WHITE);
		lblInformaesPesssoais.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInformaesPesssoais.setBounds(46, 328, 215, 23);
		panel.add(lblInformaesPesssoais);
		
		JLabel lbl_InserirNotas = new JLabel("Inserir Modelos de Notas");
		lbl_InserirNotas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas.setForeground(new Color(0, 244, 140));
		lbl_InserirNotas.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas.setBounds(46, 378, 214, 23);
		panel.add(lbl_InserirNotas);
		
		JLabel lbl_Professor = new JLabel("null");
		lbl_Professor.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Professor.setForeground(new Color(55, 255, 115));
		lbl_Professor.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Professor.setBounds(10, 57, 276, 23);
		panel.add(lbl_Professor);
		
		JLabel lbl_RaDescricao = new JLabel("Matricula");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(10, 91, 276, 23);
		panel.add(lbl_RaDescricao);
		
		JLabel lbl_Matricula = new JLabel("null");
		lbl_Matricula.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Matricula.setForeground(new Color(55, 255, 115));
		lbl_Matricula.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_Matricula.setBounds(10, 120, 276, 23);
		panel.add(lbl_Matricula);
		
		JLabel lbl_AlunoDescricao = new JLabel("Professor");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(10, 23, 266, 23);
		panel.add(lbl_AlunoDescricao);
		
		btnInicio.addActionListener(this);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBounds(47, 282, 68, 23);
		panel.add(btnInicio);
		
		JLabel lbl_InserirNotas_1_1 = new JLabel("Inserir Notas");
		lbl_InserirNotas_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas_1_1.setForeground(Color.WHITE);
		lbl_InserirNotas_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas_1_1.setBounds(46, 424, 197, 23);
		panel.add(lbl_InserirNotas_1_1);
		
		btn_InformaPessoais.addActionListener(this);
		btn_InformaPessoais.setContentAreaFilled(false);
		btn_InformaPessoais.setBorderPainted(false);
		btn_InformaPessoais.setBounds(46, 328, 197, 23);
		panel.add(btn_InformaPessoais);
		
		JButton btn_ModeloNota = new JButton("");
		btn_ModeloNota.setContentAreaFilled(false);
		btn_ModeloNota.setBorderPainted(false);
		btn_ModeloNota.setBounds(46, 378, 215, 23);
		panel.add(btn_ModeloNota);
		
		btn_InserirNotas.addActionListener(this);
		btn_InserirNotas.setContentAreaFilled(false);
		btn_InserirNotas.setBorderPainted(false);
		btn_InserirNotas.setBounds(46, 424, 115, 23);
		panel.add(btn_InserirNotas);
		
		
		DefaultComboBoxModel<String> comboBoxModelTurma = new DefaultComboBoxModel<>();
		
		TurmaController tController = new TurmaController();
		tController.listarTurmas(LoginView2.getMatricula());
		
		for (String valor : tController.getListaTurmas()) {
			comboBoxModelTurma.addElement(valor);
        }
		
		
		
		comboBoxTurma = new JComboBox<>(comboBoxModelTurma);
		comboBoxTurma.setBounds(649, 55, 345, 22);
		containerFundo.add(comboBoxTurma);
		
		JLabel lbl_InserirNotas_1 = new JLabel("Escolha a Turma para Inserir os Modelos de notas");
		lbl_InserirNotas_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas_1.setForeground(new Color(0, 99, 147));
		lbl_InserirNotas_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas_1.setBounds(618, 21, 451, 23);
		containerFundo.add(lbl_InserirNotas_1);
		
		tfSiglaNota = new JFormattedTextField(Mascara("AA"));
		tfSiglaNota.setBounds(649, 117, 345, 20);
		containerFundo.add(tfSiglaNota);
		tfSiglaNota.setColumns(10);
		
		JLabel lbl_nome_5_1_1 = new JLabel("Sigla da Nota");
		lbl_nome_5_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setBounds(549, 119, 90, 14);
		containerFundo.add(lbl_nome_5_1_1);
		
		JLabel lbl_nome_5_1_1_1 = new JLabel("Peso Nota");
		lbl_nome_5_1_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setBounds(549, 156, 90, 14);
		containerFundo.add(lbl_nome_5_1_1_1);
		
		tfPesoNota = new JFormattedTextField(Mascara("#"));
		tfPesoNota.setColumns(10);
		tfPesoNota.setBounds(649, 154, 180, 20);
		containerFundo.add(tfPesoNota);
		
		JLabel lbl_nome_5_1_1_2 = new JLabel("Descrição");
		lbl_nome_5_1_1_2.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setBounds(555, 197, 84, 14);
		containerFundo.add(lbl_nome_5_1_1_2);
		
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		tfDescricao.setBounds(649, 195, 345, 20);
		containerFundo.add(tfDescricao);
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(138, 0, 0));
		btnCadastrar.setBounds(668, 273, 297, 50);
		containerFundo.add(btnCadastrar);
		
		ProfessorController pController = new ProfessorController();
		pController.consultarProfessor(LoginView2.getMatricula());
		
		lbl_Professor.setText(""+ pController.getNome());
		lbl_Matricula.setText(""+ LoginView2.getMatricula());
	}
	

	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			NotasController n = new NotasController();
			
			
			if(tfSiglaNota.getText().matches("") || tfDescricao.getText().matches("") || tfPesoNota.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(n.cadastroCurso(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (n.cadastroCurso(this) == "Nota existe"){
				JOptionPane.showMessageDialog(rootPane, "Sigla da nota já existente!!");
			}
			else if(n.cadastroCurso(this) == "Erro") {
				JOptionPane.showMessageDialog(rootPane, "Erro!!! Verifique com o Administrador");
			}
			
			
		}
		else if(e.getSource() == btn_InformaPessoais ){
			InformacoesProfessorView info = new InformacoesProfessorView();
			info.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btn_InserirNotas ) {
			InserirNotaView  view= new InserirNotaView ();
			view.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnInicio) {
			
			HomeProfessorView home = new HomeProfessorView();
			home.setVisible(true);
			this.dispose();
		}
	
		
}




	public JComboBox<String> getComboBoxTurma() {
		return comboBoxTurma;
	}




	public void setComboBoxTurma(JComboBox<String> comboBoxTurma) {
		this.comboBoxTurma = comboBoxTurma;
	}




	public JTextField getTfDescricao() {
		return tfDescricao;
	}




	public void setTfDescricao(JTextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}




	public JFormattedTextField getTfSiglaNota() {
		return tfSiglaNota;
	}




	public void setTfSiglaNota(JFormattedTextField tfSiglaNota) {
		this.tfSiglaNota = tfSiglaNota;
	}




	public JFormattedTextField getTfPesoNota() {
		return tfPesoNota;
	}




	public void setTfPesoNota(JFormattedTextField tfPesoNota) {
		this.tfPesoNota = tfPesoNota;
	}
	
	
}
