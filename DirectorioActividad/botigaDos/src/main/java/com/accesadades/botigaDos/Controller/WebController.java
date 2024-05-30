package com.accesadades.botigaDos.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.accesadades.botigaDos.Model.Product;
import com.accesadades.botigaDos.Service.ProductService;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.time.LocalDateTime;
import java.util.Set;

//Este documento contendra la direccion web que permitira
//Interactuar con los elementos creados en Model haciendo
//uso de las utilidades que nos da repository
//y el servicio que creamos los metodos que a su vez
//Permitiran manipular la base de datos

@Controller
public class WebController {
 
    @Autowired
    private ProductService productService;
 

    //Con estas anotaciones permitimos recibir por el navegador 
    //(accediendo en este caso a la direccion "/")una señal que
    //Iniciara el metodo index
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }
 
    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }

    @RequestMapping(value = {"/search", "/prodname"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String searchProductByName(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name != null) {
            Product product = productService.findProductsByName(name);
            model.addAttribute("product", product);
        }
        return "search"; // Referencia a search.html en el directorio templates
    }

    @RequestMapping(value = "/insertarProducto")//Indicamos que recibimos un modelo al llamar a la direccion
    public String insertarProducto(Model model) {
        model.addAttribute("product",new Product());
        //Contenido para configurar categoria y subcategoria listado
        return "insertarProducto";
    }

                                //Aqui sera necesario indicar que realizaremos acciones de GET y post en el metodo
    @RequestMapping(value="/prepararProducto",method = {RequestMethod.GET, RequestMethod.POST})
    public String prepararProducto(@ModelAttribute(name="product") Product product, Model model){
        LocalDateTime creationDate = LocalDateTime.now();
        Product producto = product;
        //Añadimos fecha
        producto.addDates(creationDate);
        //Guardamos
        productService.insertarProducto(producto);
        return "index";
    }

}