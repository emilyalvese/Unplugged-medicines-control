package modelo;

import java.util.ArrayList;

public interface IDetalheConsultaDAO {

	public boolean inserir(DetalheConsulta c);
	
	public boolean alterar(DetalheConsulta c, String k);
	
	public boolean deletar(DetalheConsulta c, String j);
	
	public ArrayList<DetalheConsulta> listarConsultas();
	
	
}
