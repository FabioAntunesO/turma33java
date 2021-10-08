package com.gen.farmaciafabio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios" )
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String nome;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String email;
	
	@NotNull
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	/*public void setSenha(String senha) {
		this.senha = senha;
	}
	*/

}
