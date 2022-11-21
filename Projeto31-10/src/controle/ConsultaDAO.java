package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Consulta;
import modelo.IConsultaDAO;
import modelo.Usuario;

public class ConsultaDAO implements IConsultaDAO{

	private static ArrayList<Consulta> tabelaConsultas;
	private static ConsultaDAO instancia; 
	
	private ConsultaDAO() {
	}

	
	///criar método get tabelaConsultas para poder verificar se existe usuário no banco ou não
	
	public static ConsultaDAO getInstancia() {

		if (instancia == null) {
			instancia = new ConsultaDAO();
			tabelaConsultas = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean inserir(Consulta c) {

		if (c != null) {
			tabelaConsultas.add(c);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterar(Consulta c, LocalDate dataConsulta) {
		for (Consulta consulta : tabelaConsultas) {
			if (consulta.getDataConsulta().equals(dataConsulta)) {
				
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deletar(Consulta c, LocalDate dataConsulta) {
		for (Consulta consulta : tabelaConsultas) {
			if (consulta.getDataConsulta().equals(dataConsulta)) {
				tabelaConsultas.remove(consulta);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Consulta> listaConsultas() {
		return tabelaConsultas;
	}

	

}

