package br.com.venustech.cadastro.repository;

import br.com.venustech.cadastro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project cadastro
 * Created by vinny
 * on 03/11/2020
 **/
public interface ClienteRepository  extends JpaRepository<Cliente,Long> {
}
