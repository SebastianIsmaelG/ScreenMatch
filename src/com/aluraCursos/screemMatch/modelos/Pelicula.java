package com.aluraCursos.screemMatch.modelos;

import com.aluraCursos.screenMatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;


    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getClasificacion() {
        return (int) (mediaRating() /2);
     }
}
