package com.accesadades.botigaDos.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Categoria;

public interface CategoryService {
 
    Set<Categoria> findAllCategorias();
    Categoria findCategoriasByName(String name);
    Set<Categoria> findAllCategorias(String subcategory);
    void insertarCategoria(Categoria product);
    void eliminarCategoria(Categoria product);
}