package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;

public class Auditorium {
    int auditoriumNum;
    Movie movieDisplayed;
    boolean[][] seatsArr;

    public Auditorium(int auditoriumNum, Movie movieDisplayed, boolean[][] seatsArr) {
        this.auditoriumNum = auditoriumNum;
        this.movieDisplayed = movieDisplayed;
    }


    public Movie getMovieDisplayed() {
        return movieDisplayed;
    }

    public void setMovieDisplayed(Movie movieDisplayed) {
        this.movieDisplayed = movieDisplayed;
    }

    public boolean freeSeat(boolean[][] auditoriumSeats)
    {
        //In case auditoriumSeats Array is null return False
        if(auditoriumSeats.length ==0)
        {
            return false;
        }
        boolean isFreeSeat = false;
        int row;
        int column;

        //While isFreeSeat is false (there is no place at the auditorium) cotinue check for free seat
        while (isFreeSeat = false)
        {
            for (row = auditoriumSeats.length-1;row >=0; row--) {
                for(column = auditoriumSeats.length;column>=0; column--)
                {
                    //If there is a free seat set isFreeSeat to True
                    if(auditoriumSeats[row][column])
                    {
                        isFreeSeat= true;
                    }
                }
            }
        }
        //Return True
        return isFreeSeat;
    }

}
