package BAK;

import java.time.LocalDate;

class Match {
    Team opponent;
    LocalDate matchDate;
    String result;

    public Match(Team opponent, LocalDate matchDate, String result) {
        this.opponent = opponent;
        this.matchDate = matchDate;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Mecz z " + opponent.name + " dnia " + matchDate + ", wynik: " + result;
    }
}