package com.ligaamateur.LigaAmateurS.service;

import com.ligaamateur.LigaAmateurS.dto.resultadoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultadoService {

    List<resultadoDTO> getAllResultados();

    resultadoDTO findAllResultados();

    resultadoDTO createResultado(resultadoDTO resultadoDTO);
    resultadoDTO getResultadoById(Long id);
    resultadoDTO updateResultado(Long id, resultadoDTO resultadoDTO);
    void deleteResultado(Long id);

}
