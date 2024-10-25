package com.aluraCursos.screenMatch.modelos;
import com.aluraCursos.screenMatch.excepciones.ErrorNAException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    public Titulo(String nombre, int fechaDeLanzamiento){
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    //Atributos siempre privados
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnElPlan;
    private double sumaNotas;
    private int totalDeNotas;

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            this.fechaDeLanzamiento = 0 ;
            throw new ErrorNAException("Duracion invalida");

        }
        this.duracionMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));
    }

    /******************SETTERS******************************************/
    public void setNombre(String nombre) { //generate setter
        this.nombre = nombre;
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }



    /********************GETTERS*******************************************/

    public int getTotalDeNotas(){
        return totalDeNotas;
    }
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    /*********************METODOS***************************************/
    public void fichaTecnica(){
        System.out.println("Pelicula: "+nombre);
        System.out.println("Lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duracion: " +duracionMinutos);
    }
    public void rating(double nota){  //suma de evaluaciones
        sumaNotas = sumaNotas+nota;
        totalDeNotas++;
    }
    public double mediaRating(){
        return sumaNotas / totalDeNotas;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre: '" + nombre + '\'' +
                ", fechaDeLanzamiento: " + fechaDeLanzamiento + ", duracion: "+duracionMinutos+" mins)";
    }
}
