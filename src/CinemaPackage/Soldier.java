package CinemaPackage;

public class Soldier extends Customer {

    String releaseDate;


    public Soldier(String name, int ID, String mailAddress, String phone, int age,String releaseDate) {
        super(name, ID, mailAddress, phone, age);
        this.releaseDate = releaseDate;
    }

}
