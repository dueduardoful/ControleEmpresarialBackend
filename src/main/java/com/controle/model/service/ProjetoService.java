package com.controle.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.model.Projeto;
import com.controle.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;
	
	public Projeto save(Projeto projeto) {
		return this.projetoRepository.save(projeto);
	}
	
	public Projeto update(Projeto projeto) {
		return this.projetoRepository.save(projeto);
	}
	
	public void deleteById(long id) {
		this.projetoRepository.deleteById(id);
	}
	
	public Projeto findById(long id){
		return this.projetoRepository.findById(id).get();
	}
	
	public List<Projeto> findAll(){
		return this.projetoRepository.findAll();
	}
}
