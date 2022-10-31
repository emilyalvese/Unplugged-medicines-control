package interfaceSistema;

import java.time.LocalDate;

public class Usuario {
	private String nome;
	private char sexo;
	private LocalDate nascimento;
	private String endereço;
	private Integer telefone;
	private char tipoSanguineo;
	private String contatoFamilia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public char getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(char tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getContatoFamilia() {
		return contatoFamilia;
	}
	public void setContatoFamilia(String contatoFamilia) {
		this.contatoFamilia = contatoFamilia;
	}


}
