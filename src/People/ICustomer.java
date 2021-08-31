package People;

import Cinema.Movie;

import java.util.ArrayList;

public interface ICustomer {

    public double checkForDiscount(int price);
    public String randomPopcorn();
    public Movie getRandomMovie(ArrayList<Movie> moviesList);

}
