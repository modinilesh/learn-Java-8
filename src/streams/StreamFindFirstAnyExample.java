package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstAnyExample {

    //findFirst() -> returns Optional<>
    public static Optional<Integer> findFirstExample(List<Integer> list){

        //returns first even number
        //1
        //2 ......as 2 is even it will get terminated here or short circuited here
        return list.stream()
                .filter(integer -> integer%2 == 0)
                .findFirst();
    }

    //findAny() -> returns Optional<>
    public static Optional<Integer> findAnyExample(List<Integer> list){

        //it will also return 2 ....difference can be observed when we run on parallel
        return list.stream()
                .filter(integer -> integer%2 == 0)
                .findAny();
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,5,2,6,7,8);

        if(findFirstExample(list).isPresent()){
            System.out.println("First even number is : " + findFirstExample(list).get());
        }else{
            System.out.println("List is empty");
        }

        if(findAnyExample(list).isPresent()){
            System.out.println("First even number (findAnyExample) is : " + findAnyExample(list).get());
        }else{
            System.out.println("List is empty");
        }

    }
}
