package People;
// Niv Badli and Tal Endelman

public class Soldier extends Customer {
    String releaseData;


    public Soldier(String name, int ID, String mailAddress, String phone, int age, String releaseData) {
        super(name, ID, mailAddress, phone, age);
        this.releaseData = releaseData;
    }

    @Override
    public double checkForDiscount(int price){
        return 0;
    }
}
