package com.ligaamateur.LigaAmateurS.impl;

import com.ligaamateur.LigaAmateurS.dto.jugadorDTO;
import com.ligaamateur.LigaAmateurS.service.jugadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jugadorServiceImpl  implements jugadorService {
    @Override
    public List<jugadorDTO> getAllJugadores() {
        return List.of();
    }

    @Override
    public jugadorDTO findAllJugadores() {
        return null;
    }

    @Override
    public jugadorDTO createJugador(jugadorDTO jugadorDTO) {
        return null;
    }

    @Override
    public jugadorDTO getJugadorById(Long id) {
        return null;
    }

    @Override
    public jugadorDTO updateJugador(Long id, jugadorDTO jugadorDTO) {
        return null;
    }

    @Override
    public void deleteJugador(Long id) {

    }
}
