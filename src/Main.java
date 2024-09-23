import com.aluraCursos.screemMatch.modelos.Pelicula;
import com.aluraCursos.screemMatch.modelos.Series;
import com.aluraCursos.screenMatch.modelos.CalculadoraDeTiempo;

public class Main {
    public static void main(String[] args) {

        /********************OBJETOS******************************************/
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Encanto");
        pelicula1.setFechaDeLanzamiento(2021);
        pelicula1.setDuracionMinutos(120);
        pelicula1.setIncluidoEnElPlan(true);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Matrix");
        pelicula2.setFechaDeLanzamiento(1998);
        pelicula2.setDuracionMinutos(188);
        pelicula2.setIncluidoEnElPlan(false);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setNombre("Matrix recargado");
        pelicula3.setFechaDeLanzamiento(2003);
        pelicula3.setDuracionMinutos(180);
        pelicula3.setIncluidoEnElPlan(true);


        Series serie1 = new Series();
        serie1.setNombre("La casa del dragon");
        serie1.setFechaDeLanzamiento(2022);
        serie1.setTemporadas(1);
        serie1.setminutosPorEpisodio(50);
        serie1.setEpisodiosPorTemporada(10);


        //evaluaciones
        pelicula1.rating(7.8);
        pelicula1.rating(10);

        //datos, total de evaluaciones, media de evaluaciones del objeto pelicula1
        pelicula1.fichaTecnica();
        System.out.println(pelicula1.getTotalDeNotas());
        System.out.println(pelicula1.mediaRating());
        System.out.println(serie1.getDuracionMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pelicula1);
        calculadora.incluye(serie1);
        calculadora.incluye(pelicula3);
        System.out.println(calculadora.getTiempoTotal());


    }
}