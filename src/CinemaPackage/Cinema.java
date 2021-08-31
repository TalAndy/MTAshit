package CinemaPackage;

import People.Customer;
import People.Employee;
import auditorium.Auditorium;

import java.util.ArrayList;

public class Cinema  {
    String cinemaName;
    ArrayList<Employee> employeesList;
    ArrayList<Customer> customerList;
    Movie[] moviesArray;
    Auditorium[] auditoriumArray;

    public Cinema(String cinemaName, int moviesArrayLegnth, int auditoriumArrayLength) {
        this.cinemaName = cinemaName;
        this.employeesList = new ArrayList<Employee>();
        this.customerList = new ArrayList<Customer>();
        this.moviesArray = new Movie[moviesArrayLegnth];
        this.auditoriumArray = new Auditorium[auditoriumArrayLength];
    }

    public void addNewMovie(Movie movieToAdd){

        // Check if movie exist in our DBs.
        if(isMovieExist(movieToAdd.movieName)){
            System.out.println("Movie already exist, nothing to add. Exiting....");
            return;
        }
        // get the latest available index in the movie list.
        int availableMovieIndex = returnMovieLastIndex();

        if (availableMovieIndex == -1){
            System.out.println("Movie array is full! please delete a movie and try to add a movie again, later. Exiting...");
            return;
        }
        //
        long ratio = roundUp(moviesArray.length, auditoriumArray.length);
        int indexToAdd = -1;
        for (int i = 0; i <= ratio; i++){
            // add a new movie to the first avaible auditorium:
            // if we got -1 that mean we cannot add this movie.
            indexToAdd = returnAuditoriumLatestIndex();
            if (indexToAdd == -1){
                System.out.format("Movie already added %d times out of maximum %d, no more avaible auditorium. Exiting", i, ratio);
                return;
            }
        }

    }


    public int returnMovieLastIndex(){
        int index = 0;
        // If the list is empty return 0 as first index available
        if (moviesArray[0] == null){
            return 0;
        }

        // Search for the first null appearance
        for (Movie movie : moviesArray) {
            if (movie == null){
                return index;
            }
            index++;
        }

        // If the list is full, return non exist index as false:
        return -1;

    }

    public boolean isMovieExist(String movieToCheck){
        for (Movie movie : moviesArray) {
            if (movie.movieName.equals(movieToCheck)){
                return true;
            }
        }
        return false;
    }

    public int returnAuditoriumLatestIndex(){
        int index = 0;

        // If the list is empty return 0 as first index available
        if (auditoriumArray[0] == null){
            return 0;
        }
        // // Search and return the first auditorium without movie name
        for (Auditorium auditorium : auditoriumArray) {
            if (auditorium.getMovieDisplayed().movieName.equals("")){
                return index;
            }
            index++;
        }

        // All the auditorium in our auditorium array has movies name, which means there is no availble auditorium. return -1 as false
        return -1;
    }

    public static long roundUp(long num, long divisor) {
        return (num + divisor - 1) / divisor;
    }







}
