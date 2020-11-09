package br.com.venustech.cadastro.service;

import br.com.venustech.cadastro.model.Cliente;
import br.com.venustech.cadastro.repository.ClienteRepository;
import br.com.venustech.cadastro.tools.NumberHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project cadastro
 * Created by vinny
 * on 09/11/2020
 **/
@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente) {

        /**Verifica se cpf contem apenas numero antes de salvar*/
        if (!NumberHelper.isOnlyNumber(cliente.getCpf())) {
            cliente.setCpf(NumberHelper.numberOnly(cliente.getCpf()));
        }

        return clienteRepository.save(cliente);
    }
}
