package com.stefanini.model;
// Generated 07/11/2016 12:05:33 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Veiculos generated by hbm2java
 */
@Entity
@Table(name = "veiculos", catalog = "hackathon")
public class Veiculos implements java.io.Serializable {

	private String placa;
	private int cpfProprietario;
	private int idModelo;
	private String uf;

	public Veiculos() {
	}

	public Veiculos(String placa, int cpfProprietario, int idModelo, String uf) {
		this.placa = placa;
		this.cpfProprietario = cpfProprietario;
		this.idModelo = idModelo;
		this.uf = uf;
	}

	@Id

	@Column(name = "placa", unique = true, nullable = false, length = 7)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Column(name = "cpfProprietario", nullable = false)
	public int getCpfProprietario() {
		return this.cpfProprietario;
	}

	public void setCpfProprietario(int cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	@Column(name = "idModelo", nullable = false)
	public int getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name = "uf", nullable = false, length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
