package com.ligaamateur.LigaAmateurS.repository;

import com.ligaamateur.LigaAmateurS.entity.jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jugadorRepository extends JpaRepository<jugador, Long> {
}
