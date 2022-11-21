package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Consulta;

public class ConsultaDAO {

	private static ArrayList<Consulta> tabelaConsultas;

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
	public boolean atualizaConsulta(Consulta c, LocalDate dataConsulta) {
		for (Consulta consulta : tabelaConsultas) {
			if (consulta.getDataConsulta() == dataConsulta) {
				tabelaConsultas.remove(consulta);
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
