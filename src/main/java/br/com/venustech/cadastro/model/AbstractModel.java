package br.com.venustech.cadastro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Project cadastro
 * Created by vinny
 * on 05/09/2020
 **/

@MappedSuperclass
@Data
public abstract class AbstractModel<Long extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private java.lang.Long id;

    @Column(name = "ctrl", length = 10, columnDefinition = "varchar(10) NOT NULL DEFAULT 0")
    private String ctrl;

    @Column(name = "datacadastro", columnDefinition = "date NOT NULL DEFAULT current_date", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersist() {
        setCtrl("0");
        setDataCadastro(LocalDate.now());

    }
}
