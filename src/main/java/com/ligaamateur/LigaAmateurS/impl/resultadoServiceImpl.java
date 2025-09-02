package com.ligaamateur.LigaAmateurS.impl;

import com.ligaamateur.LigaAmateurS.dto.resultadoDTO;
import com.ligaamateur.LigaAmateurS.service.resultadoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class resultadoServiceImpl implements resultadoService {
    @Override
    public List<resultadoDTO> getAllResultados() {
        return List.of();
    }

    @Override
    public resultadoDTO findAllResultados() {
        return null;
    }

    @Override
    public resultadoDTO createResultado(resultadoDTO resultadoDTO) {
        return null;
    }

    @Override
    public resultadoDTO getResultadoById(Long id) {
        return null;
    }

    @Override
    public resultadoDTO updateResultado(Long id, resultadoDTO resultadoDTO) {
        return null;
    }

    @Override
    public void deleteResultado(Long id) {

    }
}
