package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;

public class BigAuditorium extends Auditorium {

    public BigAuditorium(int auditoriumNum, Movie movieDisplayed) {
        super(auditoriumNum, movieDisplayed);
        seatsArr = new boolean[16][20];
        resetSeatsArr(seatsArr);
    }

    @Override
    public Order buyTicket(Customer customer) {
        Order order = new Order(this.movieDisplayed.getMovieName(),this.auditoriumNum, customer.checkForDiscount(30));

        return order;
    }


}
