package java8.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator extends StringComparator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<String> fruits = Arrays.asList("Fruits", "banana", "apple",
                "kiwi", "watermelon");
        list.add(140);
        list.add(533);
        list.add(233);
        list.add(754);
        list.add(21);

      // fruits.sort(new StringComparator());
       //list.sort(new IntergerComparator());

      fruits.sort((a ,b) -> a.length() - b.length());
        list.sort((a ,b) -> b - a);

        System.out.println(fruits);
        System.out.println(list);
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

class IntergerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}