package functionalInterfaces;

import java.util.function.Function;

public class FunctionInterfaceExample {

    //Function interface is used to handle multiple operations without creating functions for those
    static Function<String, String> function = (str) -> str.toUpperCase(); //it will be converting String to uppercase
    static Function<String, String> function1 = (str) -> str.concat("default"); //it will be concatenating "default"


    public static void main(String[] args) {

        //1. convert string to uppercase
        System.out.println("Result of 1 is : " + function.apply("nilesh"));

        //2. convert string to uppercase and then add default to the string
        System.out.println("Result of 2 is : " + function.andThen(function1).apply("nilesh"));

        //3. add default to the string then convert string to uppercase
        System.out.println("Result of 3 is : " + function.compose(function1).apply("nilesh"));

    }
}
