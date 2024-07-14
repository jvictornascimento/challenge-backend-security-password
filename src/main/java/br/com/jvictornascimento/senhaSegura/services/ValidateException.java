package br.com.jvictornascimento.senhaSegura.services;

public class ValidateException extends RuntimeException{
    public ValidateException(String message) {
        super(message);
    }
}
