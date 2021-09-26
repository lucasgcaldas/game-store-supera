package br.com.supera.gamestore.services;

import br.com.supera.gamestore.entities.Product;
import br.com.supera.gamestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Page<Product> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

	public void save(List<Product> products){
		repository.saveAll(products);
	}
}

