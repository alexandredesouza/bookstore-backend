package br.com.book.store.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import br.com.book.store.entity.Product;
import br.com.book.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> buscarTodos() {
		Iterable<Product> todos = repository.findAll();
		return toList(todos);
	}

	public <E> List<E> toList(Iterable<E> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
	}

	@Transactional
	public Product inserir(Product product) {
		return repository.save(product);
	}

	public Product atualizar(Product product) {
		Optional<Product> prod = repository.findById(product.getId());

		if (prod.isPresent()) {
			Product newEntity = prod.get();
			newEntity.setName(product.getName());
			newEntity.setCategory(product.getCategory());
			newEntity.setPrice(product.getPrice());
			newEntity.setImg(product.getImg());
			newEntity.setQuantity(product.getQuantity());

			
			return newEntity = repository.save(newEntity);
		}
		return product;
	}

	public Product buscarPorId(Long id) {
		Optional<Product> product = repository.findById(id);
		return product.get();
	}

}
