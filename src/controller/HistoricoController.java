package controller;

import java.util.List;

import banco.HistoricoDAO;
import model.Historico;
import view.TurmaAlunoView;

public class HistoricoController {
	
	private String retornoHistorico;
	
	private List<String> listaAlunos;
	
	public List<String> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<String> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	
	
	public String cadastrarHistorico(TurmaAlunoView view) {
		
		
		Historico hConsulta = new Historico(Integer.parseInt(view.getTfCodHistorico().getText()));
		HistoricoDAO hDAO = new HistoricoDAO();
		
		if(hDAO.consultaHistorico(hConsulta) == "Historico inexistente") {
			
			Historico h = new Historico(Integer.parseInt(view.getTfCodHistorico().getText()),Integer.parseInt((String) view.getComboBoxTurma().getSelectedItem()),
										(String) view.getComboBoxAluno().getSelectedItem());
			
			hDAO.cadastroHistorico(h);
			
			retornoHistorico = "Cadastrado";
			return retornoHistorico;
		}
		else if(hDAO.consultaHistorico(hConsulta) == "Realizado") {
			retornoHistorico = "Historico existe";
			return retornoHistorico;
		}
		else {
			retornoHistorico = "Erro";
			return retornoHistorico;
		}

	}
	
	public void listarAluno(int codTurma){
		
		Historico h = new Historico();
		h.setCodTurma(codTurma);
		HistoricoDAO hDAO = new HistoricoDAO();
		hDAO.consultaAluno(h);
		
		setListaAlunos(h.getListaAlunos());
		
		
		}
		
}