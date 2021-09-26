//package br.com.supera.gamestore.resources;
//
//import br.com.supera.gamestore.entities.ShoppingCart;
//import br.com.supera.gamestore.services.ShoppingCartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/cart")
//public class ShoppingCartResource {
//
//    @Autowired
//    private ShoppingCartService service;
//
//    @GetMapping
//    public ResponseEntity<List<ShoppingCart>> findAll(){
//        List<ShoppingCart> list = service.findAll();
//        return ResponseEntity.ok().body(list);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<ShoppingCart> findById(@PathVariable Long id){
//        ShoppingCart obj = service.findById(id);
//        return ResponseEntity.ok().body(obj);
//    }
//}
