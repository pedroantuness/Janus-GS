package br.com.fiap.janusGs.model;

import java.sql.Date;


public class Sintomas {
	private int idSintoma;
	private String dsSintoma;
	private Date dtInicio;
	private Date dtFim;

	public Sintomas(int idSintoma, String dsSintoma, Date dtInicio, Date dtFim) {
		super();
		this.idSintoma = idSintoma;
		this.dsSintoma = dsSintoma;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	public int getIdSintoma() {
		return idSintoma;
	}

	public void setIdSintoma(int idSintoma) {
		this.idSintoma = idSintoma;
	}

	public String getDsSintoma() {
		return dsSintoma;
	}

	public void setDsSintoma(String dsSintoma) {
		this.dsSintoma = dsSintoma;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	 
}
