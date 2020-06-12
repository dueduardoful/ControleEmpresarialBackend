package com.controle.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.controle.model.Fornecedor;
import com.controle.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	private FornecedorRepository fornecedorRepository;
	
	public Fornecedor save(Fornecedor fornecedor) {
		return this.fornecedorRepository.save(fornecedor);
	}
	public Fornecedor update(Fornecedor fornecedor) throws Exception {
		if(fornecedor.getId() == 0 || fornecedor.getId() == null) {
			throw new Exception("Para editar um fornecedor ele deve ter um id valido");
		}
		return this.fornecedorRepository.save(fornecedor);
	}
	
	public void deleteById(long id) {
		this.fornecedorRepository.deleteById(id);
	}
	
	public Fornecedor findById(long id) {
		return this.fornecedorRepository.findById(id).get();
	}
	
	public List<Fornecedor> findAll(){
		return this.fornecedorRepository.findAll();
	}
	
}
