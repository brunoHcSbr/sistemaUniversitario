package banco;

import java.sql.SQLException;



public class InicioAlunoDAO {
	
	
	

	private String nomeAluno;
	private String CursoAluno;
	private String Semestre;
	private String cpfAluno;
	private String datnascAluno;
	private String cepAluno;
	private String enderecoAluno;
	private String numCasaAluno;
	private String cidadeAluno;
	private String ufAluno;
	private String bairroAluno;
	
	public String getBairroAluno() {
		return bairroAluno;
	}
	public void setBairroAluno(String bairroAluno) {
		this.bairroAluno = bairroAluno;
	}
	public String getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public String getDatnascAluno() {
		return datnascAluno;
	}
	public void setDatnascAluno(String datnascAluno) {
		this.datnascAluno = datnascAluno;
	}
	public String getCepAluno() {
		return cepAluno;
	}
	public void setCepAluno(String cepAluno) {
		this.cepAluno = cepAluno;
	}
	public String getEnderecoAluno() {
		return enderecoAluno;
	}
	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}
	public String getNumCasaAluno() {
		return numCasaAluno;
	}
	public void setNumCasaAluno(String numCasaAluno) {
		this.numCasaAluno = numCasaAluno;
	}
	public String getCidadeAluno() {
		return cidadeAluno;
	}
	public void setCidadeAluno(String cidadeAluno) {
		this.cidadeAluno = cidadeAluno;
	}
	public String getUfAluno() {
		return ufAluno;
	}
	public void setUfAluno(String ufAluno) {
		this.ufAluno = ufAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getCursoAluno() {
		return CursoAluno;
	}
	public void setCursoAluno(String cursoAluno) {
		CursoAluno = cursoAluno;
	}
	public String getSemestre() {
		return Semestre;
	}
	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
	
	
	
	
	
	
	public String listarAluno(String val) {
		BD bd = new BD();
		bd.getConnection();
		String avisoErro;
		if(val == "N") {
			avisoErro = "Erro";
			return avisoErro;
		}
		else {
			try {
				String sql = "SELECT * FROM ALUNO WHERE RA_ALUNO = '"+val+"'";
				
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				if(bd.rs.next()) {
				
				setNomeAluno(bd.rs.getString("NOME_ALUNO"));
				setCursoAluno(bd.rs.getString("RA_ALUNO"));
				setCpfAluno(bd.rs.getString("CPF_ALUNO"));
				setDatnascAluno(bd.rs.getString("DATA_NASCIMENTO"));
				setCepAluno(bd.rs.getString("CEP_ALUNO"));
				setCidadeAluno(bd.rs.getString("CIDADE_ALUNO"));
				setUfAluno(bd.rs.getString("UF"));
				setNumCasaAluno(bd.rs.getString("NUMERO_CASA_ALUNO"));
				setBairroAluno(bd.rs.getString("BAIRRO_ALUNO"));
				
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
