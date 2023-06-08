package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class CursoDAO {
	
	private String retornoCadastrar;
	private String retornoConsulta;
	
	public String cadastrarCurso(Curso curso) {
		BD bd = new BD();
		String sql = "INSERT INTO CURSO (COD_CURSO, COD_COORDENADOR,NOME_CURSO,DURACAO,DESCRICAO) VALUES (?,?,?,?,?)";
		
		bd.getConnection();
		try {
			System.out.println(curso.getCodCurso());
			System.out.println(curso.getCodCoordenador());
			System.out.println(curso.getNomeCurso());
			System.out.println(curso.getDuracaoAnos());
			System.out.println(curso.getDescricao());
			
		
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, curso.getCodCurso());
			bd.st.setInt(2,curso.getCodCoordenador() );
			bd.st.setString(3,curso.getNomeCurso());
			bd.st.setString(4, curso.getDuracaoAnos());
			bd.st.setString(5, curso.getDescricao());
			bd.st.executeUpdate();
				
				return retornoCadastrar;
			
			
		}
		catch(SQLException erro){
		
			
			retornoCadastrar = "N";
			return retornoCadastrar;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	public String consultaCurso(Curso curso) {
		BD bd = new BD();
		String sql = "SELECT * FROM CURSO WHERE COD_CURSO = ? AND COD_COORDENADOR = ?";
		
		bd.getConnection();
		
		
		try {
			
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, curso.getCodCurso());
			bd.st.setInt(2,curso.getCodCoordenador());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
			
				
	
				curso.setNomeCurso(bd.rs.getString("NOME_CURSO"));
				curso.setDuracaoAnos(bd.rs.getString("DURACAO"));
				curso.setDescricao(bd.rs.getString("DESCRICAO"));
				
				
				System.out.println(sql);
				System.out.println(bd.rs.getString("NOME_CURSO"));
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Curso inexistente";
				return retornoConsulta;
				}
			
			
		}
		catch(SQLException erro){
		
			
			retornoConsulta = "Erro";
			return retornoConsulta;
		}
		finally {
			bd.close();
		}
		
	}
	
	public String consultaNomeCurso(Curso curso) {
		BD bd = new BD();
		String sql = "SELECT * FROM CURSO WHERE COD_CURSO = ?";
		
		bd.getConnection();
		
		
		try {
			
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, curso.getCodCurso());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
			
				
	
				curso.setNomeCurso(bd.rs.getString("NOME_CURSO"));
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Curso inexistente";
				return retornoConsulta;
				}
			
			
		}
		catch(SQLException erro){
		
			
			retornoConsulta = "Erro";
			return retornoConsulta;
		}
		finally {
			bd.close();
		}
		
	}
	
	public void listaCursos(Curso curso) {
	BD bd = new BD();
		
		String sql = "SELECT COD_CURSO FROM CURSO";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("COD_CURSO");
                valores.add(valor);
            }
            
            curso.setListaCursos(valores);
            
            // Exibindo os valores
            for (String valor : valores) {
                System.out.println(valor);
            }

		}
		catch(SQLException erro){
		
			System.out.println("Erro no Banco de Dados");
		}
		finally {
			bd.close();
		}
	}
}
