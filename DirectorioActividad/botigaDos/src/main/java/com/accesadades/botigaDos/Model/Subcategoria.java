package com.accesadades.botigaDos.Model;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subcategory")
public class Subcategoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subcategoryId;
    
    @Column(name="nombre")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;
}
