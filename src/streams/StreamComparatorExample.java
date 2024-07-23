package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    //Sort all students based on their names
    public static List<Student> getSortedListByNames(){

        //way 1
//        return StudentDataBase.getAllStudents().stream()
//                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
//                .collect(Collectors.toList());

        //way 2
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        //for descending order
        /**
         * return StudentDataBase.getAllStudents().stream()
         *                 .sorted(Comparator.comparing(Student::getName).reversed())
         *                 .collect(Collectors.toList());
         */

    }

    //Sort all students based on their gpa
    public static List<Student> getSortedListByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Sorted Students by Name : "+ getSortedListByNames());
        System.out.println("Sorted Students by GPA : "+ getSortedListByGpa());

    }
}
