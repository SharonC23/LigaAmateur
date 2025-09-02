package com.ligaamateur.LigaAmateurS.impl;

import com.ligaamateur.LigaAmateurS.dto.sancionDTO;
import com.ligaamateur.LigaAmateurS.service.sancionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sancionServiceImpl implements sancionService {
    @Override
    public List<sancionDTO> getAllSanciones() {
        return List.of();
    }

    @Override
    public sancionDTO findAllSanciones() {
        return null;
    }

    @Override
    public sancionDTO createSancion(sancionDTO sancionDTO) {
        return null;
    }

    @Override
    public sancionDTO getSancionById(Long id) {
        return null;
    }

    @Override
    public sancionDTO updateSancion(Long id, sancionDTO sancionDTO) {
        return null;
    }

    @Override
    public void deleteSancion(Long id) {

    }
}
