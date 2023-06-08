package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Historico;

public class HistoricoDAO {

	private String retornoHistorico;
	
	public String cadastroHistorico(Historico h) {
		
		BD bd = new BD();
		String sql = "INSERT INTO HISTORICO VALUES (?,?,?,NULL)";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, h.getCodHistorico());
			bd.st.setString(2, h.getRa());
			bd.st.setInt(3, h.getCodTurma());
			bd.st.executeUpdate();
			
			retornoHistorico = "Inserido";
			return retornoHistorico;
		}
		catch(SQLException erro) {
			retornoHistorico = "Erro";
			return retornoHistorico;
		}
		finally {
			bd.close();
		}

	}
	public String consultaHistorico(Historico h){
		
		BD bd = new BD();
		String sql = "SELECT * FROM HISTORICO WHERE COD_HISTORICO = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, h.getCodHistorico());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				h.setCodTurma(bd.rs.getInt("COD_TURMA"));
				h.setRa(bd.rs.getString("RA_ALUNO"));

				retornoHistorico = "Realizado";
				return retornoHistorico;	
			}
			else {
				
				retornoHistorico = "Historico inexistente";
				return retornoHistorico;
			}
			
			
			
		}
		catch(SQLException erro) {
			
			retornoHistorico = "Erro";
			return retornoHistorico;
		}
		finally {
			bd.close();
		}
	}
	
	public void consultaAluno(Historico h) {
		
		BD bd = new BD();
		String sql = "select * from historico WHERE COD_TURMA = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, h.getCodTurma());
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("RA_ALUNO");
                valores.add(valor);
            }
            
            h.setListaAlunos(valores);
            
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
