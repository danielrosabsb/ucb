package com.stefanini.model;
// Generated 07/11/2016 12:05:33 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipoinfracao generated by hbm2java
 */
@Entity
@Table(name = "tipoinfracao", catalog = "hackathon")
public class Tipoinfracao implements java.io.Serializable {

	private Integer idTipoInfracao;
	private String descricaoTipoInfracao;
	private Double valor;

	public Tipoinfracao() {
	}

	public Tipoinfracao(String descricaoTipoInfracao, Double valor) {
		this.descricaoTipoInfracao = descricaoTipoInfracao;
		this.valor = valor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoInfracao", unique = true, nullable = false)
	public Integer getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(Integer idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	@Column(name = "descricaoTipoInfracao", length = 50)
	public String getDescricaoTipoInfracao() {
		return this.descricaoTipoInfracao;
	}

	public void setDescricaoTipoInfracao(String descricaoTipoInfracao) {
		this.descricaoTipoInfracao = descricaoTipoInfracao;
	}

	@Column(name = "valor", precision = 22, scale = 0)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
