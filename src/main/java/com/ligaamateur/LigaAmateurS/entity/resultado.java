package com.ligaamateur.LigaAmateurS.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "resultados")
@Data
public class resultado {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idResultado;

    @Column (name = "goles_local", nullable = false)
    private int golesLocal;

    @Column (name = "goles_visitante", nullable = false)
    private int golesVisitante;

    @OneToOne
    @JoinColumn(name = "partido_id", nullable = false)
    private partido partido;

}
