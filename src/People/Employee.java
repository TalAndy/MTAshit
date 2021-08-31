package People;

import Cinema.Movie;

import java.util.ArrayList;
import java.util.Random;

public class Employee extends Person implements ICustomer{
    int[] daysWorked = new int[30];
    int hourlySalary = 0;


    public Employee(String name, int ID, String mailAddress, String phone, int age) {
        super(name, ID, mailAddress, phone, age);
    }

    public double salePopcorn(String size, Customer customer){ // size = L, M, or S.
        int small=20;
        int meduim = 30;
        int large = 40;

        if (size.equals("small")){
            return customer.checkForDiscount(small);
        }
        if (size.equals("meduim")){
            return customer.checkForDiscount(meduim);
        }
        if (size.equals("large")){
            return customer.checkForDiscount(large);
        }
        System.out.println("Size doesn't found! return 0....");
        return 0;
    }

    @Override
    public double checkForDiscount(int price) {
        return price;
    }

    @Override
    public String randomPopcorn() {
        String[] list = {"Small", "Medium", "Large"};
        Random r = new Random();
        return list[r.nextInt(list.length)];
    }

    @Override
    public Movie getRandomMovie(ArrayList<Movie> moviesList) {
        // we assume we have at least 1 movie in list, so before entering the loop
        Random rand = new Random();
        Movie randomMovie = moviesList.get(rand.nextInt(moviesList.size()));

        // if randomMovie.viewRestriction (0, 16 or 18) is bigger then the customer current Age (0-100),
        // we need to random another movie and check it. only when this condition is false -
        // we will return the movie.

        while (!(randomMovie.viewRestriction < getAge())){
            randomMovie = moviesList.get(rand.nextInt(moviesList.size()));
        }

        // If we got here, the condition is false

        return randomMovie;
    }
}
