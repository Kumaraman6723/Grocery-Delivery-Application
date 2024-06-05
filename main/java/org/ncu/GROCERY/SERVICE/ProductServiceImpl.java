package org.ncu.GROCERY.SERVICE;

import java.util.List;
import org.ncu.GROCERY.DAO.ProductDAO;
import org.ncu.GROCERY.ENTITY.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    @Transactional
    public Product getProductById(int productId) {
        return productDAO.getProductById(productId);
    }

    @Override
    @Transactional
    public Product saveOrUpdateProduct(Product product) {
        return productDAO.saveOrUpdateProduct(product);
    }

    @Override
    @Transactional
    public void deleteProduct(int productId) {
        productDAO.deleteProduct(productId);
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
}
