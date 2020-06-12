package com.controle.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println(cliente);
		return this.clienteService.save(cliente);
	}
	
	@PutMapping("")
	public Cliente update(@RequestBody Cliente cliente) throws Exception {
		return this.clienteService.update(cliente);
	}
	
	@GetMapping("")
	public List<Cliente> findAll(){
		return this.clienteService.findAll();
	}
	
	@GetMapping("/{id}")
	public Cliente findById(@PathVariable("id") long id) {
		return this.clienteService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		this.clienteService.deleteById(id);
	}
	
}
