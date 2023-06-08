package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Notas;

public class NotasDAO {
	
	
	private String retornoCadastro;
	private String retornoConsulta;
	
	
	public String cadastroNota(Notas notas) {
		
		BD bd = new BD();
		
		String sql = "INSERT INTO NOTAS VALUES (?,?,?,?)";
		
		bd.getConnection();
		
		try {
		
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, notas.getSigla_nota());
			bd.st.setInt(2, notas.getCod_turma());
			bd.st.setString(3, notas.getDescricao());
			bd.st.setFloat(4, notas.getPeso());
			bd.st.executeUpdate();
			
			
			retornoCadastro = "Inserido";
			return retornoCadastro;
			
		}
		catch(SQLException erro){
		
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		finally {
			bd.close();
		}
		

	}
	
	public String consultaNotas(Notas notas) {
		

		BD bd = new BD();
		
		String sql = "SELECT * FROM NOTAS WHERE SIGLA_NOTA = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, notas.getSigla_nota());

			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {	
				
				notas.setCod_turma(bd.rs.getInt("COD_TURMA"));
				notas.setDescricao(bd.rs.getString("DESCRICAO"));
				notas.setPeso(bd.rs.getFloat("PESO"));
				
				
				System.out.println("Realizado");
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Nota inexistente";
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
	public void listarSigla(Notas notas) {
	
	BD bd = new BD();
	String sql = "SELECT * FROM NOTAS WHERE COD_TURMA = ?";
	
	bd.getConnection();
	
	try {
		bd.st = bd.con.prepareStatement(sql);
		bd.st.setInt(1, notas.getCod_turma());
		bd.rs = bd.st.executeQuery();
		

        // Criando uma lista para armazenar os valores
        List<String> valores = new ArrayList<>();

        // Processando os resultados
        while (bd.rs.next()) {
            String valor = bd.rs.getString("SIGLA_NOTA");
            valores.add(valor);
        }
        
        notas.setListaSigla(valores);
        
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
	
	
	
	public String inserirNotaAluno(Notas notas) {

		BD bd = new BD();
		String sql = "INSERT INTO NOTAS_ALUNOS VALUES (?, ?, ?)";
		
		bd.getConnection();
		try {
			System.out.println(notas.getSigla_nota());
			System.out.println(notas.getRaAluno());
			System.out.println(notas.getValor());
			
		
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, notas.getSigla_nota());
			bd.st.setString(2,notas.getRaAluno());
			bd.st.setFloat(3, notas.getValor());
			bd.st.executeUpdate();
				
			
				retornoCadastro = "Inserido";
				return retornoCadastro;
			
			
		}
		catch(SQLException erro){
		
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		finally {
			bd.close();
		}
	}
	public String consultaNotasAluno(Notas notas) {
		

		BD bd = new BD();
		
		String sql = "SELECT * FROM NOTAS_ALUNOS WHERE SIGLA_NOTA = ? AND RA_ALUNO = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, notas.getSigla_nota());
			bd.st.setString(2, notas.getRaAluno());

			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {	
				
				notas.setValor(bd.rs.getFloat("VALOR"));
				
				
				System.out.println("Realizado");
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Nota inexistente";
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
	
	public String cadastrarMedia(Notas notas) {
		
		BD bd = new BD();
		String sql = "UPDATE HISTORICO SET CONCEITO = ? , MEDIA = ? WHERE RA_ALUNO = ? AND COD_TURMA = ?";
		
		bd.getConnection();
		try {
		
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, notas.getConceito());
			bd.st.setFloat(2,notas.getMedia());
			bd.st.setString(3, notas.getRaAluno());
			bd.st.setInt(4, notas.getCod_turma());
			bd.st.executeUpdate();
				
			
				retornoCadastro = "Inserido";
				return retornoCadastro;
			
			
		}
		catch(SQLException erro){
		
			System.out.println(erro);
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		finally {
			bd.close();
		}
	}
	
	
	
	
}
