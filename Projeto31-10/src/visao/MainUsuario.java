package visao;

import java.util.Scanner;

import modelo.Usuario;

public class MainUsuario {

	public static void main(String[] args) {

		Usuario pessoa = new Usuario ();
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = leitura.nextLine();
		if (!nome.isEmpty()) {
			pessoa.setNome(nome);
		}
		System.out.println("Informe seu sexo: ");
		String sexo = String.valueOf(leitura.nextLine());
		
		if (!sexo.isEmpty()) {
			pessoa.setSexo(sexo);
		}
		
		
		
		
		
	}

}
