package methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

    //create Function
    static Function<String, String> functionByLambda = (s) -> s.toUpperCase();

    //className :: methodName
    static Function<String, String> functionByMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(functionByLambda.apply("nilesh"));

        System.out.println(functionByMethodReference.apply("nilesh"));


    }
}
