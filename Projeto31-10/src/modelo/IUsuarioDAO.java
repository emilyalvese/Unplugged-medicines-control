package modelo;

import java.util.ArrayList;

public interface IUsuarioDAO {

	public boolean inserir(Usuario u);

	public boolean alterar(Usuario u, String nome);

	public boolean deletar(Usuario u, String nome);

	public ArrayList<Usuario> listarUsuarios();

}
