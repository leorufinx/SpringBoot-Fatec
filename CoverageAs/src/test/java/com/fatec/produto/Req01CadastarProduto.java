package com.fatec.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.produto.model.Produto;
import com.fatec.produto.model.ProdutoRepository;

@SpringBootTest
class Req01CadastarProduto {

	@Autowired
	ProdutoRepository repository;

	//teste de caixa branca
	@Test
	void ct01_cadastrar_produto_com_sucesso() {
		// dado que não existem registros cadastrados
		repository.deleteAll();
		// quando o usuário cadastra um produto, então
		Produto p1 = new Produto();
		p1.setDescricao("Eletrobomba 110v");
		p1.setCategoria("máquina de lavar");
		p1.setCusto(51.66);
		p1.setQuantidadeNoEstoque(10);
		Produto p = repository.save(p1);
		// o produto fica disponivel para consulta
		assertEquals(1, repository.count());
		assertNotNull(p);
	}

	@Test
	void ct02_cadastrar_produto_com_descrição_invalida() {
		//dado que o usuario deseja cadastrar um produto
		Produto produto = new Produto();
		try {
		//quando a descrição é inválida 
			produto.setDescricao("");
		//então retorna mensagem de erro
		} catch (IllegalArgumentException e) {
			assertEquals("A descrição não pode estar em branco", e.getMessage());
		}
	}
	
}
