package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    //creating function based on our requirement
    //1. mapping all students
    static Function<List<Student>, Map<String, Double>> mapper = students -> {
        Map<String, Double> map = new HashMap<>();

        students.forEach(student -> {
            map.put(student.getName(), student.getGpa());
        });
        return map;
    };

    //2. mapping students who have gradeLevel >= 3
    static Function<List<Student>, Map<String, Double>> mapper1 = students -> {
        Map<String, Double> map = new HashMap<>();

        students.forEach(student -> {
            //reusing the code
            if(PredicateStudentExample.p1.test(student)){
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    };


    public static void main(String[] args) {

        System.out.println("Mapping all students : ");
        System.out.println(mapper.apply(StudentDataBase.getAllStudents()));

        System.out.println("Mapping all students who have gradeLevel >= 3 : ");
        System.out.println(mapper1.apply(StudentDataBase.getAllStudents()));

    }
}
