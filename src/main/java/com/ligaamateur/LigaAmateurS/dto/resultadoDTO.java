package com.ligaamateur.LigaAmateurS.dto;

import com.ligaamateur.LigaAmateurS.entity.partido;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class resultadoDTO {

    private Long idResultado;

    private int golesLocal;

    private int golesVisitante;

    private partido partido;
}
