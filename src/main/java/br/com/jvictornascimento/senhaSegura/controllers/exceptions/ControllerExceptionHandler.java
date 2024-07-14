package br.com.jvictornascimento.senhaSegura.controllers.exceptions;

import br.com.jvictornascimento.senhaSegura.services.ValidateException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ValidateException.class)
    public ResponseEntity<StandardError> resourceNotFond(ValidateException e , HttpServletRequest request){
        String error = "Incorrect password!";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
