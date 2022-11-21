package visao;

import java.util.Scanner;

import controle.UsuarioDAO;

public class InterfaceSistema {
	public static void main(String[] args) {

		Integer opcaoSwitch = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstancia();

		while (opcaoSwitch != 0) {
			System.out.println("BEM VINDO AO UNPLUGGED MEDICINES CONTROL");
			System.out.println("JA É UM MEMBRO? SE SIM DIGITE 1, CASO NÃO, DIGITE 2");
			System.out.println("CASO NÃO DESEJE ENTRAR, POR FAVOR DIGITE 0");
			opcaoSwitch = Integer.valueOf(leitura.nextLine());

			switch (opcaoSwitch) {
			case 0: {
				break;
			}
			case 1: {
				System.out.println("Colcoar aqui a tela de login");
			}
			case 2: {
				System.out.println("Colcoar aqui a tela de cadastro");
			}
			}
		}

	}

}
