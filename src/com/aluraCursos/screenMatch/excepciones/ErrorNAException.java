package com.aluraCursos.screenMatch.excepciones;

public class ErrorNAException extends RuntimeException {
    private String mensaje;
    public ErrorNAException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }

}
