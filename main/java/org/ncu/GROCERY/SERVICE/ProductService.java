package org.ncu.GROCERY.SERVICE;

import java.util.List;
import org.ncu.GROCERY.ENTITY.Product;

public interface ProductService {
    Product getProductById(int productId);
    Product saveOrUpdateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> getAllProducts();
}
