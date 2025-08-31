package com.ligaamateur.LigaAmateurS.repository;

import com.ligaamateur.LigaAmateurS.entity.sancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sancionServiceImpl extends JpaRepository<sancion, Long> {
}
