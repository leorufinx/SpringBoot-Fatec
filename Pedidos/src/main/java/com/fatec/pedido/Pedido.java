package com.fatec.pedido;

import java.time.LocalDate;

public class Pedido {
	
	private int id;
	private String status;
	private LocalDate data = LocalDate.now();
	private Long cnpjFornecedor;
	private String enderecoEntrega;
	private String cep;
	private String complemento;
	private String descricao;
	private double valor;
	private String previsaoEntrega;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == "") {
			throw new IllegalArgumentException("Status inválido");
		}
		this.status = status;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		
		LocalDate.now();
		this.data = data;
	}

	public Long getCpnjFornecedor() {
		return cnpjFornecedor;
	}

	public void setcpnjFornecedor(Long cpnjFornecedor) {
		String cnpj = cpnjFornecedor.toString();
		if (cnpj.length() < 14 || cnpj == "") {
			throw new IllegalArgumentException("CNPJ inválido");
		}
		this.cnpjFornecedor = cpnjFornecedor;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		if (enderecoEntrega == "") {
			throw new IllegalArgumentException("Complemento inválido");
		}
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {	
		int CEP = cep.length();
			if (CEP < 8) {
				throw new IllegalArgumentException("CEP inválido");
			}
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if (complemento == "") {
			throw new IllegalArgumentException("Complemento inválido");
		}
		this.complemento = complemento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == "") {
			throw new IllegalArgumentException("Descrição inválida");
		}
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor == 0) {
			throw new IllegalArgumentException("Descrição inválida");
		}
		this.valor = valor;
	}

	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(String previsaoEntrega) {
		if (previsaoEntrega == "") {
			throw new IllegalArgumentException("Previsão inválida");
		}
		this.previsaoEntrega = previsaoEntrega;
	}
}
