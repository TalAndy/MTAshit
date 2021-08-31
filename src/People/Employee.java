package People;

import CinemaPackage.Movie;

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

    public String saleTicket(Customer customer, Movie movie){
        

        return "0";
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
