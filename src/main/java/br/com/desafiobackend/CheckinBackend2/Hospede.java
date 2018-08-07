package br.com.desafiobackend.CheckinBackend2;

import javax.*;
import java.util.Calendar;

@Entity
@Table(name = "EMPLOYEE")
public class Hospede {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "dataEntrada")
	private Calendar dataEntrada;
	
	@Column(name = "dataSaida")
	private Calendar dataSaida;
	
	@Column(name = "idicionalVeiculo")
	private Boolean adicionalVeiculo;

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public Boolean getAdicionalVeiculo() {
		return adicionalVeiculo;
	}

	public void setNome() {
		this.nome = nome;
	}

	public void setCpf() {
		this.cpf = cpf;
	}

	public void setTelefone() {
		this.telefone = telefone;
	}

	public void setDataEntrada() {
		this.dataEntrada = dataEntrada;
	}

	public void setDataSaida() {
		this.dataSaida = dataSaida;
	}

	public void setAdicionalVeiculo() {
		this.adicionalVeiculo = adicionalVeiculo;
	}
}
