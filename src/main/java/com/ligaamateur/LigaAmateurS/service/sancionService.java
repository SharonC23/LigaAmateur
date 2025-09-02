package com.ligaamateur.LigaAmateurS.service;


import com.ligaamateur.LigaAmateurS.dto.sancionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface sancionService {

    List<sancionDTO> getAllSanciones();

    sancionDTO findAllSanciones();

    sancionDTO createSancion(sancionDTO sancionDTO);
    sancionDTO getSancionById(Long id);
    sancionDTO updateSancion(Long id, sancionDTO sancionDTO);
    void deleteSancion(Long id);

}
