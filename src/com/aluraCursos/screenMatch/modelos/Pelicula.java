package com.aluraCursos.screenMatch.modelos;

import com.aluraCursos.screenMatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: " +this.getNombre() + " (" +this.getFechaDeLanzamiento() + ")";
    }

    @Override
    public int getClasificacion() {
        return (int) (mediaRating() /2);
     }
}
