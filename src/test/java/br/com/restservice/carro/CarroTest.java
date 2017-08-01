package br.com.restservice.carro;

import java.math.BigDecimal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.restservice.modelo.conexao.Servidor;
import br.com.restservice.modelo.entidade.Carro;
import junit.framework.Assert;

public class CarroTest {

	private HttpServer server;
	private Client client = ClientBuilder.newClient();
	private WebTarget target = client.target("http://localhost:8080/");

	@Before
	public void inciar() {
		server = Servidor.inicializarServidor();
	}

	@After
	public void terminar() {
		server.stop();
	}

	@Test
	public void salvarCarroTest() {

		Carro carro = montarCarro();
		
		Entity<Carro> entity = Entity.entity(carro, MediaType.APPLICATION_JSON);
		
		Response res = target.path("carro").request().post(entity);
		
		Assert.assertEquals(200, res.getStatus());

	}
	
	private Carro montarCarro(){
		
		Carro carro = new Carro();
		
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
