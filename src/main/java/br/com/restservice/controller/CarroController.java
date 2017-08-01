package br.com.restservice.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.restservice.modelo.entidade.Carro;
import br.com.restservice.modelo.service.CarroService;

@Path("carro")
public class CarroController {

	private CarroService carroService = new CarroService();

	@POST
	@Path("salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(Carro carro) {
		carroService.salvarCarro(carro);
		return Response.ok().build();
	}
	
	@GET
	@Path("listar")
	@Produces(value=MediaType.APPLICATION_JSON)
	public List<Carro> listar(){
		return carroService.listarCarros();
	}
	
	@PUT
	@Path("atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Carro carro){
		carroService.atualizarCarro(carro);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("deletar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletar(@PathParam("id") Long id){
		carroService.deletarCarro(id);
		return Response.ok().build();
	}
	
	@GET
	@Path("buscarPorId/{id}")
	@Produces(value=MediaType.APPLICATION_JSON)
	public Carro buscarPorId(@PathParam("id") Long id){
		return carroService.buscarCarroPorId(id);
	}

}
