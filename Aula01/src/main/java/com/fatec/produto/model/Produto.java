package com.fatec.produto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao;
	private String categoria;
	private double custo;
	private int quantidadeNoEstoque;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null) {
			throw new IllegalArgumentException("A descrição nao deve estar em branco");
		} else {
			if (descricao.isBlank()) {
				throw new IllegalArgumentException("A descrição não pode estar em branco");
			} else {
				this.descricao = descricao;
			}
		}

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		try {
			if (custo <= 0) {
				throw new IllegalArgumentException("O custo não pode ser menor ou igual a 0");
			} else {
				this.custo = custo;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("O custo não pode ser menor ou igual a 0");
		}
		
	}

	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}

	public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}

}
