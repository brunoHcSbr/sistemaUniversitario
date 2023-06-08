package banco;

import java.sql.SQLException;

public class InicioProfessorDAO {
	
	private String nomeProfessor;
	private String matriculaProfessor;
	private String coordenadorProfessor;
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getMatriculaProfessor() {
		return matriculaProfessor;
	}
	public void setMatriculaProfessor(String matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	public String getCoordenadorProfessor() {
		return coordenadorProfessor;
	}
	public void setCoordenadorProfessor(String coordenadorProfessor) {
		this.coordenadorProfessor = coordenadorProfessor;
	}
	
	public String listarProfessor(String matricula) {
		BD bd = new BD();
		bd.getConnection();
		String avisoErro;
		System.out.println("Teste");
		if(matricula == "N") {
			avisoErro = "Erro";
			return avisoErro;
		}
		
		
		else {
			try {
				String sql = "SELECT * FROM PROFESSOR WHERE MATRICULA_PROFESSOR = '"+matricula+"'";
				
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				if(bd.rs.next()) {
				
				setNomeProfessor(bd.rs.getString("NOME_PROFESSOR"));
				setCoordenadorProfessor(bd.rs.getString("COD_COORDENADOR"));
				
				
				return sql;
				}
				else {
				avisoErro = "Erro";
				return avisoErro;
				}

			}
			catch(SQLException erro){
				avisoErro = "Erro";
				return avisoErro;
			}
			finally {
				bd.close();
			}
		}
		
	}
	
	

}
