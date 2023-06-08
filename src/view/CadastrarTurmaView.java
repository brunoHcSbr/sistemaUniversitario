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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.CurriculoController;
import controller.ProfessorController;
import controller.TurmaController;

public class CadastrarTurmaView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodTurma;
	private JTextField tfAno;
	private JTextField tfHoraInicio;
	private JTextField tfHorafim;
	private JComboBox<String> comboBoxProfessor;
	private JComboBox<String> comboBoxCurriculo;
	private JComboBox<String> comboBoxDia;
	private JComboBox<String> comboBoxSemestre;
	
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
					CadastrarTurmaView frame = new CadastrarTurmaView();
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
	public CadastrarTurmaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1350, 733);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastrarTurma = new JLabel("Cadastrar Turma");
		lblCadastrarTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarTurma.setForeground(new Color(138, 0, 0));
		lblCadastrarTurma.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblCadastrarTurma.setBounds(476, 54, 405, 36);
		panel.add(lblCadastrarTurma);
		
		JLabel lbl_nome_5_1 = new JLabel("Código da Turma");
		lbl_nome_5_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(294, 147, 109, 14);
		panel.add(lbl_nome_5_1);
		
		tfCodTurma = new JTextField();
		tfCodTurma.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodTurma.setColumns(10);
		tfCodTurma.setBounds(413, 145, 123, 20);
		panel.add(tfCodTurma);
		
		JLabel lbl_nome_5_1_1 = new JLabel("Professor Responsável");
		lbl_nome_5_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setBounds(253, 184, 150, 14);
		panel.add(lbl_nome_5_1_1);
		
		
		DefaultComboBoxModel<String> comboBoxModelProfessor = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelCurriculo = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelDia = new DefaultComboBoxModel<>();
		DefaultComboBoxModel<String> comboBoxModelSemestre = new DefaultComboBoxModel<>();
		
		ProfessorController pController = new ProfessorController();;
		pController.listarProfessores();
		
		for (String valor : pController.getListaProfessores()) {
			comboBoxModelProfessor.addElement(valor);
        }
		
		CurriculoController cController = new CurriculoController();
		cController.listarCurriculo();
		
		for (String valor : cController.getListaCurriculo()) {
			comboBoxModelCurriculo.addElement(valor);
        }
		
		
		comboBoxProfessor = new JComboBox<>(comboBoxModelProfessor);
		comboBoxProfessor.setBounds(413, 181, 123, 22);
		panel.add(comboBoxProfessor);
		
		comboBoxCurriculo = new JComboBox<>(comboBoxModelCurriculo);
		comboBoxCurriculo.setBounds(413, 224, 123, 22);
		panel.add(comboBoxCurriculo);
		
		
		comboBoxModelDia.addElement("Segunda-Feira");
		comboBoxModelDia.addElement("Terça-Feira");
		comboBoxModelDia.addElement("Quarta-Feira");
		comboBoxModelDia.addElement("Quinta-Feira");
		comboBoxModelDia.addElement("Sexta-Feira");
		comboBoxModelDia.addElement("Sabado");
		comboBoxModelDia.addElement("Domingo");
		
		comboBoxDia = new JComboBox<>(comboBoxModelDia);
		comboBoxDia.setBounds(413, 319, 123, 22);
		panel.add(comboBoxDia);
		
		comboBoxModelSemestre.addElement("1");
		comboBoxModelSemestre.addElement("2");
		
		comboBoxSemestre = new JComboBox<>(comboBoxModelSemestre);
		comboBoxSemestre.setBounds(413, 287, 123, 22);
		panel.add(comboBoxSemestre);
		
		JLabel lbl_nome_5_1_1_1 = new JLabel("Dia da Aula");
		lbl_nome_5_1_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setBounds(325, 322, 78, 14);
		panel.add(lbl_nome_5_1_1_1);
		
		JLabel lbl_nome_5_1_1_2 = new JLabel("Código do Curriculo");
		lbl_nome_5_1_1_2.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setBounds(273, 228, 130, 14);
		panel.add(lbl_nome_5_1_1_2);
		
		JLabel lbl_nome_5_1_1_2_1 = new JLabel("Semestre do Ano");
		lbl_nome_5_1_1_2_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1.setBounds(294, 290, 109, 14);
		panel.add(lbl_nome_5_1_1_2_1);
		
		tfAno = new JTextField();
		tfAno.setHorizontalAlignment(SwingConstants.CENTER);
		tfAno.setColumns(10);
		tfAno.setBounds(413, 257, 123, 20);
		panel.add(tfAno);
		
		JLabel lbl_nome_5_1_1_1_1 = new JLabel("Ano");
		lbl_nome_5_1_1_1_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1_1.setBounds(364, 260, 39, 14);
		panel.add(lbl_nome_5_1_1_1_1);
		
		tfHoraInicio = new JFormattedTextField(Mascara("##:##:##"));
		tfHoraInicio.setHorizontalAlignment(SwingConstants.CENTER);
		tfHoraInicio.setColumns(10);
		tfHoraInicio.setBounds(413, 352, 123, 20);
		panel.add(tfHoraInicio);
		
		tfHorafim = new JFormattedTextField(Mascara("##:##:##"));
		tfHorafim.setHorizontalAlignment(SwingConstants.CENTER);
		tfHorafim.setColumns(10);
		tfHorafim.setBounds(413, 383, 123, 20);
		panel.add(tfHorafim);
		
		JLabel lbl_nome_5_1_1_1_2 = new JLabel("Inicio da Aula");
		lbl_nome_5_1_1_1_2.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1_2.setBounds(307, 355, 96, 14);
		panel.add(lbl_nome_5_1_1_1_2);
		
		JLabel lbl_nome_5_1_1_1_2_1 = new JLabel("Fim da Aula");
		lbl_nome_5_1_1_1_2_1.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1_2_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1_2_1.setBounds(317, 386, 86, 14);
		panel.add(lbl_nome_5_1_1_1_2_1);
		
		JLabel lbl_nome_5_1_1_3 = new JLabel("Nome  :");
		lbl_nome_5_1_1_3.setForeground(new Color(138, 0, 0));
		lbl_nome_5_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_3.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_3.setBounds(562, 185, 55, 14);
		panel.add(lbl_nome_5_1_1_3);
		
		JLabel lblNomeCoordenador = new JLabel("");
		lblNomeCoordenador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCoordenador.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNomeCoordenador.setBounds(617, 185, 264, 14);
		panel.add(lblNomeCoordenador);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CadastrarTurmaView.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(43, 571, 292, 88);
		panel.add(lblNewLabel_1);
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(138, 0, 0));
		btnCadastrar.setBounds(517, 446, 297, 50);
		panel.add(btnCadastrar);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastrarTurmaView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1195, 27, 126, 100);
		panel.add(lblVoltar);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnVoltar.addActionListener(this);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1183, 27, 157, 125);
		panel.add(btnVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1249, 147, 72, 25);
		panel.add(lblVoltar2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastrarTurmaView.class.getResource("/resources/iconTurma.jpg")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(0, 0, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		comboBoxProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String valorSelecionado = (String) comboBoxProfessor.getSelectedItem();
                
                pController.consultarNomeProfessor(valorSelecionado);
                lblNomeCoordenador.setText(""+ pController.getNomeProfessor());
            }
        });
		
	}

	public JTextField getTfCodTurma() {
		return tfCodTurma;
	}

	public void setTfCodTurma(JTextField tfCodTurma) {
		this.tfCodTurma = tfCodTurma;
	}

	public JTextField getTfAno() {
		return tfAno;
	}

	public void setTfAno(JTextField tfAno) {
		this.tfAno = tfAno;
	}

	public JTextField getTfHoraInicio() {
		return tfHoraInicio;
	}

	public void setTfHoraInicio(JTextField tfHoraInicio) {
		this.tfHoraInicio = tfHoraInicio;
	}

	public JTextField getTfHorafim() {
		return tfHorafim;
	}

	public void setTfHorafim(JTextField tfHorafim) {
		this.tfHorafim = tfHorafim;
	}

	public JComboBox<String> getComboBoxProfessor() {
		return comboBoxProfessor;
	}

	public void setComboBoxProfessor(JComboBox<String> comboBoxProfessor) {
		this.comboBoxProfessor = comboBoxProfessor;
	}

	public JComboBox<String> getComboBoxCurriculo() {
		return comboBoxCurriculo;
	}

	public void setComboBoxCurriculo(JComboBox<String> comboBoxCurriculo) {
		this.comboBoxCurriculo = comboBoxCurriculo;
	}

	public JComboBox<String> getComboBoxDia() {
		return comboBoxDia;
	}

	public void setComboBoxDia(JComboBox<String> comboBoxDia) {
		this.comboBoxDia = comboBoxDia;
	}

	public JComboBox<String> getComboBoxSemestre() {
		return comboBoxSemestre;
	}

	public void setComboBoxSemestre(JComboBox<String> comboBoxSemestre) {
		this.comboBoxSemestre = comboBoxSemestre;
	}
	

	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			TurmaController tC = new TurmaController();
			
			
			
			if(tfCodTurma.getText().matches("") ||tfAno.getText().matches("") || tfHoraInicio.getText().matches("") || tfHorafim.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(tC.cadastrarTurma(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (tC.cadastrarTurma(this) == "Curriculo existe"){
				JOptionPane.showMessageDialog(rootPane, "Curriculo já existente!!");
			}
			else if(tC.cadastrarTurma(this) == "Erro") {
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
