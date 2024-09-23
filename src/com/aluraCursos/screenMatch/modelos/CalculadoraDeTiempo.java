package com.aluraCursos.screenMatch.modelos;


import com.aluraCursos.screemMatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye (Titulo titulo){
        this.tiempoTotal = tiempoTotal+titulo.getDuracionMinutos();
    }

}
