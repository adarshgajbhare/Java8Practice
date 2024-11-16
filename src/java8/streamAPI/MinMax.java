package java8.streamAPI;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MinMax {
    public static void main(String[] args) {

        List<Integer> num = asList(44,77,29,9,6,72,90,23,61,66);
       int min = num.stream().min(Integer::compareTo).get();
        int  max = num.stream().max(Integer::compareTo).get();
        System.out.println("The minimum value is " + min +
                " and the maximum value is " + max);

      List<Integer> res =  num.stream().sorted().toList();
        System.out.println("the min is " + res.get(0) + "and the max is " + res.get(res.size() -1));
    }
}
