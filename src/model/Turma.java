package model;

import java.util.List;

public class Turma {
	private int codTurma,codProfessorResponsavel,codCurriculo,codCurso,codDisciplina;
	private String semestreTurma,ano,semestreAno,descricao,professorResponsavel,diaSemana;
	private String horaInicio,horaFim;
	private List<String> listaTurmas;
	
	public String getHoraFim() {
		return horaFim;
	}
	public List<String> getListaTurmas() {
		return listaTurmas;
	}
	public void setListaTurmas(List<String> listaTurmas) {
		this.listaTurmas = listaTurmas;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
	public String getSemestreTurma() {
		return semestreTurma;
	}
	public void setSemestreTurma(String semestreTurma) {
		this.semestreTurma = semestreTurma;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getSemestreAno() {
		return semestreAno;
	}
	public void setSemestreAno(String semestreAno) {
		this.semestreAno = semestreAno;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodProfessorResponsavel() {
		return codProfessorResponsavel;
	}
	public void setCodProfessorResponsavel(int codProfessorResponsavel) {
		this.codProfessorResponsavel = codProfessorResponsavel;
	}
	public String getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(String professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
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
	
	
	public Turma(int codTurma, int codProfessor, int codCurriculo) {
		this.codTurma = codTurma;
		this.codProfessorResponsavel = codProfessor;
		this.codCurriculo = codCurriculo;
	}
	
	public Turma(int codTurma, int codProfessor, int codCurriculo,String semestreAno, String diaSemana, String horaInicio, String horaFim, String ano) {
		this.codTurma = codTurma;
		this.codProfessorResponsavel = codProfessor;
		this.codCurriculo = codCurriculo;
		this.semestreAno = semestreAno;
		this.diaSemana = diaSemana;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.ano = ano;
		
	}
	
	public Turma() {
		
	}
	
}
