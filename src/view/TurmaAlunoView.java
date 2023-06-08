package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import controller.HistoricoController;
import controller.TurmaController;

public class TurmaAlunoView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodHistorico;
	private JComboBox<String> comboBoxAluno;
	private JComboBox<String> comboBoxTurma;
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVoltar = new JButton("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TurmaAlunoView frame = new TurmaAlunoView();
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
	public TurmaAlunoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1367, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1351, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastrarTurma = new JLabel("Inserir Aluno em uma Turma");
		lblCadastrarTurma.setBounds(392, 40, 496, 36);
		lblCadastrarTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarTurma.setForeground(new Color(138, 0, 0));
		lblCadastrarTurma.setFont(new Font("Arial Black", Font.BOLD, 25));
		panel.add(lblCadastrarTurma);
		
		JLabel lbl_nome_5_1 = new JLabel("Código da Turma");
		lbl_nome_5_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(465, 158, 109, 14);
		panel.add(lbl_nome_5_1);
		
		DefaultComboBoxModel<String> comboBoxModelTurma = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelAluno = new DefaultComboBoxModel<>();
		
		AlunoController aController = new AlunoController();
		aController.listarAluno();
		
		for (String valor : aController.getListaAlunos()) {
			comboBoxModelAluno.addElement(valor);
        }
		
		TurmaController tController = new TurmaController();
		tController.listarTurmas();
		
		for (String valor : tController.getListaTurmas()) {
			comboBoxModelTurma.addElement(valor);
        }
		
		comboBoxTurma = new JComboBox<>(comboBoxModelTurma);
		comboBoxTurma.setBounds(598, 155, 103, 22);
		panel.add(comboBoxTurma);
		
		comboBoxAluno = new JComboBox<>(comboBoxModelAluno);
		comboBoxAluno.setBounds(598, 188, 103, 22);
		panel.add(comboBoxAluno);
		
		JLabel lbl_nome_5_1_1_1 = new JLabel("Código do Aluno");
		lbl_nome_5_1_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setBounds(475, 191, 109, 14);
		panel.add(lbl_nome_5_1_1_1);
		
		tfCodHistorico = new JTextField();
		tfCodHistorico.setBounds(598, 124, 103, 20);
		panel.add(tfCodHistorico);
		tfCodHistorico.setColumns(10);
		
		JLabel lbl_nome_5_1_1 = new JLabel("Código do Histórico");
		lbl_nome_5_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setBounds(455, 126, 133, 14);
		panel.add(lbl_nome_5_1_1);
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
		btnCadastrar.setBounds(516, 304, 297, 50);
		panel.add(btnCadastrar);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(TurmaAlunoView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1195, 40, 126, 100);
		panel.add(lblVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1249, 159, 72, 25);
		panel.add(lblVoltar2);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnVoltar.addActionListener(this);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1184, 36, 157, 125);
		panel.add(btnVoltar);
	}
	
	public JTextField getTfCodHistorico() {
		return tfCodHistorico;
	}

	public void setTfCodHistorico(JTextField tfCodHistorico) {
		this.tfCodHistorico = tfCodHistorico;
	}

	public JComboBox<String> getComboBoxAluno() {
		return comboBoxAluno;
	}

	public void setComboBoxAluno(JComboBox<String> comboBoxAluno) {
		this.comboBoxAluno = comboBoxAluno;
	}

	public JComboBox<String> getComboBoxTurma() {
		return comboBoxTurma;
	}

	public void setComboBoxTurma(JComboBox<String> comboBoxTurma) {
		this.comboBoxTurma = comboBoxTurma;
	}
	
	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			HistoricoController h = new HistoricoController();
			
			
			if(tfCodHistorico.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(h.cadastrarHistorico(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (h.cadastrarHistorico(this) == "Historico existe"){
				JOptionPane.showMessageDialog(rootPane, "Curriculo já existente!!");
			}
			else if(h.cadastrarHistorico(this) == "Erro") {
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
