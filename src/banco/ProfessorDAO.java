package banco;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Professor;

public class ProfessorDAO {
	
	private String retornoCadastro;
	private String retornoConsulta;
	
	public String cadastrarProfessor(Professor professor) {
		
BD bd = new BD();
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		String sql = "INSERT INTO PROFESSOR  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		bd.getConnection();
		
		try {
			
			bd.st = bd.con.prepareStatement(sql);
			
			bd.st.setString(1, professor.getMatricula());
			bd.st.setString(2, professor.getCodCoordenador());
			bd.st.setString(3, professor.getNome());
			bd.st.setString(4, professor.getCategoria());
			bd.st.setString(5, professor.getCpf());
			//bd.st.setString(4, aluno.getDataNasc());
			bd.st.setString(7, professor.getRg());
			bd.st.setString(8, professor.getRua());
			bd.st.setString(9, professor.getNumeroCasa());
			bd.st.setString(10, professor.getBairro());
			bd.st.setString(11, professor.getCep());
			bd.st.setString(12, professor.getCidade());
			bd.st.setString(13, professor.getUf());
			bd.st.setString(14, professor.getTelefone());
			bd.st.setString(15, professor.getEmail());
			
			try {
				
				
				Date dataNasc = formatoData.parse(professor.getDataNasc());
				bd.st.setDate(6, new java.sql.Date(dataNasc.getTime()));
				System.out.println(new java.sql.Date(dataNasc.getTime()));
				
				bd.st.executeUpdate();
				System.out.println("inserido");
				retornoCadastro = "Inserido";
				return retornoCadastro;
				
				
			} catch (ParseException e) {
				
				e.printStackTrace();
				System.out.println("Data em formato errado");
				
				retornoCadastro = "Erro";
				return retornoCadastro;
			}
		
			
			
		}
		catch(SQLException erro){
		
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		finally {
			bd.close();
		}
		
	}
	
	public String consultaProfessor(Professor professor) {
		

		BD bd = new BD();
		
		String sql = "SELECT * FROM PROFESSOR WHERE MATRICULA_PROFESSOR = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, professor.getMatricula());
			//System.out.println(professor.getMatricula());
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {	
				
				professor.setCodCoordenador(bd.rs.getString("COD_COORDENADOR"));
				professor.setNome(bd.rs.getString("NOME_PROFESSOR"));
				professor.setCategoria(bd.rs.getString("CATEGORIA"));
				professor.setCpf(bd.rs.getString("CPF_PROFESSOR"));
				professor.setDataNasc(bd.rs.getString("DATA_NASCIMENTO"));
				professor.setRg(bd.rs.getString("RG_PROF"));
				professor.setRua(bd.rs.getString("ENDERECO_PROFESSOR"));
				professor.setNumeroCasa(bd.rs.getString("NUMERO_CASA_PROFESSOR"));
				professor.setBairro(bd.rs.getString("BAIRRO_PROFESSOR"));
				professor.setCep(bd.rs.getString("CEP_PROFESSOR"));
				professor.setCidade(bd.rs.getString("CIDADE_PROFESSOR"));
				professor.setUf(bd.rs.getString("UF"));
				professor.setTelefone(bd.rs.getString("Telefone"));
				professor.setEmail(bd.rs.getString("EMAIL"));
				
				System.out.println(bd.rs.getString("COD_COORDENADOR"));
				System.out.println(bd.rs.getString("NOME_PROFESSOR"));
				System.out.println(bd.rs.getString("CATEGORIA"));
				System.out.println(bd.rs.getString("CPF_PROFESSOR"));
				System.out.println(bd.rs.getString("DATA_NASCIMENTO"));
				System.out.println(bd.rs.getString("RG_PROF"));
				System.out.println(bd.rs.getString("ENDERECO_PROFESSOR"));
				System.out.println(bd.rs.getString("NUMERO_CASA_PROFESSOR"));
				System.out.println(bd.rs.getString("BAIRRO_PROFESSOR"));
				System.out.println(bd.rs.getString("CEP_PROFESSOR"));
				System.out.println(bd.rs.getString("CIDADE_PROFESSOR"));
				System.out.println(bd.rs.getString("UF"));
				
				System.out.println(professor.getCodCoordenador());
				
				System.out.println("Realizado");
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Matricula inexistente";
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
	
	
	public void listarCoordenadores(Professor professor) {

		BD bd = new BD();
		
		String sql = "SELECT DISTINCT COD_COORDENADOR FROM PROFESSOR";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("COD_COORDENADOR");
                valores.add(valor);
            }
            
            professor.setListaCoordenadores(valores);
            
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
	
	public void listarProfessores(Professor professor) {

		BD bd = new BD();
		
		String sql = "SELECT MATRICULA_PROFESSOR FROM PROFESSOR";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("MATRICULA_PROFESSOR");
                valores.add(valor);
            }
            
            professor.setListaProfessores(valores);
            
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
