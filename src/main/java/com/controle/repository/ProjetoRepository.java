package com.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
