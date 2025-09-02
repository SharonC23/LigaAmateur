package com.ligaamateur.LigaAmateurS.impl;

import com.ligaamateur.LigaAmateurS.dto.partidoDTO;
import com.ligaamateur.LigaAmateurS.service.partidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class partidoServiceImpl implements partidoService {
    @Override
    public List<partidoDTO> getAllPartidos() {
        return List.of();
    }

    @Override
    public partidoDTO findAllPartidos() {
        return null;
    }

    @Override
    public partidoDTO createPartido(partidoDTO partidoDTO) {
        return null;
    }

    @Override
    public partidoDTO getPartidoById(Long id) {
        return null;
    }

    @Override
    public partidoDTO updatePartido(Long id, partidoDTO partidoDTO) {
        return null;
    }

    @Override
    public void deletePartido(Long id) {

    }
}
