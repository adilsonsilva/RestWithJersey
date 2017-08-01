package br.com.restservice.modelo.conexao;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	private static final String URL = "http://localhost:8080/";

	public static HttpServer inicializarServidor() {
		ResourceConfig config = new ResourceConfig().packages("br.com.restservice.modelo");
		URI uri = URI.create(URL);
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		return server;
	}

	public static void main(String args[]) throws IOException {

		HttpServer server = inicializarServidor();
		
		server.stop();
	}

}
