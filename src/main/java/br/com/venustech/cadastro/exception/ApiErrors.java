package br.com.venustech.cadastro.exception;

import lombok.Getter;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

/**
 * Project cadastro
 * Created by vinny
 * on 09/11/2020
 **/

public class ApiErrors {

    @Getter
    private List<String> errors;

    public ApiErrors(List<String> errorList) {
        this.errors = errorList;
    }

    public ApiErrors(String message) {
        this.errors = Arrays.asList(message);
    }



}
