package br.com.venustech.cadastro.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Project cadastro
 * Created by vinny
 * on 05/09/2020
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "cad_servico")
public class Servico extends AbstractModel<Long> {

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cliente_id", foreignKey = @ForeignKey(name = "fk_servico_cliente"))
    private Cliente cliente;

    @Column(name="valor", columnDefinition = "numeric(15,2)")
    private BigDecimal valor;
}
