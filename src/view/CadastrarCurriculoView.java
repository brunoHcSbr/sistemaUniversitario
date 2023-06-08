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

import controller.CurriculoController;
import controller.CursoController;
import controller.DisciplinaController;

public class CadastrarCurriculoView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodCurriculo;
	private JTextField tfSemestreGrade;
	private JComboBox<String> comboBoxCurso;
	private JComboBox<String> comboBoxDisciplina;
	
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVoltar = new JButton("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCurriculoView frame = new CadastrarCurriculoView();
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
	public CadastrarCurriculoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1345, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 1329, 739);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastrarCurriculo = new JLabel("Cadastrar Curriculo");
		lblCadastrarCurriculo.setBounds(472, 39, 292, 36);
		lblCadastrarCurriculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarCurriculo.setForeground(new Color(0, 67, 121));
		lblCadastrarCurriculo.setFont(new Font("Arial Black", Font.BOLD, 25));
		panel.add(lblCadastrarCurriculo);
		
		tfCodCurriculo = new JTextField();
		tfCodCurriculo.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodCurriculo.setColumns(10);
		tfCodCurriculo.setBounds(461, 198, 123, 20);
		panel.add(tfCodCurriculo);
		
		
		CursoController cController = new CursoController();
		cController.listarCursos();		
		
		DisciplinaController dController = new DisciplinaController();
		dController.listarDisciplinas();
		// MODELO DE ComboBox
		DefaultComboBoxModel<String> comboBoxModelCurso = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelDisciplina = new DefaultComboBoxModel<>();
		
		
		
		for (String valor : cController.getListaCursos()) {
			comboBoxModelCurso.addElement(valor);
        }
		for (String valor : dController.getListaDisciplinas()) {
			comboBoxModelDisciplina.addElement(valor);
        }
		
		comboBoxCurso = new JComboBox<>(comboBoxModelCurso);
		comboBoxCurso.setBounds(461, 229, 123, 22);
		panel.add(comboBoxCurso);
		
		comboBoxDisciplina = new JComboBox<>(comboBoxModelDisciplina);
		comboBoxDisciplina.setBounds(461, 263, 123, 22);
		panel.add(comboBoxDisciplina);
		
		JLabel lbl_nome_5_1 = new JLabel("Código da Curriculo");
		lbl_nome_5_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(322, 200, 129, 14);
		panel.add(lbl_nome_5_1);
		
		JLabel lbl_nome_5_1_1 = new JLabel("Código do Curso");
		lbl_nome_5_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setBounds(343, 232, 108, 14);
		panel.add(lbl_nome_5_1_1);
		
		JLabel lbl_nome_5_1_2 = new JLabel("Código da Disciplina");
		lbl_nome_5_1_2.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_2.setBounds(322, 266, 129, 14);
		panel.add(lbl_nome_5_1_2);
		
		tfSemestreGrade = new JTextField();
		tfSemestreGrade.setHorizontalAlignment(SwingConstants.CENTER);
		tfSemestreGrade.setColumns(10);
		tfSemestreGrade.setBounds(461, 296, 123, 20);
		panel.add(tfSemestreGrade);
		
		JLabel lbl_nome_5_1_2_1 = new JLabel("Semestre Grade");
		lbl_nome_5_1_2_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_2_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_2_1.setBounds(343, 298, 108, 14);
		panel.add(lbl_nome_5_1_2_1);
		
		JLabel lbl_nome_5_1_1_1 = new JLabel("Nome do Curso");
		lbl_nome_5_1_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setBounds(642, 232, 108, 14);
		panel.add(lbl_nome_5_1_1_1);
		
		JLabel lbl_nome_5_1_2_2 = new JLabel("Nome da Disciplina");
		lbl_nome_5_1_2_2.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_2_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_2_2.setBounds(616, 265, 129, 14);
		panel.add(lbl_nome_5_1_2_2);
		
		
		
		
		JLabel lblNomeCurso = new JLabel("");
		lblNomeCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCurso.setForeground(new Color(0, 0, 0));
		lblNomeCurso.setFont(new Font("Arial Black", Font.PLAIN, 10));
		lblNomeCurso.setBackground(new Color(0, 65, 100));
		lblNomeCurso.setBounds(752, 229, 381, 18);
		panel.add(lblNomeCurso);
		
		JLabel lblNomeDisciplina = new JLabel("");
		lblNomeDisciplina.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNomeDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDisciplina.setForeground(new Color(0, 0, 0));
		lblNomeDisciplina.setFont(new Font("Arial Black", Font.PLAIN, 10));
		lblNomeDisciplina.setBackground(new Color(0, 65, 100));
		lblNomeDisciplina.setBounds(755, 263, 359, 14);
		panel.add(lblNomeDisciplina);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CadastrarCurriculoView.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(45, 599, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastrarCurriculoView.class.getResource("/resources/iconCurriculo.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(35, 11, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(0, 72, 100));
		btnCadastrar.setBounds(453, 389, 297, 50);
		panel.add(btnCadastrar);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastrarCurriculoView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1123, 39, 126, 100);
		panel.add(lblVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1165, 150, 72, 25);
		panel.add(lblVoltar2);
		
		btnVoltar.addActionListener(this);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1119, 29, 157, 125);
		panel.add(btnVoltar);
		
		comboBoxDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String valorSelecionado = (String) comboBoxDisciplina.getSelectedItem();
                
                dController.consultarNomeDisciplina(valorSelecionado);
                lblNomeDisciplina.setText(""+ dController.getNomeDisciplinas());
            }
        });
		
		comboBoxCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String valorSelecionado = (String) comboBoxCurso.getSelectedItem();
                
                cController.consultaCursoNome(valorSelecionado);
                lblNomeCurso.setText(""+ cController.getNomeCurso());
            }
        });
		
	}
	
	public JTextField getTfCodCurriculo() {
		return tfCodCurriculo;
	}

	public void setTfCodCurriculo(JTextField tfCodCurriculo) {
		this.tfCodCurriculo = tfCodCurriculo;
	}

	public JTextField getTfSemestreGrade() {
		return tfSemestreGrade;
	}

	public void setTfSemestreGrade(JTextField tfSemestreGrade) {
		this.tfSemestreGrade = tfSemestreGrade;
	}

	public JComboBox<String> getComboBoxCurso() {
		return comboBoxCurso;
	}

	public void setComboBoxCurso(JComboBox<String> comboBoxCurso) {
		this.comboBoxCurso = comboBoxCurso;
	}

	public JComboBox<String> getComboBoxDisciplina() {
		return comboBoxDisciplina;
	}

	public void setComboBoxDisciplina(JComboBox<String> comboBoxDisciplina) {
		this.comboBoxDisciplina = comboBoxDisciplina;
	}
	
	
	
	
	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			CurriculoController c = new CurriculoController();
			
			
			
			if(tfCodCurriculo.getText().matches("") ||tfSemestreGrade.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(c.cadastrarCurriculo(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (c.cadastrarCurriculo(this) == "Curriculo existe"){
				JOptionPane.showMessageDialog(rootPane, "Curriculo já existente!!");
			}
			else if(c.cadastrarCurriculo(this) == "Erro") {
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
