package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    //create UnaryOperator
    static UnaryOperator<String> unaryOperator = (str) -> str.concat("default");


    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("nilesh"));
    }
}
