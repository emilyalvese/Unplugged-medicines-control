package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> tabelaUsuarios;
	private static UsuarioDAO instancia;

	private UsuarioDAO() {
	}

	
	///criar método get tabelaConsultas para poder verificar se existe usuário no banco ou não
	

	
	
	public static UsuarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			tabelaUsuarios = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean inserir(Usuario u) {

		if (u != null) {
			tabelaUsuarios.add(u);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterar(Usuario u, String email) {
		for (Usuario usuario : tabelaUsuarios) {
			if (usuario.getEmail().equals(email)) {
				usuario.setEmail(u.getEmail());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deletar(Usuario u, String email) {
		for (Usuario usuario : tabelaUsuarios) {
			if (usuario.getEmail().equals(email)) {
				tabelaUsuarios.remove(usuario);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		return tabelaUsuarios;
	}

}
