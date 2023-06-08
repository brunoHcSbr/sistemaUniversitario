package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.HistoricoController;
import controller.NotasController;
import controller.ProfessorController;
import controller.TurmaController;

public class InserirNotaView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	JButton btnInicio = new JButton("");
	JButton btn_InformaPessoais = new JButton("");
	JButton btn_ModeloNota = new JButton("");
	JButton btnInserirNota = new JButton("Inserir");
	JButton btnCalcular = new JButton("Calcular");
	
	
	private JComboBox<String> comboBoxTurma;
	private JComboBox<String> comboBoxAluno;
	private JComboBox<String> comboBoxSigla;
	private JComboBox<String> comboBoxVisualizarNotas;
	private List<Float> notasAluno = new ArrayList<>();
	private List<Float> pesoNotas = new ArrayList<>();
	private JTextField tfNota;
	
	public List<Float> getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(List<Float> notasAluno) {
		this.notasAluno = notasAluno;
	}

	public List<Float> getPesoNotas() {
		return pesoNotas;
	}

	public void setPesoNotas(List<Float> pesoNotas) {
		this.pesoNotas = pesoNotas;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirNotaView frame = new InserirNotaView();
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
	public InserirNotaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 1344, 743);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(69, 69, 69));
		panel_1.setBounds(0, 0, 286, 757);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblNewLabel.setBounds(46, 282, 49, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(Color.WHITE);
		lblInformaesPesssoais.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInformaesPesssoais.setBounds(46, 328, 215, 23);
		panel_1.add(lblInformaesPesssoais);
		
		JLabel lbl_InserirNotas = new JLabel("Inserir Modelos de Notas");
		lbl_InserirNotas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas.setForeground(new Color(255, 255, 255));
		lbl_InserirNotas.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas.setBounds(46, 378, 214, 23);
		panel_1.add(lbl_InserirNotas);
		
		JLabel lbl_Professor = new JLabel("null");
		lbl_Professor.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Professor.setForeground(new Color(55, 255, 115));
		lbl_Professor.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Professor.setBounds(10, 57, 276, 23);
		panel_1.add(lbl_Professor);
		
		JLabel lbl_RaDescricao = new JLabel("Matricula");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(10, 91, 276, 23);
		panel_1.add(lbl_RaDescricao);
		
		JLabel lbl_Matricula = new JLabel("null");
		lbl_Matricula.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Matricula.setForeground(new Color(55, 255, 115));
		lbl_Matricula.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_Matricula.setBounds(10, 120, 276, 23);
		panel_1.add(lbl_Matricula);
		
		JLabel lbl_AlunoDescricao = new JLabel("Professor");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(10, 23, 266, 23);
		panel_1.add(lbl_AlunoDescricao);
		
		btnInicio.addActionListener(this);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBounds(47, 282, 68, 23);
		panel_1.add(btnInicio);
		
		JLabel lbl_InserirNotas_1_1 = new JLabel("Inserir Notas");
		lbl_InserirNotas_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas_1_1.setForeground(new Color(28, 255, 107));
		lbl_InserirNotas_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas_1_1.setBounds(46, 424, 197, 23);
		panel_1.add(lbl_InserirNotas_1_1);
		
		btn_InformaPessoais.addActionListener(this);
		btn_InformaPessoais.setContentAreaFilled(false);
		btn_InformaPessoais.setBorderPainted(false);
		btn_InformaPessoais.setBounds(46, 328, 197, 23);
		panel_1.add(btn_InformaPessoais);
		
		btn_ModeloNota.addActionListener(this);
		btn_ModeloNota.setContentAreaFilled(false);
		btn_ModeloNota.setBorderPainted(false);
		btn_ModeloNota.setBounds(46, 378, 215, 23);
		panel_1.add(btn_ModeloNota);
		
		JButton btn_InserirNotas = new JButton("");
		btn_InserirNotas.setContentAreaFilled(false);
		btn_InserirNotas.setBorderPainted(false);
		btn_InserirNotas.setBounds(46, 424, 115, 23);
		panel_1.add(btn_InserirNotas);
		
		DefaultComboBoxModel<String> comboBoxModelTurma = new DefaultComboBoxModel<>();
		
		TurmaController tController = new TurmaController();
		tController.listarTurmas(LoginView2.getMatricula());
		
		for (String valor : tController.getListaTurmas()) {
			comboBoxModelTurma.addElement(valor);
        }
		
		
		
		comboBoxTurma = new JComboBox<>(comboBoxModelTurma);
		comboBoxTurma.setBounds(598, 57, 395, 22);
		panel.add(comboBoxTurma);
		
		
		JLabel lblEscolhaTurma = new JLabel("Escolha a Turma para Inserir os Modelos de notas");
		lblEscolhaTurma.setHorizontalAlignment(SwingConstants.LEFT);
		lblEscolhaTurma.setForeground(new Color(0, 99, 147));
		lblEscolhaTurma.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblEscolhaTurma.setBounds(587, 23, 451, 23);
		panel.add(lblEscolhaTurma);
		
		DefaultComboBoxModel<String> comboBoxModelAluno = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelSigla = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelVisualizarNotas = new DefaultComboBoxModel<>();
		
		HistoricoController hController = new HistoricoController();
		NotasController nController = new NotasController();
		
		comboBoxTurma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	int valorSelecionado = Integer.parseInt((String) comboBoxTurma.getSelectedItem());
            	
            	
            	hController.listarAluno(valorSelecionado);
            	comboBoxAluno.removeAllItems();
            	for (String valor : hController.getListaAlunos()) {
        			comboBoxModelAluno.addElement(valor);
                }   
            	
            	nController.listarSiglas(valorSelecionado);
            	comboBoxSigla.removeAllItems();
            	for (String valor : nController.getListaSiglas()) {
        			comboBoxModelSigla.addElement(valor);
        			
        			nController.consultarSiglas(valor, (String) comboBoxAluno.getSelectedItem());
        			comboBoxModelVisualizarNotas.addElement(valor+": "+nController.getValor() + "       [ Peso da Nota: " + nController.getPesoNota() + " ]");
        			notasAluno.add(nController.getValor());
        			pesoNotas.add(nController.getPesoNota());
                } 
            }
        });
		
		
		
		
		comboBoxAluno = new JComboBox<>(comboBoxModelAluno);
		comboBoxAluno.setBounds(598, 147, 395, 22);
		panel.add(comboBoxAluno);
		
		JLabel lblEscolhaAluno = new JLabel("Escolha o Aluno para Inserir a Nota");
		lblEscolhaAluno.setHorizontalAlignment(SwingConstants.LEFT);
		lblEscolhaAluno.setForeground(new Color(0, 99, 147));
		lblEscolhaAluno.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblEscolhaAluno.setBounds(632, 113, 312, 23);
		panel.add(lblEscolhaAluno);
		
		comboBoxSigla = new JComboBox<>(comboBoxModelSigla);
		comboBoxSigla.setBounds(598, 213, 395, 22);
		panel.add(comboBoxSigla);
		
		comboBoxVisualizarNotas = new JComboBox<>(comboBoxModelVisualizarNotas);
		comboBoxVisualizarNotas.setBounds(588, 488, 405, 22);
		panel.add(comboBoxVisualizarNotas);
		
		JLabel lblEscolhaASigla = new JLabel("Escolha a Sigla");
		lblEscolhaASigla.setHorizontalAlignment(SwingConstants.LEFT);
		lblEscolhaASigla.setForeground(new Color(0, 99, 147));
		lblEscolhaASigla.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblEscolhaASigla.setBounds(729, 180, 125, 23);
		panel.add(lblEscolhaASigla);
		
		tfNota = new JTextField();
		tfNota.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota.setDocument(new LimitaCaracteres(3, LimitaCaracteres.TipoEntrada.NUMERODECIMAL));
		tfNota.setBounds(733, 274, 125, 20);
		panel.add(tfNota);
		tfNota.setColumns(10);
		
		JLabel lblInserirANota = new JLabel("Inserir a nota");
		lblInserirANota.setHorizontalAlignment(SwingConstants.LEFT);
		lblInserirANota.setForeground(new Color(0, 99, 147));
		lblInserirANota.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInserirANota.setBounds(733, 246, 125, 23);
		panel.add(lblInserirANota);
		
		btnInserirNota.addActionListener(this);
		btnInserirNota.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInserirNota.setBorderPainted(false);
		btnInserirNota.setBackground(new Color(121, 0, 0));
		btnInserirNota.setForeground(new Color(255, 255, 255));
		btnInserirNota.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnInserirNota.setBounds(743, 315, 115, 30);
		panel.add(btnInserirNota);
		
		ProfessorController pController = new ProfessorController();
		pController.consultarProfessor(LoginView2.getMatricula());
		
		lbl_Professor.setText(""+ pController.getNome());
		lbl_Matricula.setText(""+ LoginView2.getMatricula());
		
		JLabel lblCalcularMdia = new JLabel("Calcular Média");
		lblCalcularMdia.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalcularMdia.setForeground(new Color(130, 0, 0));
		lblCalcularMdia.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblCalcularMdia.setBounds(729, 451, 125, 23);
		panel.add(lblCalcularMdia);
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnCalcular.addActionListener(this);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnCalcular.setBorderPainted(false);
		btnCalcular.setBackground(new Color(121, 0, 0));
		btnCalcular.setBounds(743, 539, 115, 30);
		panel.add(btnCalcular);
	}
	public JComboBox<String> getComboBoxTurma() {
		return comboBoxTurma;
	}

	public void setComboBoxTurma(JComboBox<String> comboBoxTurma) {
		this.comboBoxTurma = comboBoxTurma;
	}

	public JComboBox<String> getComboBoxAluno() {
		return comboBoxAluno;
	}

	public void setComboBoxAluno(JComboBox<String> comboBoxAluno) {
		this.comboBoxAluno = comboBoxAluno;
	}

	public JComboBox<String> getComboBoxSigla() {
		return comboBoxSigla;
	}

	public void setComboBoxSigla(JComboBox<String> comboBoxSigla) {
		this.comboBoxSigla = comboBoxSigla;
	}

	public JTextField getTfNota() {
		return tfNota;
	}

	public void setTfNota(JTextField tfNota) {
		this.tfNota = tfNota;
	}

	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn_InformaPessoais ){
			InformacoesProfessorView info = new InformacoesProfessorView();
			info.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btn_ModeloNota ) {
			ModeloNotaView  view= new ModeloNotaView ();
			view.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnInicio) {
			
			HomeProfessorView home = new HomeProfessorView();
			home.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnInserirNota) {
			
			NotasController nController = new NotasController();
			
			
			
			if(tfNota.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(nController.inserirNota(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Inserida com Sucesso!!!");
				
			}
			else if (nController.inserirNota(this) == "Nota existe"){
				JOptionPane.showMessageDialog(rootPane, "Nota já existente!!");
			}
			else if(nController.inserirNota(this) == "Erro") {
				JOptionPane.showMessageDialog(rootPane, "Erro!!! Verifique com o Administrador");
			}
			
		}
		else if(e.getSource() == btnCalcular) {
			
			NotasController nController = new NotasController();
			
			
			
			if (nController.calcularMedia(this) == "false"){
				JOptionPane.showMessageDialog(rootPane, "Ainda existe notas sem valores!!");
			}
			else if(nController.calcularMedia(this) == "Media cadastrada") {
				JOptionPane.showMessageDialog(rootPane, "Inserida com Sucesso!!!");
				
			}
			
			else if(nController.calcularMedia(this) == "Erro") {
				JOptionPane.showMessageDialog(rootPane, "Erro!!! Verifique com o Administrador");
			}
			
		}
	
		
}
}
