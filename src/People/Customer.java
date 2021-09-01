package People;

import CinemaPackage.Movie;

import java.util.ArrayList;
import java.util.Random;

public class Customer extends Person implements ICustomer {

    public Customer(String name, int ID, String mailAddress, String phone, int age){
        super(name, ID, mailAddress, phone, age);
    }

    public Movie chooseMovie(ArrayList<Movie> moviesList){
        if (moviesList.isEmpty()){
            System.out.println("Movies list is empty, Exiting.... ");
            return null;
        }

        if (moviesList.size()==1){
            if (moviesList.get(0).viewRestriction(this)) {
                return moviesList.get(0);
            }
            System.out.println("Movies list contains 1 movie and the customer is not qualified to watch it, Exiting.... ");
        }
        // If we got here - we have more then 2 movies in the list.
        return getRandomMovie(moviesList);
    }

    public Movie getRandomMovie(ArrayList<Movie> moviesList) {
        // we assume we have at least 1 movie in list, so before entering the loop
        Random rand = new Random();
        Movie randomMovie = moviesList.get(rand.nextInt(moviesList.size()));

        // if randomMovie.viewRestriction (0, 16 or 18) is bigger then the customer current Age (0-100),
        // we need to random another movie and check it. only when this condition is false -
        // we will return the movie.

        while (!(randomMovie.viewRestriction(this))){
            randomMovie = moviesList.get(rand.nextInt(moviesList.size()));
        }

        // If we got here, the condition is false

        return randomMovie;
    }

    public String randomPopcorn() {
        String[] list = {"Small", "Medium", "Large"};
        Random r = new Random();
        return list[r.nextInt(list.length)];
    }

    public double checkForDiscount(int price){
        return price;
    }



}



