package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Before java-8 or traditional approach
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 if both equal
                                         //1 if o1 > o2
                                         //-1 if o1 < o2
            }
        };
        System.out.println("The result of comparator is : " + comparator.compare(2, 3));

        /**
         * Using Lambda expression
         */
        //way1
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println("The result of comparatorLambda is : " + comparatorLambda.compare(2, 3));

        //way2
        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println("The result of comparatorLambda1 is : " + comparatorLambda1.compare(2, 3));
    }
}
