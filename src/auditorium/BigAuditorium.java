package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class BigAuditorium extends Auditorium {

    public BigAuditorium(int auditoriumNum, Movie movieDisplayed) {
        super(auditoriumNum, movieDisplayed);
        boolean[][] seatsArr = new boolean[16][20];
        resetSeatsArr(seatsArr);
        this.seatsArr = seatsArr;

    }

    @Override
    public Order buyTicket(Customer customer) {
        ArrayList<Integer> seat = checkFreeSeats(this.seatsArr);
        Order order = null;
        int rowSeatNumberAvailable;
        int chairSeatRow;
        int priceTicket = 42;

        //If there is no available seats at the movie
        if(seat.isEmpty())
        {
            System.out.println("We are sorry, all seats at the movie unavailable");
            return null;

        }
        else
        {
            rowSeatNumberAvailable = seat.get(0);
            chairSeatRow = seat.get(1);
            //Create order object
            order = new Order(this.movieDisplayed.getMovieName(),this.auditoriumNum,customer.checkForDiscount(priceTicket), rowSeatNumberAvailable,chairSeatRow);
        }


        return order;
    }

    public void updateMovie(Movie movie)
    {
        this.movieDisplayed=movie;
        setMovieDisplayed(movie);
        resetSeatsArr(seatsArr);
    }

    @Override
    public String toString() {
        return "SmallAuditorium{" +
                "auditoriumNum=" + auditoriumNum +
                ", movieDisplayed=" + movieDisplayed +
                ", seatsArr=" + Arrays.toString(seatsArr) +
                '}';
    }
}
