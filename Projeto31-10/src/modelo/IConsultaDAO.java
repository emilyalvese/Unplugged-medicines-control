package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IConsultaDAO {
	
	public boolean inserir (Consulta c);
	
	public boolean alterar (Consulta c, String cidConsulta);
	
	public boolean deletar (Consulta c, String cidConsulta);

	public ArrayList<Consulta> consultas();
	
	

}
