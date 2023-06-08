package banco;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Turma;

public class TurmaDAO {
	
	private String retornoCadastro, retornoConsulta;
	
	public String cadastrar(Turma turma) {
		BD bd = new BD();
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		String sql = "INSERT INTO TURMA VALUES (?,?,?,?,?,?,?,?)";
		
		bd.getConnection();
		try {
			
			System.out.println(turma.getAno());
			System.out.println(turma.getCodProfessorResponsavel());
			System.out.println(turma.getCodCurriculo());
			
			
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, turma.getCodTurma());
			bd.st.setInt(2, turma.getCodProfessorResponsavel());
			bd.st.setInt(3, turma.getCodCurriculo());
			bd.st.setString(4, turma.getSemestreAno());
			bd.st.setString(5, turma.getDiaSemana());
			bd.st.setString(8, turma.getAno());
			 
			try {
				
				System.out.println("Não deu erro");
				
				Date horaInicio = formatoHora.parse(turma.getHoraInicio());
				bd.st.setTime(6, new java.sql.Time(horaInicio.getTime()));
				System.out.println(new java.sql.Time(horaInicio.getTime()));
				
				
				
				
			} catch (ParseException e) {
				
				e.printStackTrace();
				System.out.println("Erro");
			}
			try {
				Date horaFim = formatoHora.parse(turma.getHoraFim());
				bd.st.setTime(7, new java.sql.Time(horaFim.getTime()));
				
				bd.st.executeUpdate();
				
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
			
			
			retornoCadastro = "Inserido";
			return retornoCadastro;
			
		}
		catch(SQLException erro){
			retornoCadastro = "Erro";
			return retornoCadastro;
		}
		finally {
			bd.close();
		}
		
		
	}
	
	public String consultarTurma(Turma turma) {
		BD bd = new BD();
		
		String sql = "SELECT * FROM TURMA WHERE COD_TURMA = ? AND MATRICULA_PROFESSOR = ? AND COD_CURRICULO = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, turma.getCodTurma());
			bd.st.setInt(2, turma.getCodProfessorResponsavel());
			bd.st.setInt(3, turma.getCodCurriculo());
			
			bd.rs = bd.st.executeQuery();
			
			if(bd.rs.next()) {
				
				
				turma.setCodCurso(bd.rs.getInt("COD_CURSO"));
				turma.setCodDisciplina(bd.rs.getInt("COD_DISCIPLINA"));
				turma.setSemestreAno(bd.rs.getString("SEMESTRE_ANO"));
				turma.setDiaSemana(bd.rs.getString("DIA_SEMANA"));
				turma.setHoraInicio(bd.rs.getString("HORARIO_INICIO"));
				turma.setHoraFim(bd.rs.getString("HORARIO_FIM"));
				
				System.out.println(sql);
				System.out.println(bd.rs.getInt("COD_CURSO"));
				System.out.println(bd.rs.getInt("COD_DISCIPLINA"));
				System.out.println(bd.rs.getString("SEMESTRE_ANO"));
				System.out.println(bd.rs.getString("DIA_SEMANA"));
				System.out.println(bd.rs.getString("HORARIO_INICIO"));
				System.out.println(bd.rs.getString("HORARIO_FIM"));
				
				
				retornoConsulta = "Realizado";
				return retornoConsulta;
				}
				else {
				
				retornoConsulta = "Turma inexistente";
				return retornoConsulta;
				}
			
		}
		catch(SQLException erro){
		
			
			retornoConsulta = "Erro";
			return retornoConsulta;
		}
		finally {
			bd.close();
		}
	}
	public void listarTurma(Turma turma) {

		BD bd = new BD();
		
		String sql = "SELECT COD_TURMA FROM TURMA";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("COD_TURMA");
                valores.add(valor);
            }
            
            turma.setListaTurmas(valores);
            
            // Exibindo os valores
            for (String valor : valores) {
                System.out.println(valor);
            }

		}
		catch(SQLException erro){
		
			System.out.println("Erro no Banco de Dados");
		}
		finally {
			bd.close();
		}
		
	}
	
	public void listarTurma(Turma turma, String codProfessor) {

		BD bd = new BD();
		
		String sql = "SELECT COD_TURMA FROM TURMA WHERE MATRICULA_PROFESSOR = ?";
		
		bd.getConnection();
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, codProfessor);
			bd.rs = bd.st.executeQuery();
			

            // Criando uma lista para armazenar os valores
            List<String> valores = new ArrayList<>();

            // Processando os resultados
            while (bd.rs.next()) {
                String valor = bd.rs.getString("COD_TURMA");
                valores.add(valor);
            }
            
            turma.setListaTurmas(valores);
            
            // Exibindo os valores
            for (String valor : valores) {
                System.out.println(valor);
            }

		}
		catch(SQLException erro){
		
			System.out.println("Erro no Banco de Dados");
		}
		finally {
			bd.close();
		}
		
	}

}
