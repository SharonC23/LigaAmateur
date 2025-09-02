package com.ligaamateur.LigaAmateurS.dto;

import com.ligaamateur.LigaAmateurS.entity.jugador;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
public class sancionDTO {

    private Long idSancion;

    private LocalDate fecha;

    private String tipo;

    private String observacion;

    private jugador jugador;
}
