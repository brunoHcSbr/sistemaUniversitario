package model;

import java.util.List;

public class Historico {
	
	private int codHistorico;
	private int codTurma;
	private String ra;
	private String conceito;
	private List<String> listaAlunos;
	
	public List<String> getListaAlunos() {
		return listaAlunos;
	}
	public void setListaAlunos(List<String> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	public int getCodHistorico() {
		return codHistorico;
	}
	public void setCodHistorico(int codHistorico) {
		this.codHistorico = codHistorico;
	}
	public int getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	
	public Historico() {
		
	}
	public Historico(int codHistorico, int codTurma, String ra) {
		this.codHistorico = codHistorico;
		this.codTurma = codTurma;
	}
	public Historico(int codHistorico) {
		this.codHistorico = codHistorico;
	}
	
	
}
