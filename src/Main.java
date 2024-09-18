public class Main {
    public static void main(String[] args) {
        pelicula pelicula1 = new pelicula();
        pelicula1.nombre = "Encanto";
        pelicula1.fechaDeLanzamiento = 2021;
        pelicula1.duracionMinutos = 120;

        pelicula pelicula2 = new pelicula();
        pelicula2.nombre = "Matrix";
        pelicula2.fechaDeLanzamiento = 1998;
        pelicula2.duracionMinutos = 188;


        pelicula1.rating(7.8);
        pelicula1.rating(10);
        // System.out.println(pelicula1.sumaNotas);
    }
}