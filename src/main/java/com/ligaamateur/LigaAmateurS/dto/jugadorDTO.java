package com.ligaamateur.LigaAmateurS.dto;

import com.ligaamateur.LigaAmateurS.entity.equipo;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class jugadorDTO {

    private Long idJugador;

    private String nombres;

    private String posicion;

    private int dorsal;

    private equipo equipo;
}
