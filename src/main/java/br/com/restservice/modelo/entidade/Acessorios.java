package br.com.restservice.modelo.entidade;

import java.io.Serializable;
import java.math.BigDecimal;

public class Acessorios implements Serializable {

	private static final long serialVersionUID = 1l;

	private Integer idAcessorio;
	private String nome;
	private BigDecimal valorAcessorio;

	public Integer getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(Integer idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorAcessorio() {
		return valorAcessorio;
	}

	public void setValorAcessorio(BigDecimal valorAcessorio) {
		this.valorAcessorio = valorAcessorio;
	}

	@Override
	public String toString() {
		return "Acessorios [idAcessorio=" + idAcessorio + ", nome=" + nome + ", valorAcessorio=" + valorAcessorio + "]";
	}

}
