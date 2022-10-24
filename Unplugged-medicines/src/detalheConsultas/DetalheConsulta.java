package detalheConsultas;

import consultas.Consulta;

public class DetalheConsulta extends Consulta {

	private String tipoConsulta;
	private String motivoConsulta;
	private String localConsulta;
	private String feedbackConsulta;

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public String getLocalConsulta() {
		return localConsulta;
	}

	public void setLocalConsulta(String localConsulta) {
		this.localConsulta = localConsulta;
	}

	public String getFeedbackConsulta() {
		return feedbackConsulta;
	}

	public void setFeedbackConsulta(String feedbackConsulta) {
		this.feedbackConsulta = feedbackConsulta;
	}

}
