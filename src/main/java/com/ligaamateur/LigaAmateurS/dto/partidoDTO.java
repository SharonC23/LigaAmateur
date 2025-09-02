package com.ligaamateur.LigaAmateurS.dto;

import com.ligaamateur.LigaAmateurS.entity.equipo;
import com.ligaamateur.LigaAmateurS.entity.resultado;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class partidoDTO {

    private Long idPartido;

    private LocalDate fecha;

    private equipo equipoLocal;

    private equipo equipoVisitante;

    private String estadio;

    private resultado resultado;
}
