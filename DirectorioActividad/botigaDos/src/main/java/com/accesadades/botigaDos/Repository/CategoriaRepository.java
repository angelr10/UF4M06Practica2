package com.accesadades.botigaDos.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import java.util.Set;
import com.accesadades.botigaDos.Model.Categoria;

@Repository//Cada uno de estos repositorios de Categoria/Product/Subcategoria nos dara acceso a herramientas CRUD que podremos utilizar
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

    @Override
    @NonNull
    Set<Categoria> findAll(); //Retorna todos
    Categoria findByName(String name); //retorna el del nombre
    
}