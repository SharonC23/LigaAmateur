package com.ligaamateur.LigaAmateurS.impl;

import com.ligaamateur.LigaAmateurS.dto.equipoDTO;
import com.ligaamateur.LigaAmateurS.service.equipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class equipoServiceImpl implements equipoService {


    @Override
    public List<equipoDTO> getAllEquipos() {
        return List.of();
    }

    @Override
    public equipoDTO findAllEquipos() {
        return null;
    }

    @Override
    public equipoDTO createEquipo(equipoDTO equipoDTO) {
        return null;
    }

    @Override
    public equipoDTO getEquipoById(Long id) {
        return null;
    }

    @Override
    public equipoDTO updateEquipo(Long id, equipoDTO equipoDTO) {
        return null;
    }

    @Override
    public void deleteEquipo(Long id) {

    }
}
