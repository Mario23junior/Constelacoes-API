package com.project.constelacoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.constelacoes.Model.Catalogacao;

@Repository
public interface CatalogacaoRepository extends JpaRepository<Catalogacao,Long>{

}
