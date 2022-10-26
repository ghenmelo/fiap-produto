package br.com.fiap.produto.Produto.repository;

import br.com.fiap.produto.Produto.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, Long> {
}
