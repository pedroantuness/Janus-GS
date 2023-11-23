package br.com.fiap.janusGs.model;
import java.sql.Date;

public class Paciente {
	private int idCliente;
	private String nmCliente;
	private Date dtNascimento;
	private String cpf;
	private String dsEmail;
	private int dsPeso;
	private int dsAltura;

	public Paciente(int cdCliente, String nmCliente, Date dtNascimento, String cpf, String dsEmail, int dsPeso, int dsAltura) {
		super();
		this.idCliente = cdCliente;
		this.nmCliente = nmCliente;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.dsEmail = dsEmail;
		this.dsPeso = dsPeso;
		this.dsAltura = dsAltura;
	}
	
	public Paciente(String nmCliente, Date dtNascimento, String cpf, String dsEmail, int dsPeso, int dsAltura) {
		super();
		this.nmCliente = nmCliente;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.dsEmail = dsEmail;
		this.dsPeso = dsPeso;
		this.dsAltura = dsAltura;
	}

	public int getDsPeso() {
		return dsPeso;
	}

	public void setDsPeso(int dsPeso) {
		this.dsPeso = dsPeso;
	}

	public int getDsAltura() {
		return dsAltura;
	}

	public void setDsAltura(int dsAltura) {
		this.dsAltura = dsAltura;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int cdCliente) {
		this.idCliente = cdCliente;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	
	public Paciente(String dsEmail) {
		super();
		this.dsEmail = dsEmail;
	}
	
	public Paciente() {
		super();
	}
	
}
