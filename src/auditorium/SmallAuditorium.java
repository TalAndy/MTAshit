package auditorium;

import Cinema.Order;
import CinemaPackage.Movie;
import People.Customer;
import People.Person;

public class SmallAuditorium extends Auditorium {

    public SmallAuditorium(int auditoriumNum, Movie movieDisplayed) {
        super(auditoriumNum, movieDisplayed);
        seatsArr = new boolean[8][10];
        resetSeatsArr(seatsArr);
    }

    @Override
    public Order buyTicket(Customer customer) {
        Order order = new Order(this.movieDisplayed.getMovieName(),this.auditoriumNum,customer.checkForDiscount(30));
//        getMovieDisplayed(move);

        return order;
    }


}
