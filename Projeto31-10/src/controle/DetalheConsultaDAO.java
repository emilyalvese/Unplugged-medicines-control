package controle;

import java.util.ArrayList;

import modelo.DetalheConsulta;
import modelo.IDetalheConsultaDAO;

public class DetalheConsultaDAO implements IDetalheConsultaDAO {

	private static ArrayList<DetalheConsulta> tabelaDetalheConsultas;
	private static DetalheConsultaDAO instancia;

	private DetalheConsultaDAO() {

	}

	public static DetalheConsultaDAO getInstancia() {
		if (instancia == null) {
			instancia = new DetalheConsultaDAO();
			tabelaDetalheConsultas = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean inserir(DetalheConsulta c) {
		if (c != null) {
			tabelaDetalheConsultas.add(c);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(DetalheConsulta c, String k) {
for (DetalheConsulta detalheConsulta : tabelaDetalheConsultas) {
	if(detalheConsulta.getTipoConsulta().equals(c)){
		
	}
}
		return false;
	}

	@Override
	public boolean deletar(DetalheConsulta c, String j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<DetalheConsulta> listarConsultas() {
		// TODO Auto-generated method stub
		return null;
	}

}
