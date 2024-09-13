package org.springboot.riwi.chronoturner.backend.Controllers.handlerError;


import org.springboot.riwi.chronoturner.backend.dtos.exception.ErrorSimple;
import org.springboot.riwi.chronoturner.backend.dtos.exception.ErrorsResponse;
import org.springboot.riwi.chronoturner.backend.dtos.exception.NoUserIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.naming.ServiceUnavailableException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class HandlerExceptionController {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    //NullPointerException.class})

    public ErrorSimple badRequest(MethodArgumentNotValidException exception){
        List<String> errors = new ArrayList<>();
        exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()) );
        return ErrorsResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .message("introduce los campos faltantes")
                .errors(errors)
                .build();
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrorSimple methodNotSupported(NoHandlerFoundException exception){
        List<String> errors = new ArrayList<>();
        errors.add("No se encontró el manejador para la ruta solicitada.");
        return ErrorsResponse.builder()
                .code(404)
                .status(HttpStatus.NOT_FOUND.name())
                .message("La ruta que ingresas no es valida")
                .errors(errors)
                .build();
    }


    @ExceptionHandler(SocketTimeoutException.class)
    public ErrorSimple timeout(SocketTimeoutException exception){
        List<String> errors = new ArrayList<>();
        errors.add("Timeout");
        return ErrorsResponse.builder()
                .code(HttpStatus.GATEWAY_TIMEOUT.value())
                .status(HttpStatus.GATEWAY_TIMEOUT.name())
                .message("La solicitud tarda demasiado en recibir una respuesta")
                .errors(errors)
                .build();
    }




    @ExceptionHandler(UnknownHostException.class)
    public ErrorSimple unknownHost(UnknownHostException exception){
        List<String> errors = new ArrayList<>();
        errors.add("Host no valido");
        return ErrorsResponse.builder()
                .code(HttpStatus.BAD_GATEWAY.value())
                .status(HttpStatus.BAD_GATEWAY.name())
                .message("No se pudo resolver el nombre de dominio")
                .errors(errors)
                .build();
    }



    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity<Map<String,Object>> serviceUnavailable(ServiceUnavailableException exception){
        Map<String, Object> body = new HashMap<>();

        body.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
        body.put("code", HttpStatus.SERVICE_UNAVAILABLE.name());
        body.put("error", "Service Unavailable");
        body.put("message", exception.getMessage());
        body.put("timestamp", LocalDateTime.now());
        body.put("path","/api/tu-enpoint");

        return new ResponseEntity<>(body, HttpStatus.SERVICE_UNAVAILABLE);

    }


    @ExceptionHandler(NoUserIdException.class)
    public ErrorSimple noUserId(NoUserIdException exception){

        return ErrorsResponse.builder()
                .code(404)
                .status(HttpStatus.BAD_GATEWAY.name())
                .message(exception.getMessage())
                .build();
    }





}

