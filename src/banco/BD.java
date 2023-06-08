package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
	
	public Connection con; //Conectar 	//É uma interface
	
	public PreparedStatement st; //Executar  //CTRL + SHIFT + O
	
	public ResultSet rs; //Recebe o resultado da execução
	
	/**
	 * String DRIVER - CAMINHO DO DRIVE
	 * String DATABASENAME - Nome do banco de dados que será passado na url
	 * String URL - link de acesso ao banco de dados
	 * String Login - Login para acesso ao banco de dados
	 * String Senha - Senha para acesso ao banco de dados
	 */
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	//	CONSTANTE	-	CAMINHO DO DRIVE > Será o nome do pacote
	private final String DATABASENAME = "Sistema_Universitario_2";
	private final String URL = "jdbc:sqlserver://localhost;databasename="+DATABASENAME; // LINKANDO
	private final String LOGIN = "sa2";
	private final String SENHA = "123456";

	/**
	 * Conectando ao banco de dados
	 * @return
	 */
public boolean getConnection() {
		
		try {
			Class.forName(DRIVER); //Carregar o driver durante a execução
			con = DriverManager.getConnection(URL, LOGIN, SENHA); //Conectar com o Banco de dados
			System.out.println("Conectou...");
			
			return true;
		}
		catch(ClassNotFoundException erro) { //	Não carregou o driver
			System.out.println("Driver não encontrado!");
			
			
		}
		catch(SQLException erro) {
			System.out.println("Falha " + erro);
		}
		return false;
	}
/**
 * Desconectando do banco de dados
 */
	
	public void close() {
		try {
			if(rs!=null) rs.close(); //fechando o rs
		}
		catch(SQLException erro) {
			
		}
		try {
			if(st!=null) st.close();
		}
		catch(SQLException erro) {
			
		}
		try {
			if(con!=null) {
				con.close();
				System.out.println("Desconectou...");
			}
		}
		catch(SQLException erro) {
			
		}
		
	}
	
	public static void main(String[] args) { //Usado para rodar o código
		BD bd = new BD();
		bd.getConnection();
		// executa a operação
		bd.close();
	}
}
