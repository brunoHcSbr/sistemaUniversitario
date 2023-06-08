package controller;

import java.util.List;

import banco.AlunoDAO;
import model.Aluno;
import view.CadastroAluno;

public class AlunoController extends Aluno{
	
	private String retornoCadastro;
	private List<String> listaAlunos;
	
	public List<String> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<String> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return rua;
	}

	public String cadastroAluno(CadastroAluno aluno) {
		
		AlunoDAO aDAO = new AlunoDAO();
		
		Aluno aConsulta = new Aluno(aluno.getTfRA().getText());
		//aDAO.consultaAluno(aConsulta);
		
		if(aDAO.consultaAluno(aConsulta) == "RA inexistente") {
			Aluno a = new Aluno(aluno.getTfRA().getText(),aluno.getTfNome().getText(),aluno.getTfCPF().getText(),
								aluno.getTfDataNasc().getText(),aluno.getTfRG().getText(),aluno.getTfRua().getText(),
								aluno.getTfNumeroCasa().getText(),aluno.getTfBairro().getText(),aluno.getTfCEP().getText(),
								aluno.getTfCidade().getText(),aluno.getTfUf().getText(),aluno.getTfTelefone().getText(),aluno.getTfEmail().getText());
			
			aDAO.cadastroAluno(a);
			
			retornoCadastro = "Cadastrado";
			return retornoCadastro;
		}
		else if(aDAO.consultaAluno(aConsulta) == "Realizado") {
			
			System.out.println("RA existe");
			
			retornoCadastro = "RA existe";
			return retornoCadastro;
		}
		else {
			System.out.println("Erro");
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		
		
		//aDAO.cadastroAluno(a);
		

	}
	
	public void consultaAluno(String ra) {
		
		AlunoDAO aDAO = new AlunoDAO();
		
		Aluno a = new Aluno(ra);
		
		aDAO.consultaAluno(a);
		
		setTelefone(a.getTelefone());
		setEmail(a.getEmail());
		setRua(a.getRua());
		
		}
	public void listarAluno(){
		
		AlunoDAO aDAO = new AlunoDAO();
		Aluno a = new Aluno();
		aDAO.listarAluno(a);
		setListaAlunos(a.getListaAlunos());
		
		
		}
}
