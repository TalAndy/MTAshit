package auditorium;

import CinemaPackage.Movie;

public class Auditorium {
    int auditoriumNum;
    Movie movieDisplayed;
    boolean seatsArr[][];

    public Auditorium(int auditoriumNum, Movie movieDisplayed, boolean[][] seatsArr) {
        this.auditoriumNum = auditoriumNum;
        this.movieDisplayed = movieDisplayed;
    }


}
