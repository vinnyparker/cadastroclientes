package br.com.venustech.cadastro.controller;

import br.com.venustech.cadastro.exception.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project cadastro
 * Created by vinny
 * on 09/11/2020
 **/
@RestControllerAdvice
public class ApplicationControllerAdvice {


    /**
     * Metodo criado paa retornar apenas o default messege da validaçao
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors validationExceptionError(MethodArgumentNotValidException exception) {
        BindingResult bindingResult = exception.getBindingResult();
        List<String> messages = bindingResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());

        return new ApiErrors(messages);
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity handleResponseStatusException(ResponseStatusException exception) {
        String messageError = exception.getMessage();
        HttpStatus statusCode = exception.getStatus();
        ApiErrors apiErrors = new ApiErrors(messageError);
        return new ResponseEntity(apiErrors,statusCode);
    }
}
