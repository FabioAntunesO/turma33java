package com.lojadegames.fabio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria") // define o nome da tabela no banco de dados mysql
public class Categoria {
	
	@Id //define como chave primaria no banco de dados mysql
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 100, message = "O atributo nome é obrigatório, deve conter no minimo 05 e no maximo 100 caracteres")
	private String tipoDePlataforma;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoDePlataforma() {
		return tipoDePlataforma;
	}

	public void setTipoDePlataforma(String tipoDePlataforma) {
		this.tipoDePlataforma = tipoDePlataforma;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
