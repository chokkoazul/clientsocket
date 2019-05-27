package com.chokkoazul.clientsocket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientsocketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClientsocketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.inicio();
	}
}
