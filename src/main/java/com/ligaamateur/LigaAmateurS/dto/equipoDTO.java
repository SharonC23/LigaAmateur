package com.ligaamateur.LigaAmateurS.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class equipoDTO {

    private Long idEquipoLocal;

    private String nombre;

    private String ciudad;
}
