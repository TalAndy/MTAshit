package CinemaPackage;

import java.util.ArrayList;
import java.util.Random;

public class Customer {
    String name;
    int ID;
    String mailAddress;
    String phone;
    int age;

    public Customer(String name,int ID,String mailAddress,String phone,int age){
        this.name = name;
        this.ID = ID;
        this.mailAddress = mailAddress;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Movie getRandomMovie(ArrayList<Movie> moviesList)
    {
        if(moviesList.isEmpty())
        {
            System.out.println("The movies list is empty");
            return null;
        }

        Random rand = new Random();
        return moviesList.get(rand.nextInt(moviesList.size()));
    }

    public Movie chooseMovie(ArrayList<Movie> moviesList)
    {
        Movie randomMovie = getRandomMovie(moviesList);
        boolean checkAge = randomMovie.viewRestriction(this);

        while(!checkAge)
        {
            randomMovie = getRandomMovie(moviesList);
            checkAge = randomMovie.viewRestriction(this);
        }

        return randomMovie;
    }

    public String getRandomPopcornSize()
    {
        String[] popcornSizesList = {"Big","Medium","Small"};
        Random r= new Random();
        return popcornSizesList[r.nextInt(popcornSizesList.length)];
    }


}
