package com.hedima.escuderia.onetoone;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="facturacion")
public class Facturacion {
    @Id
    @Column(name="id_facturacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClave;
    @Column(length = 60,nullable = false)
    private int sueldo;
    private int publicidad;
    @OneToOne(mappedBy = "f",
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)

    private Facturacion f;

    public void Piloto(String idClave, String nombre, String pais) {

    }


}
