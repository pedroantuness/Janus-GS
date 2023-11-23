package br.com.fiap.janusGs.model;

import java.sql.Date;

public class Remedio {
	private int idRemedio;
	private String nmRemedio;
	private Date dtInicio;
	private Date dtFim;
	private int intervalo;


	public Remedio(int idRemedio, String nmRemedio, Date dtInicio, Date dtFim, int intervalo) {
		super();
		this.idRemedio = idRemedio;
		this.nmRemedio = nmRemedio;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.intervalo = intervalo;
	}
	

	
	public int getIdRemedio() {
		return idRemedio;
	}

	public void setIdRemedio(int idRemedio) {
		this.idRemedio = idRemedio;
	}

	public String getNmRemedio() {
		return nmRemedio;
	}

	public void setNmRemedio(String nmRemedio) {
		this.nmRemedio = nmRemedio;
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

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}


}
