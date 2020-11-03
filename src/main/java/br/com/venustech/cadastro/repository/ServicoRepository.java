package br.com.venustech.cadastro.repository;

import br.com.venustech.cadastro.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Project cadastro
 * Created by vinny
 * on 03/11/2020
 **/
@Repository
public interface ServicoRepository extends JpaRepository<Servico,Long> {
}
