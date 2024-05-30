package com.accesadades.botigaDos.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Product;

public interface ProductService {
 
    Set<Product> findAllProducts();
    Product findProductsByName(String name);
    Set<Product> findAllProducts(String subcategory);
    void increasePrice(Product product);
    void insertarProducto(Product product);
    void eliminarProducto(Product product);
}