package com.ligaamateur.LigaAmateurS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "partidos")
@Data
public class partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPartido;

    @Column (name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "idEquipoLocal", nullable = false)
    private equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "idEquipoVisitante", nullable = false)
    private equipo equipoVisitante;

    @Column (name = "estadio", nullable = false)
    private String estadio;

    @OneToOne(mappedBy = "partido", cascade = CascadeType.ALL)
    private resultado resultado;





}
