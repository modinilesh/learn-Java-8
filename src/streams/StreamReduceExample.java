package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    //find product of elements in list
    public static int getProduct(List<Integer> list){
        return list.stream()
                .reduce(1, (a, b) -> a * b);  //here 1 is the starting value so a=1, b=1
    }

    //find product of elements in list
    public static Optional<Integer> getProductWithoutInitialValue(List<Integer> list){
        return list.stream()
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Product is : " + getProduct(numbers));
        System.out.println("Product is : " + getProductWithoutInitialValue(numbers).get());

    }
}
