package br.com.alura.screenmatch.model;

public class Title {

    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double addAssessment;
    private int totalAssessment;
    private int durationInMinutes;

    public int getTotalAssessment() {
        return totalAssessment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void dataSheet() {
        System.out.println("Ficha Tecnica: ");
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lancamento: " + releaseYear);
        System.out.println("Duração: " + durationInMinutes + " minutos");

    }

    public void addReviews(double note) {
        addAssessment += note;
        totalAssessment++;
    }

    public double mediaReviews() {
        return addAssessment / totalAssessment;
    }


}
