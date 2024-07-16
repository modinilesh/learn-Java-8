package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    /**
     *q.2 Write a code to multiply and divide two integers
     */
    public static void mulAndDivide(int a, int b){
        BiConsumer<Integer, Integer> mul = (i, j) -> System.out.println("Multiplication of numbers is : "+ i*j);
        mul.accept(a, b);

        BiConsumer<Integer, Integer> divide = (i, j) -> System.out.println("Division of numbers is : "+ i/j);
        divide.accept(a, b);
    }

    /**
     *q.3 print name and activities of Students
     */
    public static void printNameAndActivities(){
        //fetch all students data from database
        List<Student> students = StudentDataBase.getAllStudents();

        //create BiConsumer as per requirement
        BiConsumer<String, List<String>> nameAndActivities = (name, activities) ->{
            System.out.println(name + " : " + activities);
        };
        students.forEach(student -> nameAndActivities.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        /**
         * q.1 print two strings a, b using BiConsumer Functional Interface
         */
        BiConsumer<String, String> exOne = (a, b) -> System.out.println("a : " + a +", b : "+ b);
        exOne.accept("Nilesh", "Modi");


        //ans of q.2
        mulAndDivide(2, 3);

        //ans of q3
        printNameAndActivities();
    }
}
