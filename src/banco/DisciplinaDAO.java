package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Disciplina;

public class DisciplinaDAO {
	
	private String retornoCadastrar;
	private String retornoConsulta;
	
	public String cadastrarDisciplina(Disciplina disciplina) {
		BD bd = new BD();
		String sql = "INSERT INTO DISCIPLINA VALUES (?,?,?,?,?)";
		
		bd.getConnection();
		try {
			System.out.println(disciplina.getCodDisciplina());
			System.out.println(disciplina.getNomeDisciplina());
			System.out.println(disciplina.getQtdDias());
			System.out.println(disciplina.getDescricao());
			System.out.println(disciplina.getCargaHoraria());
			
		
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, disciplina.getCodDisciplina());
			bd.st.setString(2,disciplina.getNomeDisciplina());
			bd.st.setString(3, disciplina.getQtdDias());
			bd.st.setString(4, disciplina.getCargaHoraria());
			bd.st.setString(5, disciplina.getDescricao());
			bd.st.executeUpdate();
				
			
				retornoCadastrar = "Inserido";
				return retornoCadastrar;
			
			
		}
		catch(SQLException erro){
		
			
			retornoCadastrar = "Erro";
			return retornoCadastrar;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	public String consultaDisciplina(Disciplina disciplina) {
		BD bd = new BD();
		String sql = "SELECT * FROM DISCIPLINA WHERE COD_DISCIPLINA = ?";
		
		bd.getConnection();
		
		
		try {
			
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, disciplina.getCodDisciplina());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
			
				
	
				disciplina.setNomeDisciplina(bd.rs.getString("NOME_DISCIPLINA"));
				disciplina.setQtdDias(bd.rs.getString("QTD_DIAS"));
				disciplina.setCargaHoraria(bd.rs.getString("CARGA_HORARIA"));
				disciplina.setDescricao(bd.rs.getString("DESCRICAO"));
				
				
				System.out.println(disciplina.getNomeDisciplina());
				System.out.println(disciplina.getQtdDias());
				System.out.println(disciplina.getCargaHoraria());
				System.out.println(disciplina.getDescricao());
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Disciplina inexistente";
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
	
	public void listaDisciplinas(Disciplina disciplina) {
		BD bd = new BD();
			
			String sql = "SELECT COD_DISCIPLINA FROM DISCIPLINA";
			
			bd.getConnection();
			
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				

	            // Criando uma lista para armazenar os valores
	            List<String> valores = new ArrayList<>();

	            // Processando os resultados
	            while (bd.rs.next()) {
	                String valor = bd.rs.getString("COD_DISCIPLINA");
	                valores.add(valor);
	            }
	            
	           disciplina.setListaDisciplinas(valores);
	            
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
