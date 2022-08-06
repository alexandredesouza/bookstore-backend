package br.com.book.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.book.store.entity.Product;
import br.com.book.store.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	public List<Product> buscarTodos() {
		return service.buscarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> buscarPorId(@PathVariable("id") Long id) {
		return new ResponseEntity<Product>(service.buscarPorId(id), new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Product> criar(@RequestBody Product product) {
		return new ResponseEntity<Product>(service.inserir(product), new HttpHeaders(), HttpStatus.CREATED);
	}

	@PatchMapping
	public ResponseEntity<Product> editar(@RequestBody Product product) {
		return new ResponseEntity<Product>(service.atualizar(product), new HttpHeaders(), HttpStatus.OK);
	}

}
