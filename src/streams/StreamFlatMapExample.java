package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamFlatMapExample {


    //print all activities
    public static List<String> printActivities(){

        return StudentDataBase.getAllStudents().stream()   //Stream<Student>
                .map(Student::getActivities)       //Stream<List<String>>
                .flatMap(List::stream)             //Stream<String>
                .collect(toList());
    }

    //print all unique activities
    public static Set<String> printUniqueActivities(){

        return StudentDataBase.getAllStudents().stream()   //Stream<Student>
                .map(Student::getActivities)       //Stream<List<String>>
                .flatMap(List::stream)             //Stream<String>
                .collect(toSet());
    }

    public static void main(String[] args) {

        System.out.println(printActivities());

        System.out.println(printUniqueActivities());

    }


}
