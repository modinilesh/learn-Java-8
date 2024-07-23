package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    //for easy access and reusability
    static Predicate<Integer> p1 = (a) -> a%2 == 0;
    static Predicate<Integer> p2 = (a) -> a%5 == 0;

    /**
     *Predicate and() method
     */
    public static void predicateAnd(){
        System.out.println("Predicate AND result : "+ p1.and(p2).test(25)); //predicate chaining
        System.out.println("Predicate AND result : "+ p1.and(p2).test(10));
    }

    /**
     *Predicate or() method
     */
    public static void predicateOr(){
        System.out.println("Predicate OR result : "+ p1.or(p2).test(25)); //predicate chaining
        System.out.println("Predicate OR result : "+ p1.or(p2).test(10));
    }

    /**
     *Predicate negate() method
     */
    public static void predicateNegate(){
        System.out.println("Predicate Negate result : "+ p1.negate().test(10));
    }

    public static void main(String[] args) {
        //defining predicate
        Predicate<Integer> p = (a) -> {
            return a%2 == 0;
        };
        System.out.println("Is number Even : "+ p.test(27));

        //eg 2
        predicateAnd();

        //eg 3
        predicateOr();

        //eg 4
        predicateNegate();

    }
}
