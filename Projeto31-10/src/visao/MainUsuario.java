package visao;

import java.time.LocalDate;
import java.util.Scanner;

import modelo.Usuario;

public class MainUsuario {

	public static void main(String[] args) {

		Usuario pessoa = new Usuario();

		Scanner leitura = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		String nome = leitura.nextLine();
		if (!nome.isEmpty()) {
			pessoa.setNome(nome);
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
