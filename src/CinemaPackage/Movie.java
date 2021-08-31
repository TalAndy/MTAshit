package CinemaPackage;

public abstract class Movie {

    String movieName;
    int duration;
    String genre;

    public Movie(String movieName, int duration,String genre) {
        this.movieName = movieName;
        this.duration = duration;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public abstract boolean viewRestriction(Customer customer);

    public boolean equals(Movie movieToCheck) {
        return movieToCheck.movieName.equals(getMovieName());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
