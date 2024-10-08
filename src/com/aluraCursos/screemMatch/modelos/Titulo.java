package com.aluraCursos.screemMatch.modelos;

public class Titulo {
    private String nombre;   //Atributos siempre privados
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnElPlan;
    private double sumaNotas;
    private int totalDeNotas;
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
}
