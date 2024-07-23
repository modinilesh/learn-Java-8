package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    //fetch all students
    static List<Student> studentList = StudentDataBase.getAllStudents();

    //create predicate based on conditions
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    //create BiConsumer to consume two features names, activities
    static BiConsumer<String, List<String>> studentConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    //create a Consumer to print the details
    static Consumer<Student> c = (student) -> {
        if(p1.and(p2).test(student)){
            studentConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printData(){
        studentList.forEach(c);
    }

    public static void main(String[] args) {
        printData();
    }
}
