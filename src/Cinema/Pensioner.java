package Cinema;

public class Pensioner extends Customer{

    public Pensioner(String name, int ID, String mailAddress, String phone, int age) {
        super(name, ID, mailAddress, phone, age);
    }

    @Override
    public double checkForDiscount(int price){
        return price*0.333;
    }


}
