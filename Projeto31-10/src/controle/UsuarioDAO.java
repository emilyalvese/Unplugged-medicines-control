package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> tabelaUsuarios;
	private static UsuarioDAO instancia;

	private UsuarioDAO() {
	}


	public ArrayList<Usuario> usuarios() {//exemplo listagem 
		System.out.println("passou aqui");
	if(!tabelaUsuarios.isEmpty()) {
		for (Usuario usuario : tabelaUsuarios) {
			System.out.println("-------------");
			System.out.println("nome: "+ usuario.getNome());
			System.out.println("E-mail: " + usuario.getEmail());
			System.out.println("Sexo: "+ usuario.getSexo());
			System.out.println("Telefone: " + usuario.getTelefone());
			System.out.println("Endereço:" + usuario.getEndereço());
			System.out.println("Tipo Sanguíneo:" + usuario.getTipoSanguineo());
			System.out.println("Data de nascimento: "+ usuario.getNascimento());

		}
	}
		return tabelaUsuarios;
	}

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
