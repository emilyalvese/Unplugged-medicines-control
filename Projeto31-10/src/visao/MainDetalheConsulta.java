package visao;

import java.util.Scanner;

import modelo.DetalheConsulta;

public class MainDetalheConsulta {

	public static void main(String[] args) {

		DetalheConsulta consulta = new DetalheConsulta();
		
		Scanner leitura = new Scanner(System.in);
		
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
		
	}

}
