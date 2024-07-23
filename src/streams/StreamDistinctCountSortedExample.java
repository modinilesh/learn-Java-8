package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctCountSortedExample {

    //print all unique activities
    public static List<String> printDistinctActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    //count all unique activities
    public static Long getDistinctActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    //sort all unique activities
    public static List<String> sortDistinctActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println("Distinct activities : " + printDistinctActivities());
        System.out.println("Count of distinct activities : "+ getDistinctActivitiesCount());
        System.out.println("Sorted distinct activities : "+ sortDistinctActivities());
    }
}
