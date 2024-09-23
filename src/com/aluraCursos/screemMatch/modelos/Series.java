package com.aluraCursos.screemMatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


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


}
