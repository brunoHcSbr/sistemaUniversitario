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

import controller.CursoController;
import controller.ProfessorController;

public class CadastrarCurso extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodCurso;
	private JTextField tfNomeCurso;
	private JTextField tfDuracaoAnos;
	private JTextField tfDataReconhecimento;
	private JTextField tfDescricao;
	private JComboBox<String> comboBoxCodCoordenador;
	
	
	public JComboBox<String> getComboBoxCodCoordenador() {
		return comboBoxCodCoordenador;
	}

	public void setComboBoxCodCoordenador(JComboBox<String> comboBoxCodCoordenador) {
		this.comboBoxCodCoordenador = comboBoxCodCoordenador;
	}


	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnVoltar = new JButton("");
	
	JLabel lblNomeCoordenador = new JLabel("New label");

	public JTextField getTfCodCurso() {
		return tfCodCurso;
	}

	public void setTfCodCurso(JTextField tfCodCurso) {
		this.tfCodCurso = tfCodCurso;
	}

	public JTextField getTfNomeCurso() {
		return tfNomeCurso;
	}

	public void setTfNomeCurso(JTextField tfNomeCurso) {
		this.tfNomeCurso = tfNomeCurso;
	}

	public JTextField getTfDuracaoAnos() {
		return tfDuracaoAnos;
	}

	public void setTfDuracaoAnos(JTextField tfDuracaoAnos) {
		this.tfDuracaoAnos = tfDuracaoAnos;
	}

	public JTextField getTfDataReconhecimento() {
		return tfDataReconhecimento;
	}

	public void setTfDataReconhecimento(JTextField tfDataReconhecimento) {
		this.tfDataReconhecimento = tfDataReconhecimento;
	}

	
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
					CadastrarCurso frame = new CadastrarCurso();
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
	public CadastrarCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1345, 743);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastrarCurso = new JLabel("Cadastrar Curso");
		lblCadastrarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarCurso.setBounds(398, 43, 405, 36);
		lblCadastrarCurso.setForeground(new Color(0, 67, 121));
		lblCadastrarCurso.setFont(new Font("Arial Black", Font.BOLD, 25));
		panel.add(lblCadastrarCurso);
		
		tfCodCurso = new JTextField();
		tfCodCurso.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodCurso.setBounds(310, 240, 123, 20);
		panel.add(tfCodCurso);
		tfCodCurso.setColumns(10);
		
		JLabel lbl_nome_5_1 = new JLabel("Código do Curso");
		lbl_nome_5_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(191, 246, 109, 14);
		panel.add(lbl_nome_5_1);
		
		
		ProfessorController pController = new ProfessorController();
		pController.listarCoordenadores();
		
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		
		// LISTA COORDENADORES NO COMBO BOX
		
		
		for (String valor : pController.getListaCoordenadores()) {
            comboBoxModel.addElement(valor);
        }
		
		comboBoxCodCoordenador = new JComboBox<>(comboBoxModel);
		
		comboBoxCodCoordenador.setBounds(310, 268, 123, 22);
		panel.add(comboBoxCodCoordenador);
		
		JLabel lbl_nome_5_1_1 = new JLabel("Código do Coordenador");
		lbl_nome_5_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1.setBounds(148, 271, 152, 14);
		panel.add(lbl_nome_5_1_1);
		
		JLabel lbl_nome_5_1_1_1 = new JLabel("Nome do Coordenador:");
		lbl_nome_5_1_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_1.setBounds(457, 271, 152, 14);
		panel.add(lbl_nome_5_1_1_1);
		
		
		
		
		
		lblNomeCoordenador.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNomeCoordenador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCoordenador.setBounds(606, 271, 167, 14);
		panel.add(lblNomeCoordenador);
		
		
		
		
		lblNomeCoordenador.setText(""+ pController.getNomeCoordenador());
		
		comboBoxCodCoordenador.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	                String valorSelecionado = (String) comboBoxCodCoordenador.getSelectedItem();
	                
	                pController.consultarNomeCoordenador(valorSelecionado);
	                lblNomeCoordenador.setText(""+ pController.getNomeCoordenador());
	            }
	        });
		
		JLabel lbl_nome_5_1_1_2 = new JLabel("Nome do Curso");
		lbl_nome_5_1_1_2.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setBounds(210, 329, 104, 14);
		panel.add(lbl_nome_5_1_1_2);
		
		tfNomeCurso = new JTextField();
		tfNomeCurso.setHorizontalAlignment(SwingConstants.CENTER);
		tfNomeCurso.setColumns(10);
		tfNomeCurso.setBounds(310, 327, 463, 20);
		panel.add(tfNomeCurso);
		
		tfDuracaoAnos = new JFormattedTextField(Mascara("##"));
		tfDuracaoAnos.setHorizontalAlignment(SwingConstants.CENTER);
		tfDuracaoAnos.setColumns(10);
		tfDuracaoAnos.setBounds(310, 363, 123, 20);
		panel.add(tfDuracaoAnos);
		
		JLabel lbl_nome_5_1_1_2_1 = new JLabel("Duração em anos");
		lbl_nome_5_1_1_2_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1.setBounds(193, 365, 116, 14);
		panel.add(lbl_nome_5_1_1_2_1);
		
		JLabel lbl_nome_5_1_1_2_1_1 = new JLabel("Data de Reconhecimento");
		lbl_nome_5_1_1_2_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1_1.setBounds(443, 365, 167, 14);
		panel.add(lbl_nome_5_1_1_2_1_1);
		
		tfDataReconhecimento = new JTextField();
		tfDataReconhecimento.setHorizontalAlignment(SwingConstants.CENTER);
		tfDataReconhecimento.setColumns(10);
		tfDataReconhecimento.setBounds(620, 359, 152, 20);
		panel.add(tfDataReconhecimento);
		
		btnCadastrar.addActionListener(this);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBackground(new Color(0, 72, 100));
		btnCadastrar.setBounds(384, 468, 297, 50);
		panel.add(btnCadastrar);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setForeground(new Color(0, 65, 100));
		lblDescricao.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblDescricao.setBackground(new Color(0, 65, 100));
		lblDescricao.setBounds(231, 406, 76, 14);
		panel.add(lblDescricao);
		
		tfDescricao = new JTextField();
		tfDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		tfDescricao.setColumns(10);
		tfDescricao.setBounds(310, 404, 463, 20);
		panel.add(tfDescricao);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastrarCurso.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1175, 26, 126, 100);
		panel.add(lblVoltar);
		
		btnVoltar.addActionListener(this);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1166, 26, 157, 125);
		panel.add(btnVoltar);
		
		JLabel lblVoltar2 = new JLabel("Voltar");
		lblVoltar2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVoltar2.setBounds(1229, 137, 72, 25);
		panel.add(lblVoltar2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CadastrarCurso.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(38, 620, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastrarCurso.class.getResource("/resources/iconCurso.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(38, 11, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		
	}

	public JTextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(JTextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}
	

	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			
			CursoController curso = new CursoController();
			
			
			
			if(tfCodCurso.getText().matches("") ||tfNomeCurso.getText().matches("") ||tfDuracaoAnos.getText().matches("")) {
				
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else if(curso.cadastroCurso(this) == "Cadastrado") {
				JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
				
			}
			else if (curso.cadastroCurso(this) == "Curso existe"){
				JOptionPane.showMessageDialog(rootPane, "Curso já existente!!");
			}
			else if(curso.cadastroCurso(this) == "Erro") {
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
