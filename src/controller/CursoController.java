package controller;


import java.util.List;

import banco.CursoDAO;
import model.Curso;
import view.CadastrarCurso;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class CursoController {
	
	private String retornoCadastro;
	private List<String> listaCursos;
	private String nomeCurso;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public List<String> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<String> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public String cadastroCurso(CadastrarCurso view) {
		
		
			CursoDAO cursoDAO = new CursoDAO();
			Curso cursoConsulta = new Curso(Integer.parseInt(view.getTfCodCurso().getText()),Integer.parseInt((String) view.getComboBoxCodCoordenador().getSelectedItem()));
			
			if(cursoDAO.consultaCurso(cursoConsulta) == "Curso inexistente") {
				
				Curso curso = new Curso(Integer.parseInt(view.getTfCodCurso().getText()),Integer.parseInt((String) view.getComboBoxCodCoordenador().getSelectedItem()),
						view.getTfNomeCurso().getText(),view.getTfDuracaoAnos().getText(),view.getTfDescricao().getText());

				cursoDAO.cadastrarCurso(curso);
				
				
				retornoCadastro = "Cadastrado";
				return retornoCadastro;
			}
			else if(cursoDAO.consultaCurso(cursoConsulta) == "Realizado") {
				
				System.out.println("Curso existe");
				
				retornoCadastro = "Curso existe";
				return retornoCadastro;
			}
			else {
				System.out.println("Erro");
				
				retornoCadastro = "Erro";
				return retornoCadastro;
			}
			
		
			//Curso curso = new Curso(2,55555,"COMEX","2","Comercio Exterior");
			
		
		
	}
	
			public void consultaCursoNome(String codCurso) {
		
				CursoDAO cursoDAO = new CursoDAO();
		
				Curso curso = new Curso(Integer.parseInt(codCurso));
				cursoDAO.consultaNomeCurso(curso);
				setNomeCurso(curso.getNomeCurso());
		
	}
			
			public void listarCursos(){
				
				CursoDAO cDAO = new CursoDAO();
				Curso c = new Curso();
				cDAO.listaCursos(c);
				setListaCursos(c.getListaCursos());
				
				}
	
}
