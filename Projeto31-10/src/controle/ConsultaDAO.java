package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Consulta;

public class ConsultaDAO {

	private ArrayList<Consulta> tabelaConsultas;

	// CONSTRUCTOR TO INITIALIZE THE TABLE OF CONSULTAS
	public ConsultaDAO() {
		this.tabelaConsultas = new ArrayList<>();
	}

	// INSERT
	public boolean cadastraConsulta(Consulta c) {
		if (c != null) {
			tabelaConsultas.add(c);
		}
		return false;
	}

	// DELETE
	public boolean deletar(Consulta c, LocalDate dataConsulta) {
		for (Consulta consulta : tabelaConsultas) {
			if (consulta.getDataConsulta() == dataConsulta) {
				tabelaConsultas.remove(consulta);
				return true;
			}
		}
		return false;

	}

	// UPDATE
	
	///Corrigir todos os updates de todos os DAOS para setarem os novos valores
	public boolean atualizaConsulta(Consulta c, LocalDate dataConsulta) {
		for (Consulta consulta : tabelaConsultas) {
			if (consulta.getDataConsulta() == dataConsulta) {
				consulta.setDataConsulta(c.getDataConsulta());
				return true;
			}

		}
		return false;
	}

	// SELECT ALL
	public ArrayList<Consulta> listaConsultas() {
		return this.tabelaConsultas;
	}

}
