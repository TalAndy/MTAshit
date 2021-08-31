package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;
import People.Person;

import java.util.ArrayList;

public class SmallAuditorium extends Auditorium {

    public SmallAuditorium(int auditoriumNum, Movie movieDisplayed) {
        super(auditoriumNum, movieDisplayed);
        seatsArr = new boolean[8][10];
        resetSeatsArr(seatsArr);
    }

    @Override
    public Order buyTicket(Customer customer) {
        ArrayList<Integer> seat = getFreeSeat(this.seatsArr);
        Order order = null;
        int rowSeatNumberAvailable;
        int chairSeatRow;
        //If there is no available seats at the movie
        if(seat.isEmpty())
        {
            System.out.println("We are sorry, all seats at the movie unavailable");

        }
        else
        {
            rowSeatNumberAvailable = seat.get(0);
            chairSeatRow =seat.get(1);

            //Create order
            order = new Order(this.movieDisplayed.getMovieName(),this.auditoriumNum,customer.checkForDiscount(30), rowSeatNumberAvailable,chairSeatRow);
        }
.

        return order;
    }


}
