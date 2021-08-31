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
        for (row > seats.length; row--)
        {
            for (int col = 0; col < board[row].length; col++)
        { board[row][col] = row * col; }
        }



        return isFreeSeat;
    }
}
