package CinemaPackage;

public class horrorMovie extends Movie {


    public horrorMovie(String movieName, int duration) {
        super(movieName, duration, "Horror");
    }

    public boolean viewRestriction(Customer customer){
        return customer.age >= 18;
    }
}
