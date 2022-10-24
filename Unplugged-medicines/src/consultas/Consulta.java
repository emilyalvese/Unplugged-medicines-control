package consultas;

import java.time.LocalDate;

public class Consulta {

	private LocalDate dataConsulta;
	private LocalDate dataSemana;

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public LocalDate getDataSemana() {
		return dataSemana;
	}

	public void setDataSemana(LocalDate dataSemana) {
		this.dataSemana = dataSemana;
	}

}
