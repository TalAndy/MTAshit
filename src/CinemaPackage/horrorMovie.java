package CinemaPackage;
// Niv Badli and Tal Endelman

import People.Customer;

public class horrorMovie extends Movie {


    public horrorMovie(String movieName, int duration) {
        super(movieName, duration, "Horror");
    }

    public boolean viewRestriction(Customer customer){
        return customer.getAge() >= 18;
    }
}
