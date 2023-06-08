package model;

import java.util.List;

public class Curriculo {
	private int codCurriculo;
	private int codCurso;
	private int codDisciplina;
	private String semestreGrade;
	private List<String> listaCurriculo;
	
	
	public List<String> getListaCurriculo() {
		return listaCurriculo;
	}
	public void setListaCurriculo(List<String> listaCurriculo) {
		this.listaCurriculo = listaCurriculo;
	}
	public int getCodCurriculo() {
		return codCurriculo;
	}
	public void setCodCurriculo(int codCurriculo) {
		this.codCurriculo = codCurriculo;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getSemestreGrade() {
		return semestreGrade;
	}
	public void setSemestreGrade(String semestreGrade) {
		this.semestreGrade = semestreGrade;
	}
	
	public Curriculo(int codCurriculo, int codCurso, int codDisciplina, String semestreGrade) {
		this.codCurriculo = codCurriculo;
		this.codCurso = codCurso;
		this.codDisciplina = codDisciplina;
		this.semestreGrade = semestreGrade;
	}
	
	public Curriculo(int codCurriculo) {
		this.codCurriculo = codCurriculo;
	}
	public Curriculo() {
		
	}
	
}
