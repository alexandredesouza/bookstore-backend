package br.com.book.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.book.store.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}