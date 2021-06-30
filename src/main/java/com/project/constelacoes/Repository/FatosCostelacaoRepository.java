package com.project.constelacoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.constelacoes.Model.FatosCostelacao;

@Repository
public interface FatosCostelacaoRepository extends JpaRepository<FatosCostelacao, Long> {

}
