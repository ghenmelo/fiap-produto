package br.com.fiap.produto.Produto.service;

import br.com.fiap.produto.Produto.model.Produto;
import br.com.fiap.produto.Produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public void inserirProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}
