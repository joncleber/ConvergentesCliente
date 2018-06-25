package com.edu.up.Cliente.clienterest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;	
	
	private String Nome;
	
	private String Sobrenome;
	
	private String Senha;	
	
	private String CPF;
	
	private String DataCadastro;
	
	private String Email;	
		

	public Cliente() {
		super();
		
	}

	public Cliente(long id, String nome, String sobrenome, String dataNascimento,  String cPF,
			  String email, String senha, String dataCadastro) {
		super();
		this.Id = id;
		this.Nome = nome;
		this.Sobrenome = sobrenome;		
		this.CPF = cPF;		
		this.Email = email;
		this.Senha = senha;
		this.DataCadastro = dataCadastro;
		
	}

	

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}	

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		DataCadastro = dataCadastro;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
