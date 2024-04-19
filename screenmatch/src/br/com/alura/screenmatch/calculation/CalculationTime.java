package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.model.Film;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Title;

public class CalculationTime {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
