package Cinema;

public class Movie {
    String movieName;
    int viewRestriction;
    int duration;
    String genre;

    public Movie(String movieName, String genre, int length) {
        this.movieName = movieName;
        this.genre = genre;
        this.duration = length;
        this.viewRestriction = getRestriction(genre);
    }

    private int getRestriction(String genre){
        if (genre.equals("Thrill")){
            return 16;
        }
        if (genre.equals("Horror")){
            return 18;
        }
        return 0;
    }

    public String getMovieName() {
        return movieName;
    }

    public boolean checkAgePermission(Customer customer){
        return this.viewRestriction <= customer.getAge();
//        return getRestriction(genre) <= customer.getAge();
    }

//    @Override
    public boolean equals(Movie movieToCheck){
        return this.movieName.equals(movieToCheck.getMovieName());
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", viewRestriction=" + viewRestriction +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
