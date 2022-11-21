package controle;

import java.util.ArrayList;

import modelo.DetalheConsulta;

public class DetalheConsultaDAO {

	private static ArrayList<DetalheConsulta> tabelaDetalheConsultas;

	public DetalheConsultaDAO() {
		tabelaDetalheConsultas = new ArrayList<>();
	}

	// INSERT
	public boolean cadastraDetalheConsulta(DetalheConsulta c) {
		if (c != null) {
			tabelaDetalheConsultas.add((DetalheConsulta) c);
		}
		return false;
	}

	// DELETE
	public boolean deletar(DetalheConsulta c, String tipoConsulta) {
		for (DetalheConsulta tipoConsulta1 : tabelaDetalheConsultas) {
			if (tipoConsulta1.getTipoConsulta() == tipoConsulta) {
				tabelaDetalheConsultas.remove(tipoConsulta1);
				return true;
			}
		}
		return false;
	}

	// UPDATE
	public boolean atualizaDetalheConsulta(DetalheConsulta c, String tipoConsulta) {
		for (DetalheConsulta tipoConsulta1 : tabelaDetalheConsultas) {
			if (tipoConsulta1.getTipoConsulta() == tipoConsulta) {
				tipoConsulta1.setTipoConsulta(c.getTipoConsulta());
				tipoConsulta1.setTipoConsulta(c.getMotivoConsulta());
				tipoConsulta1.setTipoConsulta(c.getLocalConsulta());
				tipoConsulta1.setTipoConsulta(c.getFeedbackConsulta());
				return true;
			}
		}
		return false;
	}

	public ArrayList<DetalheConsulta> listarDetalheConsultas() {
		return this.tabelaDetalheConsultas;
	}
}
