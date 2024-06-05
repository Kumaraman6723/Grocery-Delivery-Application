package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Product;
import org.ncu.GROCERY.SERVICE.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/post")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveOrUpdateProduct(product);
    }

    @GetMapping("/get/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PutMapping("/put/{productId}")
    public Product updateProduct(@PathVariable  ("productId") int productId, @RequestBody Product product) {
        return productService.saveOrUpdateProduct(product);
    }

    @DeleteMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable ("productId") int productId) {
        productService.deleteProduct(productId);
        return "Product with ID " + productId + " deleted successfully";
    }
}