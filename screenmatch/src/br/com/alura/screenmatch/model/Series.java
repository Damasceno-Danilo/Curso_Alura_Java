package br.com.alura.screenmatch.model;

public class Series extends Title {

  private int seasons;
  private int episodes;
  private boolean active;
  private int minutesForSeason;
  public int getSeasons() {
    return seasons;
  }
  public void setSeasons(int seasons) {
    this.seasons = seasons;
  }
  public int getEpisodes() {
    return episodes;
  }
  public void setEpisodes(int episodes) {
    this.episodes = episodes;
  }
  public boolean isActive() {
    return active;
  }
  public void setActive(boolean active) {
    this.active = active;
  }
  public int getMinutesForSeason() {
    return minutesForSeason;
  }
  public void setMinutesForSeason(int minutesForSeason) {
    this.minutesForSeason = minutesForSeason;
  }
}
