package java8.streamAPI;

import java.util.List;

import static java.util.Arrays.asList;

public class SortNameStartsWithA {
    public static void main(String[] args) {
        List<String> names = asList("Aviator", "banana", "apple", "orange", "mango",
                "grape", "pear", "kiwi", "Adarsh", "Andy", "Arigato");
     names.stream().filter(name -> name.startsWith("A")).
             sorted().forEach(System.out::println);
    }


}
