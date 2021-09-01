package People;

import Cinema.Order;
import CinemaPackage.Movie;
import CinemaPackage.thrillMovie;
import auditorium.Auditorium;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee extends Customer{
    int[] daysWorked = new int[30];
    int hourlySalary = 0;

    public Employee(String name, int ID, String mailAddress, String phone, int age) {
        super(name, ID, mailAddress, phone, age);
    }

    public double salePopcorn(String size, Customer customer){ // size = L, M, or S.
        int small=20;
        int meduim = 30;
        int large = 40;

        if (size.equals("Small")){
            return customer.checkForDiscount(small);
        }
        if (size.equals("Medium")){
            return customer.checkForDiscount(meduim);
        }
        if (size.equals("Large")){
            return customer.checkForDiscount(large);
        }
        System.out.println("Size doesn't found! return 0....");
        return 0;
    }


    public Order saleTicket(Customer customer, Movie movie,Auditorium[] auditorium)
    {
        Customer customerWantBuyTicket = new Customer;
        String movieName = movie.getMovieName();
        int auditoriumNum = -1;
        boolean movieFound = false;
        Order newOrder = null;
        int index=0;

        for (index=0;index<auditorium.length;index++)
        {
            if(auditorium[index].equals(movie))
            {
                auditoriumNum = auditorium[index].getAuditoriumNum();

            }
        }

        //Its mean movie not found
        if(auditoriumNum == -1)
        {
            System.out.println("We are sorry the movie is not found");
            return null;
        }

        newOrder = auditorium[index].buyTicket(customerWantBuyTicket);
        return newOrder;
    }

    public double calcSalary(){
        int salary =0;
        for (int hoursInDay : daysWorked) {
            salary += hoursInDay*hourlySalary;
        }
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return this.ID == employee.ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }


}
