package visao;

import java.time.LocalDate;
import java.util.Scanner;

import modelo.Remedio;

public class MainRemedio {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
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

	}

}
