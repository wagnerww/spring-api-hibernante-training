package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.service.ClienteAtivadoeEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoeEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente "+ event.getCliente().getNome());
	}
}
