package ma.enset.studentsapp.web;

import ma.enset.studentsapp.entities.Product;
import ma.enset.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> products(Long id){
        return productRepository.findAll();
    }

    @GetMapping("/products{id}")
    public Product findproduct(@PathVariable Long id){
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }

}
