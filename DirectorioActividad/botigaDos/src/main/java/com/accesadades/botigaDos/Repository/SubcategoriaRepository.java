package com.accesadades.botigaDos.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import java.util.Set;
import com.accesadades.botigaDos.Model.Subcategoria;

@Repository
public interface SubcategoriaRepository extends CrudRepository<Subcategoria, Long> {

    @Override
    @NonNull
    Set<Subcategoria> findAll(); //Retorna todos
    Subcategoria findByName(String name); //retorna el del nombre
    
}