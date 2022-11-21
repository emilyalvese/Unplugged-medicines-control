package visao;

import java.time.LocalDate;
import java.util.Scanner;

import controle.UsuarioDAO;
import modelo.Usuario;

public class InterfaceSistema {
	public static void main(String[] args) {

		Integer opcaoSwitch = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstancia();

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
					cadastroUsuario();
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

	public static void cadastroUsuario() {
		Usuario pessoa = new Usuario();

		Scanner leitura = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		String nome = leitura.nextLine();
		if (!nome.isEmpty()) {
			pessoa.setNome(nome);
		}

		System.out.println("Insira seu e-mail");
		String email = leitura.nextLine();
		if (!email.isEmpty()) {
			pessoa.setEmail(email);
		}
		System.out.println("Informe seu sexo: ");
		String sexo = leitura.nextLine();
		if (!sexo.isEmpty()) {
			pessoa.setSexo(sexo);
		}

		System.out.println("Informe sua data de nascimento");
		System.out.println("Insira o dia:");
		String diaVal = leitura.nextLine();
		System.out.println("Insira o mês:");
		String mesVal = leitura.nextLine();
		System.out.println("Insira o ano:");
		String anoVal = leitura.nextLine();
		if (!diaVal.isEmpty() && !mesVal.isEmpty() && !anoVal.isEmpty()) {
			int ano = Integer.parseInt(anoVal);
			int mes = Integer.parseInt(mesVal);
			int dia = Integer.parseInt(diaVal);
			LocalDate data = LocalDate.of(ano, mes, dia);
			pessoa.setNascimento(data);
		}
		System.out.println("Informe seu endereço: ");
		String endereco = leitura.nextLine();
		if (!endereco.isEmpty()) {
			pessoa.setEndereço(endereco);
			;
		}

		System.out.println("Informe seu telefone: ");
		String telefone = leitura.nextLine();
		if (!telefone.isEmpty()) {
			pessoa.setTelefone(Integer.valueOf(telefone));
		}

		System.out.println("Informe seu tipo sanguíneo: ");
		String tipoSanguineo = leitura.nextLine();
		if (!tipoSanguineo.isEmpty()) {
			pessoa.setTipoSanguineo(tipoSanguineo);

		}
		System.out.println("Informe o contato de algum familiar: ");
		String contatoFamilia = leitura.nextLine();
		if (!contatoFamilia.isEmpty()) {
			pessoa.setContatoFamilia(contatoFamilia);
			;
		}

	}
}
