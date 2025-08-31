package com.ligaamateur.LigaAmateurS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "sanciones")
@Data
public class sancion {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idSancion;

    @Column (name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column (name = "tipo", nullable = false, length = 20)
    private String tipo;

    @Column (name = "observacion", length = 100)
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "jugador_id", nullable = false)
    private jugador jugador;



}
