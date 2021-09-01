package Cinema;

import CinemaPackage.*;
import People.*;
import auditorium.Auditorium;
import auditorium.SmallAuditorium;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        //Create new employees
        Employee employee1 = new Employee("peleg", 18, "peleg@tomer.com", "2456", 19);
        Employee employee2 = new Employee("neta", 19, "neta@tomer.com", "2456", 22);
        Employee employee3 = new Employee("shmulik", 20, "shmulik@tomer.com", "2456", 18);
        Employee employee4 = new Employee("barel", 21,"barel@tomer.com", "2456", 23);
        Employee employee5 = new Employee("tal", 22, "tal@tomer.com", "2456", 16);
        ArrayList<Customer> employeeList  = new ArrayList<>(5);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);


        //Create new movies
        Movie movieC1 = new comedyMovie("lifeByTal",140);
        Movie movieC2 = new comedyMovie("thePrince",113);
        Movie movieH1 = new horrorMovie("killTal",100);
        Movie movieH2 = new horrorMovie("codeWithUs",110);
        Movie movieT1 = new thrillMovie("run",98);
        Movie movieT2 = new thrillMovie("talAtTheNight",109);
        ArrayList<Movie> movieList  = new ArrayList<>(6);
        movieList.add(movieC1);
        movieList.add(movieC2);
        movieList.add(movieH1);
        movieList.add(movieH2);
        movieList.add(movieT1);
        movieList.add(movieT2);

        //Create new auditoriums
//        Auditorium smallAuditorium1 = new SmallAuditorium(1,"talAtTheNight");
        //Create new Cinema
        //Cinema yesBadli = new Cinema("yesBadli",employeeList);
        System.out.println("Welcome To Badli and Endelman Theater! ");
        //Cinema yesBadli = new Cinema("yesBadli",);

        Customer customer1 = new Customer("tal", 10, "tal", "0514253647", 23);
        Customer customer2 = new Customer("niv", 11, "tal", "0523699857", 24);
        Customer customer3 = new Customer("omri", 12, "tal", "0523699857", 32);
        Customer customer4 = new Customer("sapir", 13, "tal", "0523649857",12);
        Customer customer5 = new Customer("eden", 14, "tal", "0523655857", 42);
        Soldier niv = new Soldier("Niv", 15, "tal", "0123", 19, "1.9.2018");
        Student omri = new Student("Omri", 16, "tal", "0123", 25, "5.4.20", "1.8.22");
        Pensioner shira = new Pensioner("shira",17, "shira@gmail.com","0738446253",62);


        System.out.println();
        System.out.println("The popcorn price is");




}
}

