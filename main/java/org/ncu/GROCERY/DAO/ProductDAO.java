package org.ncu.GROCERY.DAO;

import java.util.List;
import org.ncu.GROCERY.ENTITY.Product;

public interface ProductDAO {
    Product getProductById(int productId);
    Product saveOrUpdateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> getAllProducts();
}
