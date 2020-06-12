package com.controle.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.model.Cliente;
import com.controle.model.service.ClienteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("")
	public Cliente save(@RequestBody Cliente cliente) {
		return this.clienteService.save(cliente);
	}
	
	@PutMapping("")
	public Cliente update(@RequestBody Cliente cliente) throws Exception {
		return this.clienteService.update(cliente);
	}
	
	@GetMapping("")
	public List<Client> findAll()
	
	
}
