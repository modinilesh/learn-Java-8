package streams;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample1 {

    public static void main(String[] args) {

        //way1
        Map<String, List<String>> listMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));

        System.out.println(listMap);

        //way2
        Map<String, List<String>> listMap1 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(listMap1);

    }

}
