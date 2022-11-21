package controle;

import java.util.ArrayList;
import modelo.Remedio;

public class RemedioDAO {
	
	private ArrayList<Remedio> tabelaRemedio;
	
	public RemedioDAO() {
		this.tabelaRemedio = new ArrayList<>();
	}
	
	
	public boolean cadastrarRemedio(Remedio r) {
		if (r != null) {
			tabelaRemedio.add(r);
		}
		return false;
	}
	
	public boolean removeRemedio(Remedio r, String nome) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getNome() == nome) {
				tabelaRemedio.remove(remedio);
			}
		}
		
		return false;
	}
	
	public boolean atualizarRemedio(Remedio r, String nome) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getNome() == nome) {
				tabelaRemedio.remove(remedio);
				return true;
			}
		}
		
		return false;
	}
	
	public ArrayList<Remedio> consultaRemedios(){
		return this.tabelaRemedio;
	}

}
