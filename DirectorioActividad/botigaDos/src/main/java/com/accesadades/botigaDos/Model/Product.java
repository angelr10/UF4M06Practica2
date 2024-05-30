package com.accesadades.botigaDos.Model;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long product_id;
    @Column(name="nombre")
    private String name;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="company")
    private String company;
    @Column(name="precio")
    private float price;
    @Column(name="unidades")
    private long units;
    @Column(name = "creation_at")
    private LocalDateTime creationDate;
    @Column(name = "updated_at")
    private LocalDateTime updateDate;
    @ManyToOne //Aqui realizaremos una referencia con el campo subcategory y 
    @JoinColumn(name="subcategory_id")
    private Subcategoria subcategory;
    
    public void addDates(LocalDateTime fecha){
        this.creationDate = fecha;
        this.updateDate = fecha;
    }
}