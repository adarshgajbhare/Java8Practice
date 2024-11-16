package java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = List.of(1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23);

        List<Integer> evenList = list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        System.out.println(evenList);

        System.out.println(list.stream().filter(i -> i <15).collect(Collectors.toList()));
    }
}
