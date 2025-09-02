package com.ligaamateur.LigaAmateurS.service;


import com.ligaamateur.LigaAmateurS.dto.equipoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface equipoService {

    List<equipoDTO> getAllEquipos();

    equipoDTO findAllEquipos();

    equipoDTO createEquipo(equipoDTO equipoDTO);
    equipoDTO getEquipoById(Long id);
    equipoDTO updateEquipo(Long id, equipoDTO equipoDTO);
    void deleteEquipo(Long id);
}
