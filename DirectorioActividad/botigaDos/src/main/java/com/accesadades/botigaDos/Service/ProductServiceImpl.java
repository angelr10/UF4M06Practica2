package com.accesadades.botigaDos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Product;
import com.accesadades.botigaDos.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired //Injeccion de servicios en estado puro,
    private ProductRepository productRepository;

    //Gracias al Autowired podremos crear los modulos 
    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findAllProducts(String subcategory) {
        return null;
    }

    @Override
    public Product findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void increasePrice(Product product) {
        
    }


    //Para guardar
    @Override
    public void insertarProducto(Product product){ 
        productRepository.save(product);
    }

    //Para Eliminar 
    @Override
    public void eliminarProducto(Product product){
        productRepository.delete(product);
    }
}