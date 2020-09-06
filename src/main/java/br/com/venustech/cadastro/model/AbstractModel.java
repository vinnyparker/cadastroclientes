package br.com.venustech.cadastro.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Project cadastro
 * Created by vinny
 * on 05/09/2020
 **/

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractModel<Long extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private java.lang.Long id;
}
