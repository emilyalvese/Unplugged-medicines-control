package modelo;

import java.time.LocalDate;

public class Consulta {
	private String cidConsulta ;
	private LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCidConsulta() {
		return cidConsulta;
	}

	public void setCidConsulta(String cidConsulta) {
		this.cidConsulta = cidConsulta;
	}

	


}
