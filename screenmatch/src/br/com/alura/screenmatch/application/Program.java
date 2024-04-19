package br.com.alura.screenmatch.application;

import br.com.alura.screenmatch.calculation.CalculationTime;
import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Series;

public class Program {
    public static void main(String[] args) {

        Film film = new Film();

        film.setName("O Poderoso Chefão");
        film.setReleaseYear(1970);
        film.setDurationInMinutes(180);

        film.dataSheet();
        film.addReviews(10);
        film.addReviews(9.5);
        film.addReviews(8);
        System.out.printf("Notas de avaliacao: %.1f%n", film.mediaReviews());
        System.out.println("Total de avaliacoes: " + film.getTotalAssessment());
        System.out.println("--------------------------------------------------------------");

        Film film2 = new Film();

        film2.setName("O lobo de Wall street");
        film2.setReleaseYear(2015);
        film2.setDurationInMinutes(120);

        film2.dataSheet();
        film2.addReviews(10);
        film2.addReviews(5);
        film2.addReviews(8);
        System.out.printf("Notas de avaliacao: %.1f%n", film2.mediaReviews());
        System.out.println("Total de avaliacoes: " + film2.getTotalAssessment());
        System.out.println("--------------------------------------------------------------");

        Series series = new Series();

        series.setName("The Walking Dead");
        series.setReleaseYear(2010);
        series.dataSheet();
        series.setSeasons(11);
        series.setEpisodes(10);
        series.setMinutesForSeason(55);
        series.addReviews(8);
        series.addReviews(9);
        series.addReviews(6);
        System.out.printf("Notas de avaliacao: %.1f%n", series.mediaReviews());
        System.out.println("Total de avaliacoes: " + series.getTotalAssessment());
        System.out.println("Duração para maratonar series: " + series.getDurationInMinutes() + " Horas");

        CalculationTime calc = new CalculationTime();

        calc.includes(film);
        calc.includes(film2);
        calc.includes(series);
        System.out.println();
        System.out.println("Duração para maratonar filmes e series: " +calc.getTotalTime() + " Horas");
    }


}
