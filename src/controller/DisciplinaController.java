package controller;

import java.util.List;

import banco.BD;
import banco.DisciplinaDAO;
import model.Disciplina;
import view.CadastrarDisciplinaView;

public class DisciplinaController {
	
private String retornoCadastro;
private String nomeDisciplinas;
private List<String> listaDisciplinas;


public String getNomeDisciplinas() {
	return nomeDisciplinas;
}
public void setNomeDisciplinas(String nomeDisciplinas) {
	this.nomeDisciplinas = nomeDisciplinas;
}

	
	public List<String> getListaDisciplinas() {
	return listaDisciplinas;
}
public void setListaDisciplinas(List<String> listaDisciplinas) {
	this.listaDisciplinas = listaDisciplinas;
}
	public String cadastrarDisciplina(CadastrarDisciplinaView view) {
		
		DisciplinaDAO dDAO = new DisciplinaDAO();
		Disciplina dConsulta = new Disciplina(Integer.parseInt(view.getTfCodDisciplina().getText()));

		
		
		if(dDAO.consultaDisciplina(dConsulta) == "Disciplina inexistente") {
			Disciplina d = new Disciplina(Integer.parseInt(view.getTfCodDisciplina().getText()),view.getTfNomeDisciplina().getText(),view.getTfQtdDias().getText(),
					view.getTfCargaHoraria().getText(),view.getTfDescricao().getText());

			dDAO.cadastrarDisciplina(d);
			
			retornoCadastro = "Cadastrado";
			return retornoCadastro;
		}
		else if(dDAO.consultaDisciplina(dConsulta) == "Realizado") {
			
			System.out.println("Disciplina existe");
			
			retornoCadastro = "Disciplina existe";
			return retornoCadastro;
		}
		else {
			System.out.println("Erro");
			
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
	
				
	}
	public void consultarNomeDisciplina(String codDisciplina) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		BD bd = new BD();
		bd.getConnection();
		
		Disciplina d = new Disciplina(Integer.parseInt(codDisciplina));
		disciplinaDAO.consultaDisciplina(d);
		setNomeDisciplinas(d.getNomeDisciplina());
		
	}
	public void listarDisciplinas(){
		
		DisciplinaDAO dDAO = new DisciplinaDAO();
		Disciplina d = new Disciplina();
		dDAO.listaDisciplinas(d);
		setListaDisciplinas(d.getListaDisciplinas());
		
		}
	
}
