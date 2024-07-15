package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * q2. write code to print all students using consumer interface and lambda expression
     */
    public static void printAllStudents(){

        //fetching all students
        List<Student> studentList = StudentDataBase.getAllStudents();

        //creating Consumer object of student
        Consumer<Student> c2 = (student) -> {
          System.out.println(student);
        };

        //printing the data
        studentList.forEach(c2);
        System.out.println("***************************************");

    }


    /**
     * q3. write code to print all student's name using consumer interface and lambda expression
     */
    public static void printName(){

        //fetching all students
        List<Student> studentList = StudentDataBase.getAllStudents();

        //creating Consumer object of student
        Consumer<Student> c3 = (student) -> {
            System.out.println(student.getName());
        };

        //printing the data
        studentList.forEach(c3);
        System.out.println("***************************************");

    }

    /**
     * q4. write code to print all student's name and activities using consumer interface and lambda expression
     */
    public static void printNameAndActivities(){

        //fetching all students
        List<Student> studentList = StudentDataBase.getAllStudents();

        //creating Consumer object of student
        Consumer<Student> c4 = (student) -> {
            System.out.print(student.getName() + " : ");
            System.out.println(student.getActivities());
        };

        //printing the data
        studentList.forEach(c4);
        System.out.println("***************************************");

    }

    /**
     * q5. write code to print all student's name & activities
     * who has gradeLevel >= 3 && gpa >= 3.9
     * using consumer interface and lambda expression
     */
    public static void printNameAndActivitiesWithCondition(){

        //fetching all students
        List<Student> studentList = StudentDataBase.getAllStudents();

        //creating Consumer object of student
        Consumer<Student> c4 = (student) -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                System.out.print(student.getName() + " : ");
                System.out.println(student.getActivities());
            }
        };

        //printing the data
        studentList.forEach(c4);
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
