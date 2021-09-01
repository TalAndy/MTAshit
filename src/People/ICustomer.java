package People;

import CinemaPackage.Movie;

import java.util.ArrayList;

public interface ICustomer {

    public double checkForDiscount(int price);
    public String randomPopcorn();
    public Movie getRandomMovie(ArrayList<Movie> moviesList);

}
