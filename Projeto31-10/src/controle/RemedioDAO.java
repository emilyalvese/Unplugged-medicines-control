package controle;

import java.util.ArrayList;
import modelo.IRemedioDAO;
import modelo.Remedio;
import modelo.Usuario;

public class RemedioDAO  implements IRemedioDAO {
	
	private static ArrayList<Remedio> tabelaRemedio;
	private static RemedioDAO instancia;
	
	private RemedioDAO() {
		
	}
	
	
	public ArrayList<Remedio> remedios() { 
	if(!tabelaRemedio.isEmpty()) {
		for (Remedio remedio : tabelaRemedio) {
			System.out.println("-------------");
			System.out.println("nome: "+ remedio.getNome());
			System.out.println("Marca: " + remedio.getMarca());
			System.out.println("Validade: "+ remedio.getValidade());
			System.out.println("Tipo do remedio: " + remedio.getTipoRemedio());
			System.out.println("Horários:" + remedio.getHorarios());
			System.out.println("Quantidade diária:" + remedio.getQuantidadeDiaria());
			System.out.println("Armazenamento total: "+ remedio.getArmazenamentoTotal());
			System.out.println("Código de Barras: " + remedio.getCodigoDeBarra());

		}
	}
		return tabelaRemedio;
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
	public boolean removeRemedio(Remedio r, Long CodigoDeBarras) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getCodigoDeBarras().equals(CodigoDeBarras)) {
				tabelaRemedio.remove(remedio);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean atualizarRemedio(Remedio r, Long CodigoDeBarras) {
		for (Remedio remedio : tabelaRemedio) {
			if (remedio.getCodigoDeBarra().equals(CodigoDeBarras)) {
				remedio.setNome(r.getNome());
				remedio.setMarca(r.getMarca());
				remedio.setValidade(r.getValidade());
				remedio.setTipoRemedio(r.getTipoRemedio());
				remedio.setHorarios(r.getHorarios());
				remedio.setQuantidadeDiaria(r.getQuantidadeDiaria());
				remedio.setArmazenamentoTotal(r.getArmazenamentoTotal());
				remedio.setCodigoDeBarra(r.getCodigoDeBarra());
				return true;
			}
		}
		
		return false;
	}

}
