package com.controle.model;

public enum Status {
	ORCAMENTO("Orçamento"),
	PROJETO_INICIADO("Projeto iniciado"),
	PROJETO_ANDAMENTO("Projeto em andamento"),
	PROJETO_FINALIZADO("Projeto finalizado");
	
	private String descricao;

	private Status(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
