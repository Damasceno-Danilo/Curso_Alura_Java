package br.com.alura.screenmatch.model;

public class Film extends Title {

    private String director;

    public String getDirector()  {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getDurationInMinutes() {
        return super.getDurationInMinutes();
    }
}
