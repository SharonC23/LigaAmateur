package com.ligaamateur.LigaAmateurS.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "equipos")
@Data
public class equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipoLocal;

    @Column(name = "nombre", nullable = false, unique = true, length = 30 )
    private String nombre;

    @Column(name = "ciudad", nullable = false, length = 20)
    private String ciudad;


}
