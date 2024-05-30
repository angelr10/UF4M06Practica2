package com.accesadades.botigaDos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Subcategoria;
import com.accesadades.botigaDos.Repository.SubcategoriaRepository;

@Service
public class SubcategoryServiceImpl implements SubcategoryService {

    @Autowired //Injeccion de servicios en estado puro,
    private SubcategoriaRepository subcategoriarepositorio;

    //Gracias al Autowired podremos crear los modulos 
    @Override
    public Set<Subcategoria> findAllSubcategorias() {
        return subcategoriarepositorio.findAll();
    }

    @Override
    public Set<Subcategoria> findAllSubcategorias(String subcategory) {
        return null;
    }

    @Override
    public Subcategoria findSubcategoriasByName(String name) {
        return subcategoriarepositorio.findByName(name);
    }


    //Para guardar
    @Override
    public void insertarSubcategoria(Subcategoria product){ 
        subcategoriarepositorio.save(product);
    }

    //Para Eliminar 
    @Override
    public void eliminarSubcategoria(Subcategoria product){
        subcategoriarepositorio.delete(product);
    }
}