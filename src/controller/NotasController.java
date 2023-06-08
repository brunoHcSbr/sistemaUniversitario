package controller;

import java.util.List;

import banco.NotasDAO;
import model.Notas;
import view.InserirNotaView;
import view.ModeloNotaView;

public class NotasController {
	
	private String retornoNotas;
	private List<String> listaSiglas;
	private float valor;
	private float pesoNota;
	
	public float getPesoNota() {
		return pesoNota;
	}
	public void setPesoNota(float pesoNota) {
		this.pesoNota = pesoNota;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public List<String> getListaSiglas() {
		return listaSiglas;
	}
	public void setListaSiglas(List<String> listaSiglas) {
		this.listaSiglas = listaSiglas;
	}
	public String cadastroCurso(ModeloNotaView view) {
		
		
		NotasDAO nDAO = new NotasDAO();
		Notas nConsulta = new Notas(view.getTfSiglaNota().getText());
		
		if(nDAO.consultaNotas(nConsulta) == "Nota inexistente") {
			
			Notas n = new Notas(view.getTfSiglaNota().getText(),Integer.parseInt((String) view.getComboBoxTurma().getSelectedItem()),view.getTfDescricao().getText(),
								Float.parseFloat(view.getTfPesoNota().getText()));
			

			nDAO.cadastroNota(n);
			
			
			retornoNotas = "Cadastrado";
			return retornoNotas;
		}
		else if(nDAO.consultaNotas(nConsulta) == "Realizado") {
			
			retornoNotas = "Nota existe";
			return retornoNotas;
		}
		else {
			System.out.println("Erro");
			
			retornoNotas = "Erro";
			return retornoNotas;
		}		
	
	
}
	public void listarSiglas(int codTurma){
		
		NotasDAO nDAO = new NotasDAO();
		Notas n = new Notas(codTurma);
		nDAO.listarSigla(n);
		setListaSiglas(n.getListaSigla());
		
		}
	public String inserirNota (InserirNotaView view) {
		
		
		NotasDAO nDAO = new NotasDAO();
		Notas nConsulta = new Notas((String) view.getComboBoxSigla().getSelectedItem(), (String) view.getComboBoxAluno().getSelectedItem());
		
		if(nDAO.consultaNotasAluno(nConsulta) == "Nota inexistente") {
			
			Notas n = new Notas((String) view.getComboBoxSigla().getSelectedItem(),(String) view.getComboBoxAluno().getSelectedItem(),Float.parseFloat(view.getTfNota().getText()));
			
			nDAO.inserirNotaAluno(n);			
			
			
			retornoNotas = "Cadastrado";
			return retornoNotas;
		}
		else if(nDAO.consultaNotasAluno(nConsulta) == "Realizado") {
			
			retornoNotas = "Nota existe";
			return retornoNotas;
		}
		else {
			System.out.println("Erro");
			
			retornoNotas = "Erro";
			return retornoNotas;
		}	
	}
	
	public void consultarSiglas(String siglas, String ra) {
		
		Notas notaConsulta = new Notas(siglas, ra);
		NotasDAO nDAO = new NotasDAO();
		nDAO.consultaNotasAluno(notaConsulta);
		nDAO.consultaNotas(notaConsulta);
		setValor(notaConsulta.getValor());
		setPesoNota(notaConsulta.getPeso());
	}
	
	public String calcularMedia(InserirNotaView view) {
		
		 	float somaNota = 0;
		 	float somaPeso = 0;
		 	String conceito = null;
		 	String avisoValor = null;
		 	NotasDAO nDAO = new NotasDAO();
		 	
		 	for (float valor : view.getNotasAluno()) {
		 		
		 		System.out.println(valor);
	            if (valor == 0) {
	                avisoValor = "false";
	            }
	        }
		 	
		 	if(avisoValor == "false") {
		 		return avisoValor;
		 	}
		 	else {
		 		for (Float valor : view.getNotasAluno()) {
		            somaNota += valor;
		        }
		        
		        for (Float valor : view.getPesoNotas()) {
		            somaPeso += valor;
		        }

		        float media = somaNota / somaPeso;
		        System.out.println("Média: " + media);
		        if(media < 6) {
		        	conceito = "R";
		        }
		        else {
		        	conceito = "A";
		        }
		        
		        
		        System.out.println(conceito);
		        Notas notaConsulta = new Notas((String) view.getComboBoxAluno().getSelectedItem(), Integer.parseInt((String) view.getComboBoxTurma().getSelectedItem()), media, conceito);
		        
		        System.out.println((String) view.getComboBoxTurma().getSelectedItem());
		        
		        if(nDAO.cadastrarMedia(notaConsulta) == "Inserido") {
		        	
		        	return "Media cadastrada";
		        }
		        else {
		        	return "Erro";
		        }
		        
		        
		        
		 	}
	        
	        
		
	}
}
