package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    //creating BiFunction
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    };


    public static void main(String[] args) {

        //without changing in code, we will be able to achieve our requirements based on input changes

        //filtering & mapping based on gradeLevel>=3
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));

        //filtering & mapping based on gpa>=3.9
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));

    }
}
