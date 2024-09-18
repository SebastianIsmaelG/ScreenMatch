public class pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnElPlan;
    double sumaNotas;
    int totalDeNotas;

    void fichaTecnica(){
        System.out.println("Pelicula: "+nombre);
        System.out.println("Lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duracion: " +duracionMinutos);
    }

    void rating(double nota){
        sumaNotas = sumaNotas+nota;
        totalDeNotas++;
    }

    double mediaRating(){
        return sumaNotas / totalDeNotas;
    }
}
