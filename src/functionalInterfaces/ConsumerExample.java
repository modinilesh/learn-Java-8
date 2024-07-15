package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //for code optimization or reusability of code
    //fetching all students
    static List<Student> studentList = StudentDataBase.getAllStudents();

    //creating Consumer object of student
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());



    /**
     * q2. write code to print all students using consumer interface and lambda expression
     */
    public static void printAllStudents(){

        //printing the data
        studentList.forEach(c2);
        System.out.println("***************************************");
    }


    /**
     * q3. write code to print all student's name using consumer interface and lambda expression
     */
    public static void printName(){

        //printing the data
        studentList.forEach(c3);
        System.out.println("***************************************");

    }

    /**
     * q4. write code to print all student's name and activities using consumer interface and lambda expression
     */
    public static void printNameAndActivities(){

        //printing the data
        studentList.forEach(c3.andThen(c4)); //consumer chaining
        System.out.println("***************************************");

    }

    /**
     * q5. write code to print all student's name & activities
     * who has gradeLevel >= 3 && gpa >= 3.9
     * using consumer interface and lambda expression
     */
    public static void printNameAndActivitiesWithCondition(){

        //printing the data
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c3.andThen(c4).accept(student);
            }
        });
        System.out.println("***************************************");

    }


    public static void main(String[] args) {
        /**
         * basic implementation using lambdas
         * q1. write code to convert string to Uppercase
         */
        Consumer<String> c1 = (s) -> {
            System.out.println(s.toUpperCase());
        };
        c1.accept("nilesh");
        System.out.println("***************************************");

        //ans of q2
        printAllStudents();

        //ans of q3
        printName();

        //ans of q4
        printNameAndActivities();

        //ans of q5
        printNameAndActivitiesWithCondition();

    }

}
