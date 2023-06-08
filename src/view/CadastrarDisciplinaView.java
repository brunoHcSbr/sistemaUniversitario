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

import controller.DisciplinaController;

public class CadastrarDisciplinaView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodDisciplina;
	private JTextField tfNomeDisciplina;
	private JTextField tfQtdDias;
	private JTextField tfCargaHoraria;
	private JTextField tfDescricao;
	
	
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
					CadastrarDisciplinaView frame = new CadastrarDisciplinaView();
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
	public CadastrarDisciplinaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1350, 719);
		contentPane.add(panel);
		
		JLabel lblCadastrarCurso = new JLabel("Cadastrar Disciplina");
		lblCadastrarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarCurso.setForeground(new Color(0, 67, 121));
		lblCadastrarCurso.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblCadastrarCurso.setBounds(398, 43, 405, 36);
		panel.add(lblCadastrarCurso);
		
		tfCodDisciplina  = new JTextField();
		tfCodDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodDisciplina.setColumns(10);
		tfCodDisciplina.setBounds(398, 240, 123, 20);
		panel.add(tfCodDisciplina);
		
		JLabel lbl_nome_5_1 = new JLabel("Código da Disciplina");
		lbl_nome_5_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1.setBounds(259, 242, 129, 14);
		panel.add(lbl_nome_5_1);
		
		JLabel lbl_nome_5_1_1_2 = new JLabel("Nome da Disciplina");
		lbl_nome_5_1_1_2.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2.setBounds(259, 283, 129, 14);
		panel.add(lbl_nome_5_1_1_2);
		
		tfNomeDisciplina = new JTextField();
		tfNomeDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		tfNomeDisciplina.setColumns(10);
		tfNomeDisciplina.setBounds(398, 281, 463, 20);
		panel.add(tfNomeDisciplina);
		
		tfQtdDias = new JTextField();
		tfQtdDias.setHorizontalAlignment(SwingConstants.CENTER);
		tfQtdDias.setColumns(10);
		tfQtdDias.setBounds(398, 318, 123, 20);
		panel.add(tfQtdDias);
		
		JLabel lbl_nome_5_1_1_2_1 = new JLabel("Quantidade de dias");
		lbl_nome_5_1_1_2_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1.setBounds(259, 320, 129, 14);
		panel.add(lbl_nome_5_1_1_2_1);
		
		JLabel lbl_nome_5_1_1_2_1_1 = new JLabel("Carga Horaria");
		lbl_nome_5_1_1_2_1_1.setForeground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lbl_nome_5_1_1_2_1_1.setBackground(new Color(0, 65, 100));
		lbl_nome_5_1_1_2_1_1.setBounds(602, 320, 97, 14);
		panel.add(lbl_nome_5_1_1_2_1_1);
		
		tfCargaHoraria = new JFormattedTextField(Mascara("###"));
		tfCargaHoraria.setHorizontalAlignment(SwingConstants.CENTER);
		tfCargaHoraria.setColumns(10);
		tfCargaHoraria.setBounds(709, 318, 152, 20);
		panel.add(tfCargaHoraria);
		
		
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
		btnCadastrar.setBounds(384, 468, 297, 50);
		panel.add(btnCadastrar);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setForeground(new Color(0, 65, 100));
		lblDescricao.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblDescricao.setBackground(new Color(0, 65, 100));
		lblDescricao.setBounds(312, 360, 76, 14);
		panel.add(lblDescricao);
		
		tfDescricao = new JTextField();
		tfDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		tfDescricao.setColumns(10);
		tfDescricao.setBounds(398, 358, 463, 20);
		panel.add(tfDescricao);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(CadastrarDisciplinaView.class.getResource("/resources/iconVoltar.png")));
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
		lblNewLabel_1.setIcon(new ImageIcon(CadastrarDisciplinaView.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(38, 620, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(CadastrarDisciplinaView.class.getResource("/resources/iconDisciplina.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(48, 26, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
	}

	public JTextField getTfCodDisciplina() {
		return tfCodDisciplina;
	}

	public void setTfCodDisciplina(JTextField tfCodDisciplina) {
		this.tfCodDisciplina = tfCodDisciplina;
	}

	public JTextField getTfNomeDisciplina() {
		return tfNomeDisciplina;
	}

	public void setTfNomeDisciplina(JTextField tfNomeDisciplina) {
		this.tfNomeDisciplina = tfNomeDisciplina;
	}

	public JTextField getTfQtdDias() {
		return tfQtdDias;
	}

	public void setTfQtdDias(JTextField tfQtdDias) {
		this.tfQtdDias = tfQtdDias;
	}

	public JTextField getTfCargaHoraria() {
		return tfCargaHoraria;
	}

	public void setTfCargaHoraria(JTextField tfCargaHoraria) {
		this.tfCargaHoraria = tfCargaHoraria;
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
		
		DisciplinaController dController = new DisciplinaController();
		
		
		
		if(tfCodDisciplina.getText().matches("") || tfNomeDisciplina.getText().matches("") ||tfQtdDias.getText().matches("") || tfCargaHoraria.getText().matches("")
				|| tfDescricao.getText().matches("")) {
			
			JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
		}
		else if(dController.cadastrarDisciplina(this) == "Cadastrado") {
			JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso!!!");
			
		}
		else if (dController.cadastrarDisciplina(this) == "Disciplina existe"){
			JOptionPane.showMessageDialog(rootPane, "Erro!! Codigo já está sendo utilizado!!");
		}
		else if(dController.cadastrarDisciplina(this) == "Erro") {
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
