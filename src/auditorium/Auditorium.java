package auditorium;
// Niv Badli and Tal Endelman

import CinemaPackage.Movie;
import CinemaPackage.Order;
import People.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class  Auditorium {
    protected int auditoriumNum;
    protected Movie movieDisplayed;
    protected boolean[][] seatsArr;

    public Auditorium(int auditoriumNum) {
        this.auditoriumNum = auditoriumNum;
    }

    public int getAuditoriumNum() {
        return auditoriumNum;
    }

    public Movie getMovieDisplayed() {
        return movieDisplayed;
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

    public void setMovieDisplayed(Movie movieDisplayed) {
        this.movieDisplayed = movieDisplayed;
    }

    public int numOfFreeSeats(boolean[][] auditoriumSeats)
    {
        boolean free = false;
        int counter = 0;
        int row;
        int column;

        //Iterate off all seats for count num of free seats
        for (row = auditoriumSeats.length-1;row >=0; row--) {
            for(column = auditoriumSeats.length;column>=0; column--)
            {
                //If there is a free seat set count it
                if(auditoriumSeats[row][column])
                {
                    counter += 1;
                }
            }
        }
        return counter;
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

    public boolean equals(Movie movieToCheck) {
        return movieToCheck.equals(this.getMovieDisplayed());
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "auditoriumNum=" + auditoriumNum +
                ", movieDisplayed=" + movieDisplayed +
                ", seatsArr=" + Arrays.toString(seatsArr) +
                '}';
    }
}
