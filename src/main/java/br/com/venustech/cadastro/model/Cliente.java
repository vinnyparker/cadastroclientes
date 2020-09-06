package br.com.venustech.cadastro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Project cadastro
 * Created by vinny
 * on 05/09/2020
 **/
@Entity
@Getter
@Setter
public class Cliente extends AbstractModel<Long> {

    @Column(name = "nome", length = 200)
    private String nome;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "datacadastro")
    private LocalDate dataCadastro;
}
