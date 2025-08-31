package com.ligaamateur.LigaAmateurS.repository;

import com.ligaamateur.LigaAmateurS.entity.equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface equipoRepository extends JpaRepository <equipo, Long> {
}
