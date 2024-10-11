package com.aluraCursos.main;

import com.aluraCursos.screemMatch.modelos.Pelicula;
import com.aluraCursos.screemMatch.modelos.Series;
import com.aluraCursos.screemMatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainConListas {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Encanto",2021);
        pelicula1.rating(9);
        Pelicula pelicula2 = new Pelicula("Matrix",1998);
        pelicula2.rating(6);
        Pelicula pelicula3 = new Pelicula("El señor de los anillos",2001);
        pelicula3.rating(10);
        Series serie1 = new Series("La casa del dragon",2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);
        lista.add(serie1);



        for (Titulo item: lista){
            System.out.println("Nombre: " +item.getNombre());

            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println("Clasificacion: " +pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println(lista);

    }
}
