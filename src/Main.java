import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* creating an object Student*/
        Student student1 = new Student();
        //using the set methods to set data to the object's fields
        student1.setName("Stoqn");
        student1.setId(12);
        student1.setAge(39);

        Student student2 = new Student();
        student2.setId(-12);
        student2.setAge(13);
        student2.setName("Ivan");

        Student student3 = new Student();
        student3.setId(1);
        student3.setAge(22);
        student3.setName("Georgi");

        //using constructor with parameters:
        StudentWithConstructor student4 = new StudentWithConstructor(2132, 33, "Peter");

        //printing the data of a Student object to the console:
        System.out.println(student1.getId() + " " + student1.getName() + ", " + student1.getAge());

        //creating a List with Studet objects:
        List<Student> list = new LinkedList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //searching for Student with id '1' and changing its age to 22 years
        for (Student s :
                list) {
            if (s.getId() == 1) {
                s.setAge(22);
            }
        }

        //printing the info of every student in the list:
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + ", age: " + s.getAge());
        }

    }


}