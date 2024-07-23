package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamMinMaxUsingReduce {

    //find max notebooks
    public static Optional<Integer> findMax(){
        /*
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce(0, (x, y) -> Math.max(x, y)); //here we are using 0 as initial value, so in case of empty list it will be returning 0!
                                                    //better to use Optional<Integer> to avoid that
        */
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce((x, y) -> Math.max(x, y));
    }

    //find max notebooks
    public static Optional<Integer> findMin(){
        /*
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce(0, (x, y) -> Math.min(x, y)); //here we are using 0 as initial value, so in case of empty list it will be returning 0!
                                                    //better to use Optional<Integer> to avoid that
        */
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce((x, y) -> Math.min(x, y));
    }

    public static void main(String[] args) {

        Optional<Integer> maxNotebooks = findMax();
        if(maxNotebooks.isPresent()){
            System.out.println("Maximum notebook count is : " + maxNotebooks.get());
        }else{
            System.out.println("Notebooks are not available to any student.");
        }

        Optional<Integer> minNotebooks = findMin();
        if(maxNotebooks.isPresent()){
            System.out.println("Minimum notebook count is : " + minNotebooks.get());
        }else{
            System.out.println("Notebooks are not available to any student.");
        }

    }
}
