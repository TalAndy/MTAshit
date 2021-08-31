package CinemaPackage;

public class Student extends Customer  {

    String academicInstitution;
    String graduationDate;

    public Student(String name, int ID, String mailAddress, String phone, int age,String academicInstitution,String graduationDate) {
        super(name, ID, mailAddress, phone, age);
        this.academicInstitution = academicInstitution;
        this.graduationDate = graduationDate;
    }
}
