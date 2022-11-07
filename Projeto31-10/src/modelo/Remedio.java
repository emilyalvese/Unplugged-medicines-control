package modelo;

import java.time.LocalDate;

public class Remedio {
	private String nome;
	private String marca;
	private LocalDate validade;
	private String TipoRemedio;
	private LocalDate horarios;
	private Integer quantidadeDiaria;
	private Integer armazenamentoTotal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public String getTipoRemedio() {
		return TipoRemedio;
	}
	public void setTipoRemedio(String tipoRemedio) {
		TipoRemedio = tipoRemedio;
	}
	public LocalDate getHorarios() {
		return horarios;
	}
	public void setHorarios(LocalDate horarios) {
		this.horarios = horarios;
	}
	public Integer getQuantidadeDiaria() {
		return quantidadeDiaria;
	}
	public void setQuantidadeDiaria(Integer quantidadeDiaria) {
		this.quantidadeDiaria = quantidadeDiaria;
	}
	public Integer getArmazenamentoTotal() {
		return armazenamentoTotal;
	}
	public void setArmazenamentoTotal(Integer armazenamentoTotal) {
		this.armazenamentoTotal = armazenamentoTotal;
	}

}
