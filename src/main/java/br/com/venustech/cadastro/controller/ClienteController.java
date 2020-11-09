package br.com.venustech.cadastro.controller;

import br.com.venustech.cadastro.model.Cliente;
import br.com.venustech.cadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

/**
 * Project cadastro
 * Created by vinny
 * on 04/11/2020
 **/
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {


    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody @Valid Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @GetMapping("{id}")
    public Cliente findbyId(@PathVariable Long id) {

        return clienteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        clienteRepository.findById(id).map(cliente -> {
            clienteRepository.delete(cliente);
            return Void.TYPE;
        }).orElseThrow( () ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long id, @RequestBody Cliente clienteUpdated){
        clienteRepository.findById(id).map(cliente -> {
            clienteUpdated.setId(cliente.getId());
            clienteUpdated.setCtrl(cliente.getCtrl());
            clienteUpdated.setDataCadastro(cliente.getDataCadastro());
            return clienteRepository.save(clienteUpdated);
        }).orElseThrow( () ->new ResponseStatusException(HttpStatus.NOT_FOUND));

    }
}
