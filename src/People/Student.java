package People;
// Niv Badli and Tal Endelman

public class Student extends Customer{
    protected String academicInstitution;
    protected String graduationDate;


    public Student(String name, int ID, String mailAddress, String phone, int age, String academicInstitution ,String graduationDate){
        super(name, ID, mailAddress, phone, age);
        this.academicInstitution = academicInstitution;
        this.graduationDate = graduationDate;
    }

    @Override
    public double checkForDiscount(int price){
        return price*0.5;
    }

}


