package com.controle.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Projeto {
	
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, length = 20)
	private Long id;
	
	private String nomeProjeto;
	
	@CreationTimestamp
	private Date dt_inicio;
	
	@UpdateTimestamp
	private Date dt_fim;
	
	private int cep;
	private String rua;
	private String cidade;
	private String baiiro;
	private String numeroCasa;
	private String descricao;
	private String img;
	
	@ManyToOne(cascade ={CascadeType.PERSIST,
			   			 CascadeType.MERGE,
			   			 CascadeType.DETACH,
			   			 CascadeType.REFRESH})
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	public Projeto(String nomeProjeto, Date dt_inicio, Date dt_fim, int cep, String rua, String cidade, String baiiro,
			String numeroCasa, String descricao, String img, Cliente cliente) {
		this.nomeProjeto = nomeProjeto;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.cep = cep;
		this.rua = rua;
		this.cidade = cidade;
		this.baiiro = baiiro;
		this.numeroCasa = numeroCasa;
		this.descricao = descricao;
		this.img = img;
		this.cliente = cliente;
	}

	public Projeto() {
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Date getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Date getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(Date dt_fim) {
		this.dt_fim = dt_fim;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBaiiro() {
		return baiiro;
	}

	public void setBaiiro(String baiiro) {
		this.baiiro = baiiro;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Projeto [nomeProjeto=" + nomeProjeto + ", dt_inicio=" + dt_inicio + ", dt_fim=" + dt_fim + ", cep="
				+ cep + ", rua=" + rua + ", cidade=" + cidade + ", baiiro=" + baiiro + ", numeroCasa=" + numeroCasa
				+ ", descricao=" + descricao + ", img=" + img + ", cliente=" + cliente + "]";
	}



	
	
	
	

}
