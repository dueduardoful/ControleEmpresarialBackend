package com.controle.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Fornecedor {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String cpf;
	
	private String nomeEmpresa;
	
	private String atendente;
	
	private String cel;
	
	private String tel;
	
	private String email;
	
	private String site;
	
	private String ramoDeAtuacao;
	
	private String rua;
	
	private String estado;
	
	private String cidade;
	
	private String bairro;
	
	private String numeroCasa;
	
	private String obs;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="projeto_fornecedor",
			joinColumns=@JoinColumn(name="fornecedor_id"),
			inverseJoinColumns = @JoinColumn(name="projeto_id")
			)
	private Set<Projeto> projetos;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="cliente_fornecedor",
		joinColumns = @JoinColumn(name="fornecedor_id"),
		inverseJoinColumns = @JoinColumn(name="cliente_id"))
	private Set<Cliente> clientes;
	
	public Fornecedor() {}
	
	public Fornecedor(Long id, String cpf, String nomeEmpresa, String atendente, String cel, String tel, String email,
			String site, String ramoDeAtuacao, String rua, String cidade, String bairro, String numeroCasa,
			Set<Projeto> projetos) {
		this.id = id;
		this.cpf = cpf;
		this.nomeEmpresa = nomeEmpresa;
		this.atendente = atendente;
		this.cel = cel;
		this.tel = tel;
		this.email = email;
		this.site = site;
		this.ramoDeAtuacao = ramoDeAtuacao;
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.projetos = projetos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getAtendente() {
		return atendente;
	}


	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}


	public String getCel() {
		return cel;
	}


	public void setCel(String cel) {
		this.cel = cel;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSite() {
		return site;
	}


	public void setSite(String site) {
		this.site = site;
	}


	public String getRamoDeAtuacao() {
		return ramoDeAtuacao;
	}


	public void setRamoDeAtuacao(String ramoDeAtuacao) {
		this.ramoDeAtuacao = ramoDeAtuacao;
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


	public Set<Projeto> getProjetos() {
		return projetos;
	}


	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}


	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", cpf=" + cpf + ", nomeEmpresa=" + nomeEmpresa + ", atendente=" + atendente
				+ ", cel=" + cel + ", tel=" + tel + ", email=" + email + ", site=" + site + ", ramoDeAtuacao="
				+ ramoDeAtuacao + ", rua=" + rua + ", cidade=" + cidade + ", bairro=" + bairro + ", numeroCasa="
				+ numeroCasa + ", projetos=" + projetos + "]";
	}
	
	
	
	
	
}
