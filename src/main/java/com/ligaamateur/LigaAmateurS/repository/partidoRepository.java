package com.ligaamateur.LigaAmateurS.repository;

import com.ligaamateur.LigaAmateurS.entity.partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface partidoRepository extends JpaRepository<partido, Long> {
}
