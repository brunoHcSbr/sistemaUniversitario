package model;

import java.util.List;

public class Disciplina {
	private int codDisciplina;
	private String nomeDisciplina;
	private String qtdDias;
	private String cargaHoraria;
	private String descricao;
	private List<String> listaDisciplinas;
	
	public List<String> getListaDisciplinas() {
		return listaDisciplinas;
	}
	public void setListaDisciplinas(List<String> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public String getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(String qtdDias) {
		this.qtdDias = qtdDias;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Disciplina(int codDisciplina, String nomeDisciplina, String qtdDias, String cargaHoraria, String descricao){
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.qtdDias = qtdDias;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}
	
	public Disciplina(int codDisciplina, String nomeDisciplina, String qtdDias, String cargaHoraria){
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.qtdDias = qtdDias;
		this.cargaHoraria = cargaHoraria;
	}
	public Disciplina(int codDisciplina, String nomeDisciplina){
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		
	}
	public Disciplina(int codDisciplina){
		this.codDisciplina = codDisciplina;
		
	}
	public Disciplina() {
		
	}
	
}
