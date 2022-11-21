package controle;

import java.util.ArrayList;
import modelo.IRemedioDAO;
import modelo.Remedio;

public class RemedioDAO  implements IRemedioDAO {
	
	private static ArrayList<Remedio> tabelaRemedio;
	private static RemedioDAO instancia;
	
	private RemedioDAO() {
		
	}
	
	public static RemedioDAO getInstancia() {
		if (instancia == null) {
			instancia = new RemedioDAO();
			tabelaRemedio = new ArrayList <>();
		}
		return instancia;
	}
	
	@Override
	public boolean cadastrarRemedio(Remedio r) {
		if (r != null) {
			tabelaRemedio.add(r);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean removeRemedio(Remedio r, String nome) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getNome().equals(nome)) {
				tabelaRemedio.remove(remedio);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean atualizarRemedio(Remedio r, String nome) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getNome().equals(nome)) {
				remedio.setNome(r.getNome());
				remedio.setMarca(r.getMarca());
				remedio.setValidade(r.getValidade());
				remedio.setTipoRemedio(r.getTipoRemedio());
				remedio.setHorarios(r.getHorarios());
				remedio.setQuantidadeDiaria(r.getQuantidadeDiaria());
				remedio.setArmazenamentoTotal(r.getArmazenamentoTotal());
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public ArrayList<Remedio> consultaRemedios(){
		return tabelaRemedio;
	}

}
