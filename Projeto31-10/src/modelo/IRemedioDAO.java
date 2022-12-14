package modelo;

import java.util.ArrayList;

public interface IRemedioDAO {
	
	public boolean cadastrarRemedio (Remedio r);
	
	public boolean removeRemedio (Remedio r, Long CodigoDeBarras);

	public boolean atualizarRemedio (Remedio r, Long CodigoDeBarras);
	
	public ArrayList<Remedio> remedios();
}
