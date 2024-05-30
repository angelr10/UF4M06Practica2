package com.accesadades.botigaDos.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import java.util.Set;
import com.accesadades.botigaDos.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    @NonNull
    Set<Product> findAll(); //Retorna todos
    Product findByName(String name); //retorna el del nombre
    Set<Product> findByNameAndPrice(String name, float price); // Retorna cositas
    
}