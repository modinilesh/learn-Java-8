package numericstreams;

import java.util.stream.IntStream;

public class RangeExample {

    public static void main(String[] args) {

        //range(a, b) -> b is not included
        IntStream.range(1, 50)
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("The count of elements in range is : " + IntStream.range(1, 50).count());

        //rangeClosed(a, b) -> b is included
        IntStream.rangeClosed(1, 50)
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();
        System.out.println("The count of elements in rangeClosed is : " + IntStream.rangeClosed(1, 50).count());

        //if we want to create double stream for a range then
        IntStream.rangeClosed(1, 50)
                .asDoubleStream()
                .forEach(i -> System.out.print(i + ", "));


    }
}
