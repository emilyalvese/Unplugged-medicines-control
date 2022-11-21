package visao;

import java.util.Scanner;

import controle.UsuarioDAO;
import modelo.Usuario;

public class InterfaceSistema {
	public static void main(String[] args) {

		Integer opcaoSwitch = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstancia();
		MainUsuario mainU = new MainUsuario();
		
		while (opcaoSwitch != 0) {
			System.out.println("Bem-Vindo ao Unplugged Medicines Control, é um prazer servir você");
			System.out.println("---------------------------------------------------------------");

			opcaoSwitch = Integer.valueOf(leitura.nextLine());

			switch (opcaoSwitch) {
			case 0: {
				break;
			}

			case 1: {
				Usuario u = new Usuario();
				if (bancoUsuario.listarUsuarios().isEmpty()) {
					System.out.println("Pelo visto você é novo, vamos efetuar seu cadastro!");
           mainU.executar();
				} else {
					System.out.println("Bem vindo" + u.getNome() + "é um prazer receber você! ");
					continue;
				}
			}
			case 2: {
				System.out.println("Colcoar aqui a tela de cadastro");
			}
			}
		}

	}

}
