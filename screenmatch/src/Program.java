import br.com.alura.screenmatch.model.Film;

public class Program {
    public static void main(String[] args) {

        Film actionFilm = new Film();

        actionFilm.setName("O Poderoso Chefão");
        actionFilm.setReleaseYear( 1970);
        actionFilm.setDurationInMinutes( 180);

        actionFilm.dataSheet();
        actionFilm.addReviews(10);
        actionFilm.addReviews(9.5);
        actionFilm.addReviews(8);
        System.out.printf("Notas de avaliacao: %.1f%n", actionFilm.mediaReviews());
        System.out.println("Total de avaliacoes: " + actionFilm.getTotalAssessment());


    }


}
