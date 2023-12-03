package com.fatec.pedido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidosApplicationTests {
	@Test
	void contextLoads() {
	}

 

	@Test
	void Req01_Cadastro_válido() { 
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Cadastro realizado");
		}
	}

	@Test
	void Req02_Status_inválido() { 
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Status inválido");
		}
	}

	@Test
	void Req03_Data_inválida() { 
		try {
			Pedido Pedido = new Pedido();
		LocalDate data = Pedido.getData();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			if ( data !=LocalDate.now()) {
				throw new IllegalArgumentException("Data inválido");
			}
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Data inválido");
		}
	}

	@Test
	void Req04_CNPJ_inválida() { 
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "CNPJ inválido");
		}
	}

	@Test
	void Req05_CEP_inválido() { 
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("12345");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "CEP inválido");
		}
	}

	@Test
	void Req06_Complemento_inválido() {
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Complemento inválido");
		}
	}

	@Test
	void Req07_Descrição_inválida() {
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Descrição inválida");
		}
	}

	@Test
	void Req08_Valor_inválido() {
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(0);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Valor inválido");
		}
	}

	@Test
	void Req09_Previsão_inválido() {
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("");
			Pedido.setEnderecoEntrega("Rua águia de háia");
		} catch (Exception e) {
			assertEquals(e, "Previsão inválida");
		}
	}

	@Test
	void Req10_Logradouro_inválido() {
		try {
			Pedido Pedido = new Pedido();
			Pedido.setId(1);
			Pedido.setStatus("aprovado");
			Pedido.setcpnjFornecedor(69915817000196L);
			Pedido.setCep("03810110");
			Pedido.setComplemento("complemento");
			Pedido.setDescricao("descrição");
			Pedido.setValor(10);
			Pedido.setPrevisaoEntrega("dez dias");
			Pedido.setEnderecoEntrega("");
		} catch (Exception e) {
			assertEquals(e, "Logradouro inválido");
		}
	}
}