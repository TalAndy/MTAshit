package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;

import java.sql.Array;
import java.util.ArrayList;

public abstract class  Auditorium {
    int auditoriumNum;
    Movie movieDisplayed;
    boolean[][] seatsArr;

    public int getAuditoriumNum() {
        return auditoriumNum;
    }

    public Auditorium(int auditoriumNum, Movie movieDisplayed) {
        this.auditoriumNum = auditoriumNum;
        this.movieDisplayed = movieDisplayed;
    }

    public abstract Order buyTicket(Customer customer);

    public abstract void updateMovie(Movie movie);


    public Auditorium(boolean[][] seatsArr) {
        this.seatsArr = seatsArr;
    }

    public Movie getMovieDisplayed() {
        return movieDisplayed;
    }

    public void setMovieDisplayed(Movie movieDisplayed) {
        this.movieDisplayed = movieDisplayed;
    }

    public ArrayList<Integer> checkFreeSeats(boolean[][] auditoriumSeats)
    {
        //We can assume auditoriumSeats[][] is not null because we are initialized at the contractors
        ArrayList<Integer> seat= new ArrayList<Integer>(2);

        int row;
        int column;

        //While isFreeSeat is false (there is no place at the auditorium) cotinue check for free seat
        while (seat.isEmpty())
        {
            for (row = auditoriumSeats.length-1;row >=0; row--) {
                for(column = auditoriumSeats.length;column>=0; column--)
                {
                    //If there is a free seat set isFreeSeat to True
                    if(auditoriumSeats[row][column])
                    {
                        seat.add(row);
                        seat.add(column);
                    }
                }
            }
        }

        return seat;
    }

    public void resetSeatsArr(boolean[][] arrayToReset)
    {
        for(int i = 0; i < arrayToReset.length; ++i) {
            for(int j = 0; j < arrayToReset[0].length; ++j) {
                arrayToReset[i][j] = false;
            }
        }
    }

    public void setmovieDisplayed(Movie newMovie){
        this.movieDisplayed = newMovie;
    }
}
