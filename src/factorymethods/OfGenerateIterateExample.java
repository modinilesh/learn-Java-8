package factorymethods;

import java.util.Random;
import java.util.stream.Stream;

public class OfGenerateIterateExample {

    public static void main(String[] args) {

        //of() -> used to create a stream
        Stream<Object> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, "Nilesh");
        integerStream.forEach(System.out::println);

        //iterate() -> used to iterate stream infinitely
        Stream<Integer> iterateInteger = Stream.iterate(1, x -> x * 2);
//        iterateInteger.forEach(i -> System.out.println(i));

        //iterate() -> used to iterate stream infinitely
        Stream<Integer> iterateInteger1 = Stream.iterate(1, x -> x * 2)
                .limit(10);
        iterateInteger1.forEach(System.out::println);

        //generate( Supplier<>)
        Stream<Random> generate = Stream.generate(Random::new)
                .limit(5);
        generate.forEach(random -> System.out.println(random.nextInt()));


    }
}
