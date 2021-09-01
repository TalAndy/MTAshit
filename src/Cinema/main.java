package Cinema;

import CinemaPackage.*;
import People.*;
import auditorium.Auditorium;
import auditorium.SmallAuditorium;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome To Badli and Endelman Theater! ");
        Cinema newCinema = new Cinema("YesPlant Holon", 6, 14);

        //Create new employees
        Employee employee1 = new Employee("peleg", 18, "peleg@tomer.com", "2456", 19);
        Employee employee2 = new Employee("neta", 19, "neta@tomer.com", "2456", 22);
        Employee employee3 = new Employee("shmulik", 20, "shmulik@tomer.com", "2456", 18);
        Employee employee4 = new Employee("barel", 21,"barel@tomer.com", "2456", 23);
        Employee employee5 = new Employee("tal", 22, "tal@tomer.com", "2456", 16);
        newCinema.addEmployee(employee1);
        newCinema.addEmployee(employee2);
        newCinema.addEmployee(employee3);
        newCinema.addEmployee(employee4);
        newCinema.addEmployee(employee5);

        //Add employee to cinema
        System.out.println(newCinema.toString());

        Customer customer1 = new Customer("tal", 10, "tal", "0514253647", 23);
        Customer customer2 = new Customer("niv", 11, "tal", "0523699857", 24);
        Customer customer3 = new Customer("omri", 12, "tal", "0523699857", 32);
        Customer customer4 = new Customer("sapir", 13, "tal", "0523649857",12);
        Customer customer5 = new Customer("eden", 14, "tal", "0523655857", 42);
        Soldier niv = new Soldier("Niv", 15, "tal", "0123", 19, "1.9.2018");
        Student omri = new Student("Omri", 16, "tal", "0123", 25, "5.4.20", "1.8.22");
        Pensioner shira = new Pensioner("shira",17, "shira@gmail.com","0738446253",62);

        newCinema.





//        ArrayList<Employee> employeeList  = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        employeeList.add(employee5);

//        System.out.println("Employees list contains " + employeeList.size() + "employees");
//        System.out.println("and those are the following employees: ");
//        for (Employee employee : employeeList) {
//            System.out.print(employee.getName() + " ");
//        }

        //Create new movie
//        Movie movieC1 = new comedyMovie("lifeByTal",140);
//        Movie movieC2 = new comedyMovie("thePrince",113);
//        Movie movieH1 = new horrorMovie("killTal",100);
//        Movie movieH2 = new horrorMovie("codeWithUs",110);
//        Movie movieT1 = new thrillMovie("run",98);
//        Movie movieT2 = new thrillMovie("talAtTheNight",109);
//        ArrayList<Movie> movieList  = new ArrayList<>();
//        movieList.add(movieC1);
//        movieList.add(movieC2);
//        movieList.add(movieH1);
//        movieList.add(movieH2);
//        movieList.add(movieT1);
//        movieList.add(movieT2);
//        System.out.println("\nWe currently have " + movieList.size() + " in our catalog. the movies names are: ");
//        for (Movie movie : movieList) {
//            System.out.println("The " + movie.getGenre() + " movie: " + movie.getMovieName());
//        }
//
//        for (Movie movie : movieList) {
//            System.out.println("Adding movie: " + movie.getMovieName() + " to the movies list");
//            newCinema.addNewMovie(movie);
//        }

        System.out.println("Done adding movies!");
        Auditorium[] auditoriumArray = newCinema.getAuditoriumArray();
        for (Auditorium auditorium : auditoriumArray) {
            if (auditorium.getMovieDisplayed()==null)
            {
                System.out.println("Auditorium number " + auditorium.getAuditoriumNum() + " plays no movie because we dont have.");
            }
            else{
            System.out.println("Auditorium number " + auditorium.getAuditoriumNum() + " plays movie " + auditorium.getMovieDisplayed().getMovieName());
        }
    }
        //Create new Cinema
        Cinema yesBadli = new Cinema("yesBadli",movieList.size(),auditoriumArray.length);
        System.out.println(yesBadli.toString());








//        System.out.println();
//        System.out.println("The popcorn price is");
//



}
}

