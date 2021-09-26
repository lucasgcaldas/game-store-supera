package br.com.supera.gamestore.controller;

import br.com.supera.gamestore.entities.Product;
import br.com.supera.gamestore.entities.User;
import br.com.supera.gamestore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<Page<Product>> findAll(Pageable pageable){
        Page<Product> page = service.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/seed")
    public ResponseEntity populateDataBase(){
        User u1 = new User(null, "Lucas", "lucas@gmail.com");

        Product p1 = new Product(312L, "Super Mario Odyssey", new BigDecimal("197.88"), 100, "super-mario-odyssey.png");
        Product p2 = new Product(201L, "Call Of Duty Infinite Warfare", new BigDecimal("49.99"), 80, "call-of-duty-infinite-warfare.png");
        Product p3 = new Product(102L, "The Witcher III Wild Hunt", new BigDecimal("119.5"), 250, "the-witcher-iii-wild-hunt.png");
        Product p4 = new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), 205, "call-of-duty-wwii.png");
        Product p5 = new Product(12L, "Mortal Kombat XL", new BigDecimal("69.99"), 150, "mortal-kombat-xl.png");
        Product p6 = new Product(74L, "Shards of Darkness", new BigDecimal("71.94"), 400, "shards-of-darkness.png");
        Product p7 = new Product(31L, "Terra Média: Sombras de Mordor", new BigDecimal("79.99"), 50, "terra-media-sombras-de-mordor.png");
        Product p8 = new Product(420L, "FIFA 18", new BigDecimal("195.39"), 325, "fifa-18.png");
        Product p9 = new Product(501L, "Horizon Zero Dawn", new BigDecimal("115.8"), 290, "horizon-zero-dawn.png");

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
        service.save(products);

        return ResponseEntity.ok().build();
    }

}
