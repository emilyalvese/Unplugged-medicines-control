package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Consulta;
import modelo.Usuario;

public class UsuarioDAO {

	private ArrayList<Usuario> tabelaUsuarios;

	// CONSTRUCTOR TO INITIALIZE THE TABLE OF CONSULTAS
	public UsuarioDAO() {
		this.tabelaUsuarios = new ArrayList<>();
	}

	// INSERT
	public boolean cadastraUsuario(Usuario u) {
		if (u != null) {
			tabelaUsuarios.add(u);
		}
		return false;
	}

	// DELETE
	public boolean deletar(Usuario u, String nome) {
		for (Usuario usuario : tabelaUsuarios) {
			if (usuario.getNome() == nome) {
				tabelaUsuarios.remove(usuario);
				return true;
			}
		}
		return false;

	}

	// UPDATE
	public boolean atualizaUsuario(Usuario u, String nome) {
		for (Usuario usuario : tabelaUsuarios) {
			if (usuario.getNome() == nome) {
				tabelaUsuarios.remove(usuario);
				return true;
			}

		}
		return false;
	}

	// SELECT ALL
	public ArrayList<Usuario> listaUsuarios() {
		return this.tabelaUsuarios;
	}

}
