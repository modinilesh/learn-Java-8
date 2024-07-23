package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    //find product of elements in list
    public static int getProduct(List<Integer> list){
        return list.stream()
                .reduce(1, (a, b) -> a * b);  //here 1 is the starting value so a=1, b=1
    }

    //find product of elements in list
    public static Optional<Integer> getProductWithoutInitialValue(List<Integer> list){
        return list.stream()
                .reduce((a, b) -> a * b);
    }

    //find student with Highest gpa
    public static Optional<Student> getStudentWithHighestGpa(){
        /*return StudentDataBase.getAllStudents().stream()
                .reduce((student1, student2) -> {
                    if(student1.getGpa() > student2.getGpa()) return student1;
                    else return student2;
                });*/

        //using ternary operator
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Product is : " + getProduct(numbers));
        System.out.println("Product is : " + getProductWithoutInitialValue(numbers).get());

        System.out.println("Student with Highest GPA is : " + getStudentWithHighestGpa().get());

    }
}
