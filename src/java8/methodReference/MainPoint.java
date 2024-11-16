package java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPoint {
    public static void main(String[] args) {

      // calling method using lambda function
        UpperCaseInterface up = (str) ->{

            return str.toUpperCase();
        };
        String result = up.upper("dfdfd");
        System.out.println(result);

        // calling method using reference method
        UpperCaseInterface upper = UpperMethod :: upperCase;
        System.out.println( upper.upper("Adarsh"));

        /* using stream API to filter and print strings with length greater than 6
         from the list*/
        List<String> list = Arrays.asList("java programming", "method", "reference", "example");
        list.stream().map(String::toUpperCase).filter(i -> i.length() >6).forEach(System.out::println);
    }
}
