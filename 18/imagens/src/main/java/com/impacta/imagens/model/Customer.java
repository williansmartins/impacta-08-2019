package com.impacta.imagens.model;

public class Customer {
	
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer(int i, String n, String sn, String e) {
		this.setId(i);
		this.setNome(n);
		this.setSobrenome(sn);
		this.setEmail(e);
	}
	
	public Customer() {
		
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + "]";
	}
	
}
