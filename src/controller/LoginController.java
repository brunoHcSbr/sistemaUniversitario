package controller;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import banco.BD;
import banco.LoginDAO;
import model.Login;
import view.LoginView2;

public class LoginController{
	
	
	private String val;
	private static String valRA;
	private static String valMatricula;
	private static String valTipoUsu;
	
	public static String getValTipoUsu() {
		return valTipoUsu;
	}
	public static void setValTipoUsu(String valTipoUsu) {
		LoginController.valTipoUsu = valTipoUsu;
	}
	public static String getValMatricula() {
		return valMatricula;
	}
	public static void setValMatricula(String valMatricula) {
		LoginController.valMatricula = valMatricula;
	}
	public static String getValRA() {
		return valRA;
	}
	public static void setValRA(String valRA) {
		LoginController.valRA = valRA;
	}
	@SuppressWarnings("deprecation")
	/**
	 * 
	 * @param view - Irá utilizar as informações da view da classe LoginView
	 * @return - utilizado para validar o login
	 * @throws SQLException
	 */
	public String loginAluno(LoginView2 view) throws SQLException {
		BD bd = new BD();
		bd.getConnection();
			 LoginDAO loginDAO = new LoginDAO();
			 System.out.println(view.getTextField_RA().getText());
			 
			 Login login = new Login(view.getTextField_RA().getText(),view.getPasswordField_RA().getText());
			 
			 if(loginDAO.loginAluno(login) == "N") {
				 val = "n";
				 return val;
			 }			 
			 else {
				 val = loginDAO.loginAluno(login) ;
				 setValRA(view.getTextField_RA().getText());
				 return val;
			 }
		}
	@SuppressWarnings("deprecation")
	/**
	 * 
	 * @param view - Irá utilizar as informações da view da classe LoginView
	 * @return - utilizado para validar o login
	 * @throws SQLException
	 */
	public String loginProfessor(LoginView2 view){
		
		 LoginDAO loginDAO = new LoginDAO();
			 
			 Login login = new Login(view.getTextField_Matricula().getText(),view.getPasswordField_Funcionario().getText());
			 
			 if(loginDAO.loginProfessor(login) == "N") {
				 val = "Erro";
				 return val;
			 }			 
			 else {
				 val = "Consultado" ;
				 System.out.println(loginDAO.loginProfessor(login));
			
				 setValMatricula(loginDAO.loginProfessor(login));
				 return val;
			 }
		}
	
	public String loginAdmin(LoginView2 view){
		
		 LoginDAO loginDAO = new LoginDAO();
			 
			 @SuppressWarnings("deprecation")
			Login login = new Login(view.getTextField_Matricula().getText(),view.getPasswordField_Funcionario().getText());
			 
			 if(loginDAO.loginAdmin(login) == "N") {
				 val = "Erro";
				 return val;
			 }			 
			 else {
				 val = "Consultado" ;
				 System.out.println(loginDAO.loginAdmin(login));
				 setValMatricula(loginDAO.loginAdmin(login));
				 return val;
			 }
		}
	
	
	
	/**
	 * Metodo construtor
	 */
	public LoginController() {
		
	}
	/**
	 * Usado para quando clicar no botão puxar os metodos loginProfessor e loginAluno
	 * @param actionListener
	 */
	public void loginAluno(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
	public void loginProfessor(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
