package com.ligaamateur.LigaAmateurS.service;


import com.ligaamateur.LigaAmateurS.dto.jugadorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface jugadorService {

    List<jugadorDTO> getAllJugadores();

    jugadorDTO findAllJugadores();

    jugadorDTO createJugador(jugadorDTO jugadorDTO);
    jugadorDTO getJugadorById(Long id);
    jugadorDTO updateJugador(Long id, jugadorDTO jugadorDTO);
    void deleteJugador(Long id);

}
