package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    //create consumer
    //className :: method
    static Consumer<Student> c1 = System.out::println;

    //className :: instanceMethod
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {

        //printing all students
        StudentDataBase.getAllStudents().forEach(student -> c1.accept(student));

        //printing all activities per student
        StudentDataBase.getAllStudents().forEach(student -> c2.accept(student));

    }
}
