package com.fatec.produto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.produto.model.Produto;
import com.fatec.produto.model.ProdutoRepository;

@SpringBootTest
public class Req02ConsultarProdutotest {

	@Autowired
	private ProdutoRepository repository;

	@BeforeEach
	void setup() {
		// Dado que não existem produtos cadastrados
		repository.deleteAll();
	}

	@Test
	void ct01_consultar_produto_com_sucesso() {
		// Quando o usuário cadastrar um produto
		Produto p1 = new Produto();
		p1.setDescricao("Eletrobomba 100v");
		p1.setCategoria("máquina de lavar");
		p1.setCusto(51.66);
		p1.setQuantidadeNoEstoque(10);
		repository.save(p1);
		
		//dado que o produto está cadastrado quando consulto o produto pelo id
		
		Produto p = repository.findById(1L).get();
		
		//então os etalhes do produto são apresentados
		assertNotNull(p);
	}
}
