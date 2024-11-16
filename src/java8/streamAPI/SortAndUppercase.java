package java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SortAndUppercase {
    public static void main(String[] args) {

        List<String> words = asList("banana", "apple", "orange", "mango",
                "grape", "pear", "kiwi");

              List<String> result =  words.stream().sorted().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
