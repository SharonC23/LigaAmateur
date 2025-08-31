package com.ligaamateur.LigaAmateurS.repository;

import com.ligaamateur.LigaAmateurS.entity.resultado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface resultadoServiceImpl extends JpaRepository <resultado, Long> {
}
