package banco;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Aluno;

public class AlunoDAO {
	
	private String retornoCadastro;
	private String retornoConsulta;
	
	
	public String cadastroAluno(Aluno aluno) {
		
		BD bd = new BD();
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		String sql = "INSERT INTO ALUNO  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		bd.getConnection();
		
		try {

			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, aluno.getRa());
			bd.st.setString(2, aluno.getNome());
			bd.st.setString(3, aluno.getCpf());
			//bd.st.setString(4, aluno.getDataNasc());
			bd.st.setString(5, aluno.getRg());
			bd.st.setString(6, aluno.getRua());
			bd.st.setString(7, aluno.getNumeroCasa());
			bd.st.setString(8, aluno.getBairro());
			bd.st.setString(9, aluno.getCep());
			bd.st.setString(10, aluno.getCidade());
			bd.st.setString(11, aluno.getUf());
			bd.st.setString(12, aluno.getTelefone());
			bd.st.setString(13, aluno.getEmail());
			
			try {
				
				
				Date dataNasc = formatoData.parse(aluno.getDataNasc());
				bd.st.setDate(4, new java.sql.Date(dataNasc.getTime()));
				System.out.println(new java.sql.Date(dataNasc.getTime()));
				
				bd.st.executeUpdate();
				retornoCadastro = "Inserido";
				return retornoCadastro;
				
				
			} catch (ParseException e) {
				
				e.printStackTrace();
				
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
	
	public String consultaAluno(Aluno aluno){
		
		BD bd = new BD();
		
		String sql = "SELECT * FROM ALUNO WHERE RA_ALUNO = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, aluno.getRa());
			
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				aluno.setNome(bd.rs.getString("NOME_ALUNO"));
				aluno.setCpf(bd.rs.getString("CPF_ALUNO"));
				aluno.setDataNasc(bd.rs.getString("DATA_NASCIMENTO"));
				aluno.setRg(bd.rs.getString("RG_ALUNO"));
				aluno.setRua(bd.rs.getString("ENDERECO_ALUNO"));
				aluno.setNumeroCasa(bd.rs.getString("NUMERO_CASA_ALUNO"));
				aluno.setBairro(bd.rs.getString("BAIRRO_ALUNO"));
				aluno.setCep(bd.rs.getString("CEP_ALUNO"));
				aluno.setCidade(bd.rs.getString("CIDADE_ALUNO"));
				aluno.setUf(bd.rs.getString("UF"));
				aluno.setTelefone(bd.rs.getString("Telefone"));
				aluno.setEmail(bd.rs.getString("EMAIL"));
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				
				
				retornoConsulta = "RA inexistente";
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
	
	public void listarAluno(Aluno aluno) {

		BD bd = new BD();
		
		String sql = "SELECT RA_ALUNO FROM ALUNO";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("RA_ALUNO");
                valores.add(valor);
            }
            
            aluno.setListaAlunos(valores);
            
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
