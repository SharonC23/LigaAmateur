package com.ligaamateur.LigaAmateurS.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "jugadores")
public class jugador {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idJugador;

    @Column (name = "nombres", nullable = false, length = 30)
    private String nombres;

    @Column (name = "posicion", nullable = false, length = 30)
    private String posicion;

    @Column (name = "dorsal", nullable = false)
    private int dorsal;

    @ManyToOne
    @JoinColumn(name = "idEquipo", nullable = false)
    private equipo equipo;
}
