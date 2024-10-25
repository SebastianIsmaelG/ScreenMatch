package com.aluraCursos.main;

import com.aluraCursos.screenMatch.modelos.Episodio;
import com.aluraCursos.screenMatch.modelos.Pelicula;
import com.aluraCursos.screenMatch.modelos.Series;
import com.aluraCursos.screenMatch.calculos.CalculadoraDeTiempo;
import com.aluraCursos.screenMatch.calculos.FiltroRecomendacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /********************Constructor ******************************************/
        Pelicula pelicula1 = new Pelicula("Encanto",2021);
//        pelicula1.setNombre("Encanto");
//        pelicula1.setFechaDeLanzamiento(2021);
        pelicula1.setDuracionMinutos(120);
        pelicula1.setIncluidoEnElPlan(true);

        Pelicula pelicula2 = new Pelicula("Matrix",1998);
//        pelicula2.setNombre("Matrix");
//        pelicula2.setFechaDeLanzamiento(1998);
        pelicula2.setDuracionMinutos(188);
        pelicula2.setIncluidoEnElPlan(false);

        Pelicula pelicula3 = new Pelicula("Matrix recargado",2003);
//        pelicula3.setNombre("Matrix recargado");
//        pelicula3.setFechaDeLanzamiento(2003);
        pelicula3.setDuracionMinutos(180);
        pelicula3.setIncluidoEnElPlan(true);

        Pelicula pelicula4 = new Pelicula("El señor de los anillos",2001);
//        pelicula4.setNombre("Señor de los anillos");
//        pelicula4.setFechaDeLanzamiento(2001);
        pelicula4.setDuracionMinutos(180);

        /*Para declarar un array en Java, es necesario definir su tipo y tamaño.
        Por ejemplo, para crear un array de números enteros con tamaño 5, podemos escribir el siguiente código:

         int[] numeros = new int[5];

         Pelicula[] peliculas= new Pelicula[2];

         Pelicula pelicula1 = new Pelicula("Avatar", 2009);
         Pelicula pelicula2 = new Pelicula("El señor de los anillos", 2001);

         peliculas[0] = pelicula1;
         peliculas[1] = pelicula2;


         */

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(pelicula1);
        listaDePeliculas.add(pelicula2);
        listaDePeliculas.add(pelicula3);
        listaDePeliculas.add(pelicula4);

        System.out.println("Tamaño de la lista: "+ listaDePeliculas.size() );
        System.out.println("La primera pelicula es: "+ listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);



        Series serie1 = new Series("La casa del dragon",2022);
//        serie1.setNombre("La casa del dragon");
//        serie1.setFechaDeLanzamiento(2022);
        serie1.setTemporadas(1);
        serie1.setminutosPorEpisodio(50);
        serie1.setEpisodiosPorTemporada(10);


        //evaluaciones
        pelicula1.rating(7.8);
        pelicula1.rating(10);

        //datos, total de evaluaciones, media de evaluaciones del objeto pelicula1
        //pelicula1.fichaTecnica();
        //System.out.println(pelicula1.getTotalDeNotas());
        //System.out.println(pelicula1.mediaRating());
        //System.out.println(serie1.getDuracionMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula1);
        calculadora.incluye(serie1);
        calculadora.incluye(pelicula3);
        //System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        //filtroRecomendacion.filtra(pelicula1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Capitulo 1");
        episodio.setSerie(serie1);
        episodio.setTotalVisualizaciones(300);

        //filtroRecomendacion.filtra(episodio);

    }
}