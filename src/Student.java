/**
 * definition of class Student.
 * It holds data for id, age and name of a student.
 * An important principle of OOP is data encapsulation,
 * which means to define private fields and have get/set methods
 * for accessing the fields.
 * */
public class Student {
    /*
    * The fields of a class represent certain
    * qualities that an object could have.
    * In this casse - id, age and name are private fields of the class.
    * */
    private int id;
    private int age;
    private String name;


    /*
    * get and set methods for the fields
    * */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
