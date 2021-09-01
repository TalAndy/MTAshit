package CinemaPackage;
// Niv Badli and Tal Endelman

import People.Customer;

public class comedyMovie extends Movie{

    public comedyMovie(String movieName, int duration) {
        super(movieName, duration, "Comedy");
    }

    public boolean viewRestriction(Customer customer){
        return true;
    }
}
