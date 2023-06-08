package model;

import java.util.List;

public class Notas {
	
	private int cod_turma;
	private String sigla_nota;
	private String descricao;
	private String conceito;
	private String raAluno;
	private float peso;
	private float valor;
	private float media;
	private List<String> listaSigla;
	private List<String> listaRa;
	
	
	
	
	
	
	
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	
	public String getRaAluno() {
		return raAluno;
	}
	public List<String> getListaRa() {
		return listaRa;
	}
	public void setListaRa(List<String> listaRa) {
		this.listaRa = listaRa;
	}
	public void setRaAluno(String raAluno) {
		this.raAluno = raAluno;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public List<String> getListaSigla() {
		return listaSigla;
	}
	public void setListaSigla(List<String> listaSigla) {
		this.listaSigla = listaSigla;
	}
	public int getCod_turma() {
		return cod_turma;
	}
	public void setCod_turma(int cod_turma) {
		this.cod_turma = cod_turma;
	}
	public String getSigla_nota() {
		return sigla_nota;
	}
	public void setSigla_nota(String sigla_nota) {
		this.sigla_nota = sigla_nota;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void CadastrarModelo() {
		
	}
	public void AtualizarModelo() {
		
	}

	public Notas(String siglaNota,int codTurma ,String descricao, float peso) {
		this.sigla_nota = siglaNota;
		this.cod_turma = codTurma;
		this.descricao = descricao;
		this.peso = peso;
	}
	public Notas(String siglaNota) {
		this.sigla_nota = siglaNota;
	}
	public Notas(int codTurma) {
		this.cod_turma = codTurma;
	}
	
	public Notas(String siglaNota, String raAluno, float valor) {
		this.sigla_nota = siglaNota;
		this.raAluno = raAluno;
		this.valor = valor;
	}
	public Notas(String siglaNota, String raAluno) {
		this.sigla_nota = siglaNota;
		this.raAluno = raAluno;
	}
	
	public Notas(String raAluno, int codTurma, float media, String conceito) {
		this.raAluno = raAluno;
		this.cod_turma = codTurma;
		this.media = media;
		this.conceito = conceito;
	}
	
	public Notas() {
		
	}
}
