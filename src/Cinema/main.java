package Cinema;

import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;

public class main {
    public static void main(String[] args) {
    Customer andy = new Customer("tal", 10, "tal", "0123", 12);
    Soldier niv = new Soldier("Niv", 11, "tal", "0123", 19, "1.9.2018");
    Student omri = new Student("Omri", 12, "tal", "0123", 19, "5.4.20", "1.8.22");
    Employee tomer = new Employee("Tomer", 14, "tomer@tomer.com", "2456", 22);
    System.out.println("The popcorn price is");
    System.out.println(tomer.salePopcorn("small", niv));
    System.out.println(tomer.salePopcorn("large", omri));


//    andy.equals(niv);

    }
}

