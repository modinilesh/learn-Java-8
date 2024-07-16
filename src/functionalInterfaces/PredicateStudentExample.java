package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    //fetch all students
    static List<Student> students = StudentDataBase.getAllStudents();

    //create predicates as per requirements
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    //filter students by grade level
    public static void filterStudentsByGradeLevel(){
        System.out.println("Filtering students by grade level : ");
        students.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    //filter students by gps level
    public static void filterStudentsByGpaLevel(){
        System.out.println("Filtering students by GPA level : ");
        students.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    //filter students by grade level
    public static void filterStudentsByGradeAndGpaLevel(){
        System.out.println("Filtering students by grade and gpa level : ");
        students.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    //fetch all students who are not having gpa>=3.9 and grade level >= 3
    public static void filterStudentsByGradeAndGpaLevel2(){
        System.out.println("Filtering students by grade and gpa level-2 : ");
        students.forEach(student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }


    public static void main(String[] args) {

        filterStudentsByGradeLevel();
        System.out.println();

        filterStudentsByGpaLevel();
        System.out.println();

        filterStudentsByGradeAndGpaLevel();
        System.out.println();

        filterStudentsByGradeAndGpaLevel2();
        System.out.println();

    }
}
