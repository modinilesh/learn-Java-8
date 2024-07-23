package functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    //create BiUnaryOperator
    static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

    //create Comparator for minBy and maxBy
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {

        System.out.println("Multiplication of two numbers is : " + binaryOperator.apply(3, 4));

        //minBy method
        System.out.println("Result of minBy is : " + BinaryOperator.minBy(comparator).apply(3, 4));

        //maxBy method
        System.out.println("Result of maxBy is : " + BinaryOperator.maxBy(comparator).apply(3, 4));
    }
}
