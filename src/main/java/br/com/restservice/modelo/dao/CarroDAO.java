package br.com.restservice.modelo.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import br.com.restservice.modelo.entidade.Carro;

public class CarroDAO {

	private static Map<Long, Carro> baseCarro = new HashMap<Long, Carro>();
	
	public CarroDAO(){
		Carro carro = montarCarro();
		
		salvar(carro);
	}

	public void salvar(Carro carro) {
		baseCarro.put(carro.getId(), carro);
	}

	public void deletar(Long id) {
		baseCarro.remove(id);
	}

	public Map<Long, Carro> listar() {
		return baseCarro;
	}

	public Carro buscarCarroPorId(Long id) {
		return baseCarro.get(id);
	}

	public void atualizar(Carro carro) {
		baseCarro.put(carro.getId(), carro);
	}

	private Carro montarCarro() {

		Carro carro = new Carro();
		carro.setId(1l);
		carro.setAnoFabricacao(2016);
		carro.setAnoModelo(2017);
		carro.setChassis("52dgvtretgdfgv5f4gf");
		carro.setCor("Branco");
		carro.setMarca("Volks");
		carro.setModelo("Gol");
		carro.setPlaca("GJH5632");
		carro.setValor(new BigDecimal(2000.99));

		return carro;

	}

}
