package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    //map all students name in a List and set
    public static List<String> namesList(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toList());
    }

    //Uppercase
    public static List<String> namesListUpperCase(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    //store in set
    public static Set<String> namesSet(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toSet());
    }

    public static void main(String[] args) {

        //getStudents name
        System.out.println(namesList());

        //getStudents name Uppercasecontro
        System.out.println(namesListUpperCase());

        //getStudents in set
        System.out.println(namesSet());

    }

}
