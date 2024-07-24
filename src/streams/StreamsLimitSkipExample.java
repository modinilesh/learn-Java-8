package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    //limit example
    public static Optional<Integer> limit(List<Integer> list){
        return list.stream()
                .limit(3)   //will consider only 1, 2, 3
                .reduce((a, b) -> a+b);
    }

    //skip example
    public static Optional<Integer> skip(List<Integer> list){
        return list.stream()
                .skip(3)   //will consider 4,5,6
                .reduce((a, b) -> a+b);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        if (limit(list).isPresent()) System.out.println("Limit result : "+ limit(list).get());
        else System.out.println("List is empty.");

        if (skip(list).isPresent()) System.out.println("Skip result : "+ skip(list).get());
        else System.out.println("List is empty.");

    }
}
