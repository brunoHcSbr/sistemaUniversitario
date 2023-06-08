package model;

import java.sql.Date;
import java.util.List;

public class Curso {
	
	private int codCurso;
	private int codCoordenador;
	private String nomeCurso;
	private String duracaoAnos;
	private Date dataReconhecimento;
	private List<String> listaCursos;
	
	
	public List<String> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(List<String> listaCursos) {
		this.listaCursos = listaCursos;
	}
	public Date getDataReconhecimento() {
		return dataReconhecimento;
	}
	public void setDataReconhecimento(Date dataReconhecimento) {
		this.dataReconhecimento = dataReconhecimento;
	}

	private String descricao;
	
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public int getCodCoordenador() {
		return codCoordenador;
	}
	public void setCodCoordenador(int codCoordenador) {
		this.codCoordenador = codCoordenador;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getDuracaoAnos() {
		return duracaoAnos;
	}
	public void setDuracaoAnos(String duracaoAnos) {
		this.duracaoAnos = duracaoAnos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Curso(int codCurso, int codCoordenador, String nomeCurso, java.util.Date date,String duracaoAnos, String descricao) {
		this.codCurso = codCurso;
		this.codCoordenador = codCoordenador;
		this.nomeCurso = nomeCurso;
		this.dataReconhecimento = (Date) date;
		this.duracaoAnos = duracaoAnos;
		this.descricao = descricao;
	}
	
	public Curso(int codCurso, int codCoordenador, String nomeCurso, String duracaoAnos, String descricao) {
		this.codCurso = codCurso;
		this.codCoordenador = codCoordenador;
		this.nomeCurso = nomeCurso;
		this.duracaoAnos = duracaoAnos;
		this.descricao = descricao;
	}
	
	public Curso(int codCurso, int codCoordenador, String nomeCurso) {
		this.codCurso = codCurso;
		this.codCoordenador = codCoordenador;
	}
	
	public Curso(int codCurso, int codCoordenador) {
		this.codCurso = codCurso;
		this.codCoordenador = codCoordenador;
	}
	
	public Curso(int codCurso) {
		this.codCurso = codCurso;
	}
	
	public Curso() {
		
	}
}
