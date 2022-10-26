package br.com.fiap.produto.Produto.controller;

import br.com.fiap.produto.Produto.model.Produto;
import br.com.fiap.produto.Produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
@ResponseBody
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping()
    public List<Produto> buscarTodosProdutos() {
        return produtoService.buscarTodosProdutos();
    }

    @PostMapping()
    public void buscarTodosProdutos(@RequestBody Produto produto) {
        produtoService.inserirProduto(produto);
    }
}
