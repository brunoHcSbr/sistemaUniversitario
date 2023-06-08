package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Curriculo;

public class CurriculoDAO {
	
	private String retornoCurriculo;

	public String cadastroCurriculo(Curriculo c) {
		
		BD bd = new BD();
		String sql = "INSERT INTO CURRICULO VALUES (?,?,?,?)";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, c.getCodCurriculo());
			bd.st.setInt(2, c.getCodDisciplina());
			bd.st.setInt(3, c.getCodCurso());
			bd.st.setString(4, c.getSemestreGrade());
			bd.st.executeUpdate();
			
			
			retornoCurriculo = "Inserido";
			return retornoCurriculo;
		}
		catch(SQLException erro) {
			retornoCurriculo = "Erro";
			return retornoCurriculo;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	public String consultaCurriculo(Curriculo c){
		
		BD bd = new BD();
		String sql = "SELECT * FROM CURRICULO WHERE COD_CURRICULO = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, c.getCodCurriculo());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				c.setCodDisciplina(bd.rs.getInt("COD_DISCIPLINA"));
				c.setCodCurso(bd.rs.getInt("COD_CURSO"));
				c.setSemestreGrade(bd.rs.getString("SEMESTRE_GRADE"));

				retornoCurriculo = "Realizado";
				return retornoCurriculo;	
			}
			else {
				
				retornoCurriculo = "Curriculo inexistente";
				return retornoCurriculo;
			}
			
			
			
		}
		catch(SQLException erro) {
			
			retornoCurriculo = "Erro";
			return retornoCurriculo;
		}
		finally {
			bd.close();
		}
	}
	
	public void listarCurriculo(Curriculo curriculo) {

		BD bd = new BD();
		
		String sql = "SELECT COD_CURRICULO FROM CURRICULO";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("COD_CURRICULO");
                valores.add(valor);
            }
            
            curriculo.setListaCurriculo(valores);
            
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
