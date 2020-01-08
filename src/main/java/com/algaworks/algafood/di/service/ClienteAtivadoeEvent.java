package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoeEvent {
	private Cliente cliente;

	public ClienteAtivadoeEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
