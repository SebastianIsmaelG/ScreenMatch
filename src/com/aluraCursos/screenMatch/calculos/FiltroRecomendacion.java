package com.aluraCursos.screenMatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>= 4){
            System.out.println("Recomendada");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular");
        }else {
            System.out.println("Clasico");
        }
    }
}
