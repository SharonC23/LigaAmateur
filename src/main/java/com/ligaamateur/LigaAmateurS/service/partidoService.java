package com.ligaamateur.LigaAmateurS.service;


import com.ligaamateur.LigaAmateurS.dto.partidoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface partidoService {

    List<partidoDTO> getAllPartidos();

    partidoDTO findAllPartidos();

    partidoDTO createPartido(partidoDTO partidoDTO);
    partidoDTO getPartidoById(Long id);
    partidoDTO updatePartido(Long id, partidoDTO partidoDTO);
    void deletePartido(Long id);


}
