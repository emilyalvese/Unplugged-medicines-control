package visao;

import java.time.LocalDate;
import java.util.Scanner;

import modelo.Consulta;

public class MainConsulta {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		Consulta consulta = new Consulta();

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

	}

}
