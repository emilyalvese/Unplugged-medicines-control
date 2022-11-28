package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IConsultaDAO {
	
	public boolean inserir (Consulta c);
	
	public boolean alterar (Consulta c, LocalDate dataConsulta);
	
	public boolean deletar (Consulta c, LocalDate dataConsulta);
	
	public ArrayList<Consulta> listaConsultas();

	public ArrayList<Consulta> consultas();
	
	

}
