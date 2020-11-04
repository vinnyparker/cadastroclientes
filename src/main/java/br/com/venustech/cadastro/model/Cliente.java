package br.com.venustech.cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Project cadastro
 * Created by vinny
 * on 05/09/2020
 **/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cad_cliente")
public class Cliente extends AbstractModel<Long> {

    @Column(name = "nome", length = 200, nullable = false)
    @NotEmpty(message = "O Nome é um campo Obrigatório")
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false)
    @NotNull(message = "O CPF não pode ser Nulo")
    @CPF(message = "O CPF Pecisa ser Válido")
    private String cpf;


}
