import com.aluraCursos.screemMatch.modelos.pelicula;

public class Main {
    public static void main(String[] args) {

        //Objetos
        pelicula pelicula1 = new pelicula();
        pelicula1.setNombre("Encanto");
        pelicula1.setFechaDeLanzamiento(2021);
        pelicula1.setDuracionMinutos(120);
        pelicula1.setIncluidoEnElPlan(true);

        pelicula pelicula2 = new pelicula();
        pelicula2.setNombre("Matrix");
        pelicula2.setFechaDeLanzamiento(1998);
        pelicula2.setDuracionMinutos(188);
        pelicula2.setIncluidoEnElPlan(false);

        //evaluaciones
        pelicula1.rating(7.8);
        pelicula1.rating(10);

        //datos, total de evaluaciones, media de evaluaciones
        pelicula1.fichaTecnica();
        System.out.println(pelicula1.getTotalDeNotas());
        System.out.println(pelicula1.mediaRating());


    }
}