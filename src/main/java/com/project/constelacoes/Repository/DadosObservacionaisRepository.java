package com.project.constelacoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.constelacoes.Model.DadosObservacionais;

@Repository
public interface DadosObservacionaisRepository extends JpaRepository<DadosObservacionais, Long>{

}
