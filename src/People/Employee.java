package People;

public class Employee extends Person{
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
}
