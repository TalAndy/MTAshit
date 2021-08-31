package CinemaPackage;

public class Movie {

    String movieName;
    int viewRestriction;
    int duration;
    String genre;

    public Movie(String movieName, int duration,String genre) {
        this.movieName = movieName;
        this.duration = duration;
        this.genre = genre;
        this.viewRestriction = getViewRestriction(genre);
    }

    private int getViewRestriction(String genre)
    {
        if (genre.equals("Horror"))
        {
            return 18;
        }
        if (genre.equals("thriller")) {
            return 16;
        }
        return 0;
    }

    public String getMovieName() {
        return movieName;
    }

    public boolean viewRestriction(Customer customer)
    {
        return customer.getAge() >= getViewRestriction(genre);
    }

    public boolean equals(Movie movieToCheck) {
        return movieToCheck.movieName.equals(getMovieName());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", viewRestriction=" + getViewRestriction(genre) +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
