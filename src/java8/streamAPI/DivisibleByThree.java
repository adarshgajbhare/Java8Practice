package java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class DivisibleByThree {
    public static void main(String[] args) {
        List<Integer> list  =
                asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                        13, 14, 15, 16, 17, 18, 19);

        List<Integer> res  =   list.stream().filter(i -> i % 3 ==0).collect(Collectors.toList());
        System.out.println(res);


    }
}

