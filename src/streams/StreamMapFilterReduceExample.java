package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapFilterReduceExample {

    //find total number of notebooks
    public static int sumOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce(0, (a, b) -> a+b);

        /*** Way-2
         * return StudentDataBase.getAllStudents().stream()
         *                 .map(Student::getNotebooks)
         *                 .reduce(0, Integer :: sum);
         */
    }

    //find total number of notebooks of students having gpa >= 3.9
    public static int sumOfNotebooksFilter(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .map(Student::getNotebooks)
                .reduce(0, (a, b) -> a+b);
    }

    public static void main(String[] args) {

        System.out.println("noOfNotebooks : " + sumOfNotebooks());
        System.out.println("noOfNotebooks of gpa>=3.9 students : " + sumOfNotebooksFilter());


    }
}
