package com.aluraCursos.screenMatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Series(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public int getDuracionMinutos(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }


    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public int getminutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setminutosPorEpisodio(int minutosPorTemporadas) {
        this.minutosPorEpisodio = minutosPorTemporadas;
    }

//    @Override
//    public int getMinutosPorEpisodio(){
//        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
//    }

    @Override
    public String toString(){
        return "Serie: "+ this.getNombre()+ " ("+this.getFechaDeLanzamiento()+")";
    }
}
