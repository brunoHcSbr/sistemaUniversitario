package controller;

import java.util.List;

import banco.TurmaDAO;
import model.Turma;
import view.CadastrarTurmaView;

public class TurmaController {
	
	private String retornoTurma;
	private List<String> listaTurmas;
	
	public List<String> getListaTurmas() {
		return listaTurmas;
	}


	public void setListaTurmas(List<String> listaTurmas) {
		this.listaTurmas = listaTurmas;
	}


	public String cadastrarTurma(CadastrarTurmaView view) {
		TurmaDAO tDAO = new TurmaDAO();
		
		Turma tConsulta = new Turma(Integer.parseInt(view.getTfCodTurma().getText()),Integer.parseInt((String) view.getComboBoxProfessor().getSelectedItem()),
							Integer.parseInt((String) view.getComboBoxCurriculo().getSelectedItem()));
		
		if(tDAO.consultarTurma(tConsulta) == "Turma inexistente") {
			
			Turma t = new Turma(Integer.parseInt(view.getTfCodTurma().getText()),Integer.parseInt((String) view.getComboBoxProfessor().getSelectedItem()),
					Integer.parseInt((String) view.getComboBoxCurriculo().getSelectedItem()),
					(String) view.getComboBoxSemestre().getSelectedItem(),(String) view.getComboBoxDia().getSelectedItem(),
					view.getTfHoraInicio().getText(),view.getTfHorafim().getText(),view.getTfAno().getText());

			tDAO.cadastrar(t);	
			
			retornoTurma = "Cadastrado";
			return retornoTurma;
		}
		else if(tDAO.consultarTurma(tConsulta) == "Realizado") {
			retornoTurma = "Turma existe";
			return retornoTurma;
		}
		else {
			retornoTurma = "Erro";
			return retornoTurma;
		}
		
	}

	
	public void consultarTurma() {
		TurmaDAO tDAO = new TurmaDAO();
		Turma t = new Turma(3,55555,1);
		tDAO.consultarTurma(t);
	}
	public void listarTurmas(){
		
		TurmaDAO tDAO = new TurmaDAO();
		Turma t = new Turma();
		tDAO.listarTurma(t);
		setListaTurmas(t.getListaTurmas());
		
		}
	
	public void listarTurmas(String codProfessor) {
		
		TurmaDAO tDAO = new TurmaDAO();
		Turma t = new Turma();
		tDAO.listarTurma(t,codProfessor);
		setListaTurmas(t.getListaTurmas());
		
	}
	
}
