package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    //create supplier
    static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    //create supplier
    static Supplier<List<Student>> studenListSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        System.out.println("Student is : " + studentSupplier.get());

        //fetch all students from student database
        System.out.println("All Students are : " + studenListSupplier.get());

    }
}
