package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import controle.ConsultaDAO;
import controle.DetalheConsultaDAO;
import controle.RemedioDAO;
import controle.UsuarioDAO;
import modelo.Consulta;
import modelo.DetalheConsulta;
import modelo.Remedio;
import modelo.Usuario;

public class InterfaceSistema {
	public static void main(String[] args) {

		Integer opcaoSwitch = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstancia();

		System.out.println("Bem-Vindo ao Unplugged Medicines Control, é um prazer servir você");
		System.out.println("---------------------------------------------------------------");

		while (opcaoSwitch != 0) {
			System.out.println("Menu da Home Page");
			System.out.println("----------------------------");
			System.out.println("--- 0 SAIR ---");
			/// arrumar pq a opção 1 verifica os usuários cadastrados ou não
			System.out.println("--- 1 CADASTRAR USUÁRIOS ---");
			System.out.println("--- 2 CADASTRAR CONSULTA ---");
			System.out.println("--- 3 CADASTRAR DETALHES DA SUA CONSULTA (AVALIAÇÕES EM GERAL) ---");
			System.out.println("--- 4 CADASTRAR REMÉDIO ---");
			System.out.println("--- 5 LISTAR USUARIOS CADASTRADOS ---");
			System.out.println("--- 6 LISTAR CONSULTAS EXISTENTES ---");
			System.out.println("--- 7 LISTAR REMÉDIOS EXISTENTES ---");
			System.out.println("--- 8 LISTAR AVALIAÇÕES DE CONSULTAS EXISTENTES ---");

			opcaoSwitch = Integer.valueOf(leitura.nextLine());

			switch (opcaoSwitch) {
			case 0: {
				break;
			}

			// Se o usuario já existe, mostra a tela da home, caso não, cria um usuário novo
			case 1: {
				Usuario u = new Usuario();
				if (bancoUsuario.listarUsuarios().isEmpty()) {
					System.out.println("Pelo visto você é novo, vamos efetuar seu cadastro!");
					cadastroUsuario();
					continue;
				} else {
					System.out.println("Bem vindo" + u.getNome() + "é um prazer receber você! ");
					continue;
				}
			}
			/// Cadastro das consultas
			case 2: {
				cadastroConsulta();
				continue;
			}

			case 3: {
				cadastroDetalhesConsulta();
				continue;
			}
			case 4: {
				cadastroRemedio();
				continue;
			}

			case 5: {

				listaUsuarios();
				// listar usuários cadastrados
				continue;
			}
			case 6: {
				// listar as consultas existentes
			}

			case 7: {
				// listar remédios existentes
			}

			case 8: {
				// listar feedbacks de consultas existentes
			}
			}
		}

	}

	public static void listaUsuarios() {
		UsuarioDAO usuarioBanco = UsuarioDAO.getInstancia();

		if (!usuarioBanco.usuarios().isEmpty()) {
			usuarioBanco.listarUsuarios();
			System.out.println("Entrou");
		} else {
			System.out.println("Não há usuarios cadastrados em nosso sistema.");
		}
	}

	public static void cadastroRemedio() {
		Scanner leitura = new Scanner(System.in);
		RemedioDAO bancoRemedio = RemedioDAO.getInstancia();

		Remedio remedio = new Remedio();

		System.out.println("Nome do medicamento:");
		String nomeRemedio = leitura.nextLine();
		if (!nomeRemedio.isEmpty()) {
			remedio.setNome(nomeRemedio);
		}

		System.out.println("Marca do medicamento:");
		String marca = leitura.nextLine();
		if (!marca.isEmpty()) {
			remedio.setMarca(marca);
		}

		System.out.println("Validade do produto:");
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
			remedio.setValidade(data);
		}

		System.out.println("Tipo de Remédio:");
		String Tipo = leitura.nextLine();
		if (!Tipo.isEmpty()) {
			remedio.setMarca(Tipo);
		}

		System.out.println("Horário para tomá-lo:");
		System.out.println("Informe a hora:");
		String horaRemedio = leitura.nextLine();
		System.out.println("Informe o minuto:");
		String minutoRemedio = leitura.nextLine();
		if (!horaRemedio.isEmpty() && !minutoRemedio.isEmpty()) {
			int hora = Integer.parseInt(horaRemedio);
			int minuto = Integer.parseInt(minutoRemedio);
			LocalDate horario = LocalDate.ofYearDay(hora, minuto);
			remedio.setHorarios(horario);
		}

		System.out.println("Quantidade diaria:");
		String quantidade = leitura.nextLine();
		if (!quantidade.isEmpty()) {
			int quant = Integer.parseInt(quantidade);
			remedio.setQuantidadeDiaria(quant);
		}

		System.out.println("Quantidade total do medicamento que você possui:");
		String estoque = leitura.nextLine();
		if (!estoque.isEmpty()) {
			int armazenamento = Integer.parseInt(estoque);
			remedio.setArmazenamentoTotal(armazenamento);
		}
		bancoRemedio.cadastrarRemedio(remedio);

	}

	public static void cadastroDetalhesConsulta() {
		DetalheConsulta consulta = new DetalheConsulta();

		Scanner leitura = new Scanner(System.in);
		DetalheConsultaDAO bancoDetalheConsultas = DetalheConsultaDAO.getInstancia();

		System.out.println("Insira o tipo da consulta: ");
		String tipoConsulta = leitura.nextLine();
		if (!tipoConsulta.isEmpty()) {
			consulta.setTipoConsulta(tipoConsulta);
		}

		System.out.println("Insira o motivo da consulta: ");
		String motivoConsulta = leitura.nextLine();
		if (!motivoConsulta.isEmpty()) {
			consulta.setMotivoConsulta(motivoConsulta);
		}

		System.out.println("Insira o local da consulta: ");
		String localConsulta = leitura.nextLine();
		if (!localConsulta.isEmpty()) {
			consulta.setLocalConsulta(localConsulta);
		}

		System.out.println("Insira o feedback da consulta: ");
		String feedbackConsulta = leitura.nextLine();
		if (!feedbackConsulta.isEmpty()) {
			consulta.setFeedbackConsulta(feedbackConsulta);
		}

		bancoDetalheConsultas.inserir(consulta);

	}

	public static void cadastroConsulta() {
		Scanner leitura = new Scanner(System.in);

		Consulta consulta = new Consulta();
		ConsultaDAO bancoConsultas = ConsultaDAO.getInstancia();

		System.out.println("Dados de sua consulta ");

		System.out.println("Insira o dia da consulta: ");
		String diaCon = leitura.nextLine();

		System.out.println("Insira o mês da sua consulta: ");
		String mesCon = leitura.nextLine();

		System.out.println("Insira o ano da sua consulta");
		String anoCon = leitura.nextLine();

		if (!diaCon.isEmpty() && !mesCon.isEmpty() && !anoCon.isEmpty()) {
			int dia = Integer.parseInt(diaCon);
			int mes = Integer.parseInt(mesCon);
			int ano = Integer.parseInt(anoCon);
			LocalDate data = LocalDate.of(dia, mes, ano);
			consulta.setDataConsulta(data);
		}
		bancoConsultas.inserir(consulta);
	}

	public static void cadastroUsuario() {
		Usuario pessoa = new Usuario();

		Scanner leitura = new Scanner(System.in);
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstancia();

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
		bancoUsuario.inserir(pessoa);
		System.out.println("Bem vindo " + pessoa.getNome() + "é um prazer receber você! ");

	}
}
