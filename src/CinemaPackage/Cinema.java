package CinemaPackage;

public class Cinema  {
    int numberOfCinema;
    Movie movieDisplayed;
    boolean[][] seats;

    public Cinema(int numberOfCinema, Movie movieDisplayed, boolean[][] seats) {
        this.numberOfCinema = numberOfCinema;
        this.movieDisplayed = movieDisplayed;
        this.seats = seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    public boolean freeSeat(boolean[][] seats)
    {

        boolean isFreeSeat = False;
        int row = seats.length;
        int column = seats[0].length;



    }


}
