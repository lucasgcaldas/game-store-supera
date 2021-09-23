package br.com.supera.gamestore.repositories;

import br.com.supera.gamestore.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
