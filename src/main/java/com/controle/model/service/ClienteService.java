package com.controle.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.controle.model.Cliente;
import com.controle.repository.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository clienteRepository;

	public Cliente save(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	public Cliente update(Cliente cliente) throws Exception {
		if(cliente.getId() == 0 && cliente.getId() == null) {
			throw new Exception("Para editar um cliente ele deve ter um id valido");
		}
		return this.clienteRepository.save(cliente);
	}
	
	public void deleteById(long id) {
		this.clienteRepository.deleteById(id);
	}
	
	public Cliente findById(long id) {
		return this.clienteRepository.findById(id).get();
	}
	
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
}
