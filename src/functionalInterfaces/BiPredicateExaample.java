package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExaample {

    //fetch all students
    static List<Student> studentList = StudentDataBase.getAllStudents();

    //create BiPredicate based on conditions
    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpaLevel) -> gradeLevel>=3 && gpaLevel>=3.9;

    //create BiConsumer to consume two features names, activities
    static BiConsumer<String, List<String>> studentConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    //create a Consumer to print the details
    static Consumer<Student> c = (student) -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
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
