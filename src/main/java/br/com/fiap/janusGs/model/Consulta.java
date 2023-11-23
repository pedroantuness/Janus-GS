package br.com.fiap.janusGs.model;

import java.sql.Date;

public class Consulta {
	
	private int idConsulta;
	private Date dtConsulta;

	public Consulta(int idConsulta, Date dtConsulta) {
		super();
		this.idConsulta = idConsulta;
		this.dtConsulta = dtConsulta;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getDtConsulta() {
		return dtConsulta;
	}
	
	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

}
