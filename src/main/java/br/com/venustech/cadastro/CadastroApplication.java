package br.com.venustech.cadastro;

import br.com.venustech.cadastro.model.Cliente;
import br.com.venustech.cadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CadastroApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
        return args -> {
            Cliente cliente = Cliente.builder().cpf("01234567891").nome("Jon Snow").build();
            clienteRepository.save(cliente);
        };
    }*/
}
