package model;

import java.util.List;

public class Professor extends Pessoa{

	protected String matricula;
	protected String codCoordenador;
	protected String categoria;
	private List<String> listaCoordenadores;
	private List<String> listaProfessores;

	public List<String> getListaProfessores() {
		return listaProfessores;
	}

	public void setListaProfessores(List<String> listaProfessores) {
		this.listaProfessores = listaProfessores;
	}

	public List<String> getListaCoordenadores() {
		return listaCoordenadores;
	}

	public void setListaCoordenadores(List<String> listaCoordenadores) {
		this.listaCoordenadores = listaCoordenadores;
	}

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
	
	public Professor(String matricula, String codCoordenador, 
					String nome, String categoria, String cpf,
					String dataNasc,String rg, String rua, 
					String numeroCasa, String bairro, String cep, 
					String cidade, String uf, String telefone, String email) {
		
		this.matricula = matricula;
		this.codCoordenador = codCoordenador;
		this.nome = nome;
		this.categoria = categoria;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public Professor(String matricula) {
		this.matricula = matricula;
	}
	
	public Professor() {
		
	}
	
}
