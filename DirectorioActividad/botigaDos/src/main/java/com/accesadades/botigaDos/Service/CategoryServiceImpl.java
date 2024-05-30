package com.accesadades.botigaDos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import com.accesadades.botigaDos.Model.Categoria;
import com.accesadades.botigaDos.Repository.CategoriaRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired //Injeccion de servicios en estado puro,
    private CategoriaRepository CategoriaRepository;

    //Gracias al Autowired podremos crear los modulos 
    @Override
    public Set<Categoria> findAllCategorias() {
        return CategoriaRepository.findAll();
    }

    @Override
    public Set<Categoria> findAllCategorias(String subcategory) {
        return null;
    }

    @Override
    public Categoria findCategoriasByName(String name) {
        return CategoriaRepository.findByName(name);
    }


    //Para guardar
    @Override
    public void insertarCategoria(Categoria Categoria){ 
        CategoriaRepository.save(Categoria);
    }

    //Para Eliminar 
    @Override
    public void eliminarCategoria(Categoria Categoria){
        CategoriaRepository.delete(Categoria);
    }
}