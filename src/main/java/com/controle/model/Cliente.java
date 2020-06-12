package com.controle.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Entity
public class Cliente {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private int cep;
	
	private String rua;
	private String estado;
	
	private String cidade;
	
	private String bairro;
	
	private String numeroCasa;

	private String complemento;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate dt_nasc;
	
	private String email;
	
	private String celular;
	
	private String telefoneFixo;
	
	private String img;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Projeto> projetos;
	
	@ManyToMany
	@JoinTable(
		name="cliente_fornecedor",
		joinColumns = @JoinColumn(name="cliente_id"),
		inverseJoinColumns = @JoinColumn(name="fornecedor_id"))
	private List<Fornecedor> fornecedores;

	public Cliente() {
	}
	
	public Cliente(Long id, String nome, String cpf, int cep, String rua, String estado, String cidade, String bairro,
			String numeroCasa, String complemento, LocalDate dt_nasc, String email, String celular, String telefoneFixo,
			String img, List<Projeto> projetos, List<Fornecedor> fornecedores) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
		this.rua = rua;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.complemento = complemento;
		this.dt_nasc = dt_nasc;
		this.email = email;
		this.celular = celular;
		this.telefoneFixo = telefoneFixo;
		this.img = img;
		this.projetos = projetos;
		this.fornecedores = fornecedores;
	}

	public Cliente(Long id, String nome, String cpf, int cep, String rua, String cidade, String bairro,
			String numeroCasa, LocalDate dt_nasc, String email, String img, List<Projeto> projetos) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.dt_nasc = dt_nasc;
		this.email = email;
		this.img = img;
		this.projetos = projetos;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public LocalDate getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(LocalDate dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", rua=" + rua + ", estado="
				+ estado + ", cidade=" + cidade + ", bairro=" + bairro + ", numeroCasa=" + numeroCasa + ", complemento="
				+ complemento + ", dt_nasc=" + dt_nasc + ", email=" + email + ", celular=" + celular + ", telefoneFixo="
				+ telefoneFixo + ", img=" + img + ", projetos=" + projetos + ", fornecedores=" + fornecedores + "]";
	}

	
}
