package com.accesadades.botigaDos.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Subcategoria;

public interface SubcategoryService {
 
    Set<Subcategoria> findAllSubcategorias();
    Subcategoria findSubcategoriasByName(String name);
    Set<Subcategoria> findAllSubcategorias(String subcategory);
    void insertarSubcategoria(Subcategoria subcategoria);
    void eliminarSubcategoria(Subcategoria subcategoria);
}