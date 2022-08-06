package br.com.book.store.service;

import br.com.book.store.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> buscarTodos();

    public Product inserir(Product product);

    public Product atualizar(Product product);

    public Product buscarPorId(Long id);
}
