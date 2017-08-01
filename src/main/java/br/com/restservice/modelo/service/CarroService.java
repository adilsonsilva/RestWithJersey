package br.com.restservice.modelo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.restservice.modelo.dao.CarroDAO;
import br.com.restservice.modelo.entidade.Carro;

public class CarroService {

	private CarroDAO carroDAO;
	private static AtomicLong contador = new AtomicLong(0);

	public CarroService() {
		this.carroDAO = new CarroDAO();
	}

	public void salvarCarro(Carro carro) {
		if(carro != null && (carro.getId() == null || carro.getId() == 0)){
			long id = contador.incrementAndGet();
			carro.setId(id);
			carroDAO.salvar(carro);
		}else{
			carroDAO.atualizar(carro);
		}
	}

	public void atualizarCarro(Carro carro) {
		carroDAO.atualizar(carro);
	}

	public List<Carro> listarCarros() {
		
		Map<Long, Carro> dados = carroDAO.listar();
	
		List<Carro> carros = new ArrayList<Carro>();
		for (Map.Entry<Long, Carro> entry : dados.entrySet()) {
			carros.add(entry.getValue());
		}

		return carros;
	}
	
	public void deletarCarro(Long id){
		Carro carro = carroDAO.buscarCarroPorId(id);
		if(carro != null){
			carroDAO.deletar(id);
		}
	}

	public Carro buscarCarroPorId(Long id) {
		return carroDAO.buscarCarroPorId(id);
	}

}
