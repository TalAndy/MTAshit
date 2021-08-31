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

    public Cinema(String cinemaName, ArrayList<Employee>, int moviesArrayLegnth, int auditoriumArrayLength) {
        this.cinemaName = cinemaName;
        this.employeesList = new ArrayList<Employee>;
        this.customerList = new ArrayList<Customer>;
        this.moviesArray = new Movie[moviesArrayLegnth];
        this.auditoriumArray = new Auditorium[auditoriumArrayLength];
    }

    public void addNewMovie(Movie movieToAdd){

        // Add to check if movie is exist

        int avaiavailableMovieIndex = returnMovieLastIndex();

        if (avaiavailableMovieIndex == -1){
            System.out.println("Movie array is full! please delete a movie and try to add a movie again, later. EXITING...");
            return;
        }
        // need to add movie to audt

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

    public int returnAuditoriumLatestIndex(){

    }







}
