package streams;

import java.util.Arrays;
import java.util.Scanner;

public class StreamAnyAllNoneMatch {

    //anyMatch(Predicate<>) -> returns boolean value
    public static boolean anyMatchExample(String str){
        //convert str to char array
        char[] arr = str.toCharArray();
        // Convert char[] to Character[]
        Character[] characterArray = new Character[arr.length];

        for(int i=0; i<arr.length; i++){
            characterArray[i] = arr[i];
        }

        //check if i is present or not
        return Arrays.stream(characterArray)
                .anyMatch(c -> c == 'i');
    }


    public static void main(String[] args) {

        //problem : take any String input and find if character "i" is present in that or not
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("Is character 'i' present ? : " + anyMatchExample(input));

    }
}
