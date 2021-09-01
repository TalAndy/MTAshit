package Cinema;
// Niv Badli and Tal Endelman

import CinemaPackage.*;
import People.*;
import auditorium.Auditorium;
import auditorium.SmallAuditorium;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        /*
        יש ליצור אובייקט של בית קולנוע עם פרמטרים לבחירתכם.
         לאחר מכן יש לבצע הוספת סרטים (לפחות אחד מכל סוג), הוספת לקוחות (לפחות אחד מכל סוג) והוספת עובדים.
        הדפיסו את פרטי בית הקולנוע. בצעו 3 פעולות של רכישת כרטיסים, 3 פעולות מכירת פופקורן ועדכון סרט אחד חדש לבחירתכם.
         */
        System.out.println("Welcome To Badli and Endelman Theater! ");
        Cinema yesPlanetFrishman = new Cinema("YesPlant Frishman", 6, 14);

        // Create new employees
        Employee employee1 = new Employee("peleg", 18, "peleg@tomer.com", "2456", 19);
        Employee employee2 = new Employee("neta", 19, "neta@tomer.com", "2456", 22);
        Employee employee3 = new Employee("shmulik", 20, "shmulik@tomer.com", "2456", 18);
        Employee employee4 = new Employee("barel", 21,"barel@tomer.com", "2456", 23);
        Employee employee5 = new Employee("tal", 22, "tal@tomer.com", "2456", 16);
        yesPlanetFrishman.addEmployee(employee1);
        yesPlanetFrishman.addEmployee(employee2);
        yesPlanetFrishman.addEmployee(employee3);
        yesPlanetFrishman.addEmployee(employee4);
        yesPlanetFrishman.addEmployee(employee5);

        // Should failed - cannot add employee that already exist in our system
        yesPlanetFrishman.addEmployee(employee1);

        // We have 5 employees so far
        System.out.println("Current status:");
        System.out.println(yesPlanetFrishman.toString());

        Customer customer1 = new Customer("tal", 10, "tal", "0514253647", 23);
        Customer customer2 = new Customer("niv", 11, "tal", "0523699857", 24);
        Customer customer3 = new Customer("omri", 12, "tal", "0523699857", 32);
        Customer customer4 = new Customer("sapir", 13, "tal", "0523649857",12);
        Customer customer5 = new Customer("eden", 14, "tal", "0523655857", 42);
        Soldier niv = new Soldier("Niv", 15, "tal", "0123", 19, "1.9.2018");
        Student omri = new Student("Omri", 16, "tal", "0123", 25, "5.4.20", "1.8.22");
        Pensioner shira = new Pensioner("shira",17, "shira@gmail.com","0738446253",62);

        yesPlanetFrishman.addCustomer(customer1);
        yesPlanetFrishman.addCustomer(customer2);
        yesPlanetFrishman.addCustomer(customer3);
        yesPlanetFrishman.addCustomer(customer4);
        yesPlanetFrishman.addCustomer(customer5);
        yesPlanetFrishman.addCustomer(niv);
        yesPlanetFrishman.addCustomer(omri);
        yesPlanetFrishman.addCustomer(shira);
        // Should failed
        yesPlanetFrishman.addCustomer(niv);

        // We have 5 employees and 8 customers so far
        System.out.println("Current status:");
        System.out.println(yesPlanetFrishman.toString());

        Movie movieC1 = new comedyMovie("lifeByTal",140);
        Movie movieC2 = new comedyMovie("thePrince",113);
        Movie movieH1 = new horrorMovie("killTal",100);
        Movie movieH2 = new horrorMovie("codeWithUs",110);
        Movie movieT1 = new thrillMovie("run",98);
        Movie movieT2 = new thrillMovie("talAtTheNight",109);
        ArrayList<Movie> movieList  = new ArrayList<>();
        movieList.add(movieC1);
        movieList.add(movieC2);
        movieList.add(movieH1);
        movieList.add(movieH2);
        movieList.add(movieT1);
        movieList.add(movieT2);

        System.out.println("\n We currently have " + movieList.size() + " in our catalog. the movies names are: ");
        for (Movie movie : movieList) {
            System.out.println("The " + movie.getGenre() + " movie: " + movie.getMovieName());
        }

        for (Movie movie : movieList) {
            System.out.println("Adding movie: " + movie.getMovieName() + " to the movies list");
            yesPlanetFrishman.addNewMovie(movie);
        }

        System.out.println("Done adding movies!");
        Auditorium[] auditoriumArray = yesPlanetFrishman.getAuditoriumArray();
        for (Auditorium auditorium : auditoriumArray) {
            if (auditorium.getMovieDisplayed()==null)
            {
                System.out.println("Auditorium number " + auditorium.getAuditoriumNum() + " plays no movie because we dont have any movies to present.");
            }
            else{
            System.out.println("Auditorium " + auditorium.getAuditoriumNum() + " size " + auditorium.getClass() + " plays movie " + auditorium.getMovieDisplayed().getMovieName());
        }
    }

//        yesPlanetFrishman.randomTicketSell();
        yesPlanetFrishman.randomPopcornSell();
        yesPlanetFrishman.randomPopcornSell();
        yesPlanetFrishman.randomPopcornSell();
        Movie newHorrorMovie = new horrorMovie("nivCodingJava",109);
        yesPlanetFrishman.updateMovie("lifeByTal", newHorrorMovie);







    }
}

