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

import com.controle.model.Fornecedor;
import com.controle.model.service.FornecedorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fornecedor")
public class FornecedorController {
	@Autowired
	private FornecedorService fornecedorService;
	
	@PostMapping("")
	public Fornecedor save(@RequestBody Fornecedor fornecedor) {
		System.out.println(fornecedor);
		return this.fornecedorService.save(fornecedor);
	}
	@PutMapping("")
	public Fornecedor update(@RequestBody Fornecedor fornecedor)  throws Exception {
		return this.fornecedorService.update(fornecedor);
	}

	@GetMapping("")
	public List<Fornecedor> findAll(){
		return this.fornecedorService.findAll();
	}
	
	@GetMapping("/{id}")
	public Fornecedor findById(@PathVariable("id")Long id) {
		return this.fornecedorService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById (@PathVariable("id")Long id) {
		this.fornecedorService.deleteById(id);
	}
}
