package br.com.restservice.modelo.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Carro implements Serializable {

	private static final long serialVersionUID = 1l;

	private Long id;
	private String placa;
	private String chassis;
	private String cor;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private List<Acessorios> acessorios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Acessorios> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorios> acessorios) {
		this.acessorios = acessorios;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", placa=" + placa + ", chassis=" + chassis + ", cor=" + cor + ", marca=" + marca
				+ ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", valor="
				+ valor + ", acessorios=" + acessorios + "]";
	}

}
