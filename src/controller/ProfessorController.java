package controller;

import java.util.List;

import banco.ProfessorDAO;
import model.Professor;
import view.CadastroProfessorView;

public class ProfessorController extends Professor{
	
	private String retornoCadastro;
	private String nomeCoordenador;
	private String nomeProfessor;
	private List<String> listaCoordenadores;
	private List<String> listaProfessores;
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodCoordenador() {
		return codCoordenador;
	}

	public void setCodCoordenador(String codCoordenador) {
		this.codCoordenador = codCoordenador;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
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
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public List<String> getListaProfessores() {
		return listaProfessores;
	}

	public void setListaProfessores(List<String> listaProfessores) {
		this.listaProfessores = listaProfessores;
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public List<String> getListaCoordenadores() {
		return listaCoordenadores;
	}

	public void setListaCoordenadores(List<String> listaCoordenadores) {
		this.listaCoordenadores = listaCoordenadores;
	}
	
	

	public String cadastrarProfessor(CadastroProfessorView view) {
		
		ProfessorDAO pDAO = new ProfessorDAO();
		
		
		Professor pConsulta = new Professor(view.getTfMatricula().getText());
		
		if(pDAO.consultaProfessor(pConsulta) == "Matricula inexistente") {
			Professor p = new Professor(view.getTfMatricula().getText(),view.getTfCodCoordenador().getText(),view.getTfNome().getText(),view.getTfCategoria().getText(),view.getTfCPF().getText(),
								view.getTfDataNasc().getText(),view.getTfRG().getText(),view.getTfRua().getText(),
								view.getTfNumeroCasa().getText(),view.getTfBairro().getText(),view.getTfCEP().getText(),
								view.getTfCidade().getText(),view.getTfUf().getText(),view.getTfTelefone().getText(),view.getTfEmail().getText());
			
			pDAO.cadastrarProfessor(p);
			
			retornoCadastro = "Cadastrado";
			return retornoCadastro;
		}
		else if(pDAO.consultaProfessor(pConsulta) == "Realizado") {
			
			System.out.println("Matricula existe");
			
			retornoCadastro = "Matricula existe";
			return retornoCadastro;
		}
		else {
			System.out.println("Erro");
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		
	}
	public void consultarProfessor(String codProfessor) {
		
		ProfessorDAO pDAO = new ProfessorDAO();
		Professor p = new Professor(codProfessor);
		
		pDAO.consultaProfessor(p);
		setNome(p.getNome());
		setCpf(p.getCpf());
		setRg(p.getRg());
		setDataNasc(p.getDataNasc());
		setBairro(p.getBairro());
		setRua(p.getRua());
		setNumeroCasa(p.getNumeroCasa());
		setCategoria(p.getCategoria());
		setCep(p.getCep());
		setCidade(p.getCidade());
		setUf(p.getUf());
		setTelefone(p.getTelefone());
		setEmail(p.getEmail());
		
	}
	public void consultarNomeCoordenador(String codCoordenador) {
		
		ProfessorDAO pDAO = new ProfessorDAO();
		Professor p = new Professor(codCoordenador);
		
		pDAO.consultaProfessor(p);
		
		setNomeCoordenador(p.getNome());
	}
	
	public void listarCoordenadores(){
		
		ProfessorDAO pDAO = new ProfessorDAO();
		Professor p = new Professor();
		pDAO.listarCoordenadores(p);
		setListaCoordenadores(p.getListaCoordenadores());
		
		}
	
	public void listarProfessores(){
		
		ProfessorDAO pDAO = new ProfessorDAO();
		Professor p = new Professor();
		pDAO.listarProfessores(p);
		setListaProfessores(p.getListaProfessores());
		
		}
	
	public void consultarNomeProfessor(String codProfessor) {
		
		ProfessorDAO pDAO = new ProfessorDAO();
		Professor p = new Professor(codProfessor);
		
		pDAO.consultaProfessor(p);
		
		setNomeProfessor(p.getNome());
	}
}
