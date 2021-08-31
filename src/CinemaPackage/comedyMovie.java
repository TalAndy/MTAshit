package CinemaPackage;

public class comedyMovie extends Movie{

    public comedyMovie(String movieName, int duration) {
        super(movieName, duration, "Comedy");
    }

    public boolean viewRestriction(Customer customer){
        return true;
    }
}
