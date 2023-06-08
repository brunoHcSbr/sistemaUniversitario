package banco;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Login;

public class LoginDAO {
	
	private String men;
	public String valSql;
	private String val;
	
	/*
	private String nomeAluno;
	private String CursoAluno;
	private String */
	

	/**
	 * Este metodo ira listar o aluno na tela de menu
	 * @param - val será usado para validar
	 * @return - aviso de erro
	 */
	public String listarAluno(String val) {
		BD bd = new BD();
		bd.getConnection();
		String avisoErro;
		if(val == "N") {
			avisoErro = "Erro";
			return avisoErro;
		}
		else {
			try {
				String sql = "SELECT RA_ALUNO,NOME_ALUNO FROM ALUNO WHERE RA_ALUNO = '"+val+"'";
				//System.out.println(sql);
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				if(bd.rs.next()) {
				
				//Login login = new Login();
				//login.setNomeAluno(bd.rs.getString("NOME_ALUNO"));
			
				
				
				return sql;
				}
				else {
					
				avisoErro = "RA inexistente";
				return avisoErro;
				}

			}
			catch(SQLException erro){
				
				avisoErro = "Erro";
				return avisoErro;
			}
			finally {
				
			}
		}
		
	}
	/**
	 * Metodo utilizado para fazer a validação do login
	 * @param num_usuario - Valor do login do aluno que será passado pelo TextField 
	 * @param senha - Valor da senha do aluno que será passado pelo TextField
	 * @return - retornara um valor para ser validado no LoginView
	 */
	
	public String loginAluno(Login login) {
		BD bd = new BD();
		
		String sql = "Select * FROM USUARIO WHERE NUM_USUARIO = ? AND SENHA = ? AND TIPO_USU = '1'";
		
		bd.getConnection();
		System.out.println(login.getUsuario());
		System.out.println(login.getSenha());
		
		try {

			System.out.println(sql);
			
			
			bd.st = bd.con.prepareStatement(sql);//Prepara a Instrução para ser executada
			bd.st.setString(1, login.getUsuario());
			bd.st.setString(2, login.getSenha());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				
				val = login.getUsuario();
				return val;
			}
			else {
				JOptionPane.showInternalMessageDialog(null, "Usuário não encontrado!!!");
				val = "N";
				return val;
			}
			
		}
		catch(SQLException erro){
			men = "Erro falha na Execução!";
			System.out.println(men);
			val = "N";
			return val;
		}
		finally {
			bd.close();
		}
		
		
	}
	/**
	 * Metodo utilizado para fazer a validação do login
	 * @param num_usuario - Valor do login do funcionario que será passado pelo TextField 
	 * @param senha - Valor da senha do funcionario que será passado pelo TextField
	 * @return - retornara um valor para ser validado no LoginView
	 */
	
	public String loginProfessor(Login login) {
		BD bd = new BD();
		
		String sql = "Select * FROM USUARIO WHERE NUM_USUARIO = ? AND SENHA = ? AND TIPO_USU = '2'";
		
		bd.getConnection();
		try {
			
			System.out.println(sql);
			
			//bd.st.setString(3, login.getTipoUsuario());
			bd.st = bd.con.prepareStatement(sql);//Prepara a Instrução para ser executada
			bd.st.setString(1, login.getUsuario());
			bd.st.setString(2, login.getSenha());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				
				
				val = login.getUsuario();
				return val;
			}
			else {
				
				val = "N";
				return val;
			}
			
		}
		catch(SQLException erro){
			men = "Erro falha na Execução!";
			System.out.println(men);
			val = "N";
			return val;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	public String loginAdmin(Login login) {
		BD bd = new BD();
		
		String sql = "Select * FROM USUARIO WHERE NUM_USUARIO = ? AND SENHA = ? AND TIPO_USU = '3'";
		
		bd.getConnection();
		try {
			
			System.out.println(sql);
			
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, login.getUsuario());
			bd.st.setString(2, login.getSenha());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				
				
				val = login.getUsuario();
				return val;
			}
			else {
				
				val = "N";
				return val;
			}
			
		}
		catch(SQLException erro){
			men = "Erro falha na Execução!";
			System.out.println(men);
			val = "N";
			return val;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	
}
