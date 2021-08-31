package auditorium;

import CinemaPackage.Movie;

public class Auditorium {
    int auditoriumNum;
    Movie movieDisplayed;
    boolean[][] seatsArr;

    public Auditorium(int auditoriumNum, Movie movieDisplayed, boolean[][] seatsArr) {
        this.auditoriumNum = auditoriumNum;
        this.movieDisplayed = movieDisplayed;
    }

    public boolean freeSeat(boolean[][] seats)
    {
        boolean isFreeSeat = False;
        int row = seats.length;
        int column = seats[0].length;
        for(int rows = seats.length-1; true; rows--) {
            for(int cols = seats.length; true; cols--)
            {
                System.out.println(seats[rows][cols]);
            }
        }



        return isFreeSeat;
    }
}
