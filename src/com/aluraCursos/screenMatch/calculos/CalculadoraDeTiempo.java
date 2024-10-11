package com.aluraCursos.screenMatch.calculos;


import com.aluraCursos.screemMatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    public void incluye (Titulo titulo){

        this.tiempoTotal = tiempoTotal+titulo.getDuracionMinutos();
        System.out.println("Agregando duracion en minutos de " + titulo);
    }

}
