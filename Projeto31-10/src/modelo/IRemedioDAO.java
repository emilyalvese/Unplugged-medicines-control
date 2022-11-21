package modelo;

import java.util.ArrayList;

public interface IRemedioDAO {
	
	public boolean cadastrarRemedio (Remedio r);
	
	public boolean removeRemedio (Remedio r, String nome);

	public boolean atualizarRemedio (Remedio r, String nome);
	
	public ArrayList<Remedio> consultaRemedios();S
	
}
