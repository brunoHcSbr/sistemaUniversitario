package controller;

import java.util.List;

import banco.CurriculoDAO;
import model.Curriculo;
import view.CadastrarCurriculoView;

public class CurriculoController {
	
	private String retornoCurriculo;
	private List<String> listaCurriculo;
	

	public List<String> getListaCurriculo() {
		return listaCurriculo;
	}

	public void setListaCurriculo(List<String> listaCurriculo) {
		this.listaCurriculo = listaCurriculo;
	}
	
	public String cadastrarCurriculo(CadastrarCurriculoView view) {
		
		CurriculoDAO cDAO = new CurriculoDAO();
		
		Curriculo cConsulta = new Curriculo(Integer.parseInt(view.getTfCodCurriculo().getText()));
		
		if(cDAO.consultaCurriculo(cConsulta) == "Curriculo inexistente"){
			Curriculo c = new Curriculo(Integer.parseInt(view.getTfCodCurriculo().getText()),Integer.parseInt((String) view.getComboBoxDisciplina().getSelectedItem()),
					Integer.parseInt((String) view.getComboBoxCurso().getSelectedItem()),view.getTfSemestreGrade().getText());

			cDAO.cadastroCurriculo(c);
			
			retornoCurriculo = "Cadastrado";
			return retornoCurriculo;
		}
		else if(cDAO.consultaCurriculo(cConsulta) == "Realizado"){
			
			
			retornoCurriculo = "Curriculo existe";
			return retornoCurriculo;
		}
		else {
			retornoCurriculo = "Erro";
			return retornoCurriculo;
		}
		
		
		
	}
	
	public void consultarCurriculo() {
		
CurriculoDAO cDAO = new CurriculoDAO();
		
		Curriculo c = new Curriculo(2);
		cDAO.consultaCurriculo(c);
	}
	
	public void listarCurriculo(){
		
		CurriculoDAO cDAO = new CurriculoDAO();
		Curriculo c = new Curriculo();
		cDAO.listarCurriculo(c);
		setListaCurriculo(c.getListaCurriculo());
		
		}

}
