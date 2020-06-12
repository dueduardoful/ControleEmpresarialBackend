package com.controle.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private String bairro;
	private String numeroCasa;
	private String complemento;
	private double valorTotal;
	private String descricao;
	private String img;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		name="projeto_fornecedor",
		joinColumns = @JoinColumn(name="projeto_id"),
		inverseJoinColumns = @JoinColumn(name="fornecedor_id"))
	private Set<Fornecedor> fornecedores;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	public Projeto(Long id, String nomeProjeto, Date dt_inicio, Date dt_fim, int cep, String rua, String cidade,
			String bairro, String numeroCasa, String descricao, String img, Set<Fornecedor> fornecedores,
			Cliente cliente) {
		this.id = id;
		this.nomeProjeto = nomeProjeto;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.cep = cep;
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.descricao = descricao;
		this.img = img;
		this.fornecedores = fornecedores;
		this.cliente = cliente;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Set<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nomeProjeto=" + nomeProjeto + ", dt_inicio=" + dt_inicio + ", dt_fim=" + dt_fim
				+ ", cep=" + cep + ", rua=" + rua + ", cidade=" + cidade + ", bairro=" + bairro + ", numeroCasa="
				+ numeroCasa + ", descricao=" + descricao + ", img=" + img + ", fornecedores=" + fornecedores
				+ ", cliente=" + cliente + "]";
	}
}
