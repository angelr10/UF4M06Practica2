package com.accesadades.botigaDos.Model;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

//Cada uno de los modelos nos permite tener un registro de 
//Todos los atributos que va a tener la clase y aplicar directamente
//La logica de asignacion y creacion , facilitando enormemente
//La cantidad de trabajo realizado

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category") //Asignamos el nombre de la tabla que se inserira en la bdd
public class Categoria implements Serializable {
    @Id //En esta anotacion y la siguiente indicamos que generara un id automatico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;
    
    @Column(name="nombre") //Nombraremos el apodo de la columna que se aplicara en la base de datos
    private String name;
}
