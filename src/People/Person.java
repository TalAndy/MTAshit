package People;

public class Person {
    String name;
    int ID;
    String mailAddress;
    String phone;
    int age;

    public Person(String name, int ID, String mailAddress, String phone, int age) {
        this.name = name;
        this.ID = ID;
        this.mailAddress = mailAddress;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
