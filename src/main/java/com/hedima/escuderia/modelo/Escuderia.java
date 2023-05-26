package com.hedima.escuderia.onetomany;

import com.hedima.escuderia.onetoone.Piloto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="escuderia")
public class Escuderia {
    @Id
    @Column(name = "idClave")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClave;
    @Column (length = 60)
    private String nombre;
    private String pais;
    @OneToMany (mappedBy ="e",
    cascade= CascadeType.ALL,
    fetch= FetchType.EAGER)
    private List<Piloto> Pilotos;

}
