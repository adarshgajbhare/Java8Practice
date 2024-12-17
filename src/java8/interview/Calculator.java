package java8.interview;

import java.util.Arrays;
import java.util.HashMap;

public class Calculator {

    public static HashMap<String, Double> caluclate(String[] nums){
        HashMap<String, Double> map = new HashMap<String, Double>();

        int[] numbers = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
        double average = Arrays.stream(numbers).average().orElseThrow();
        double min = Arrays.stream(numbers).min().orElseThrow();
        double max = Arrays.stream(numbers).max().orElseThrow();

        map.put("average", average);
        map.put("min", min);
        map.put("max", max);
        System.out.println(min);
        return map;
    }

    public static void main(String[] args) {
        String[] nums = {"88","676","72","77","66","52","88"};
        HashMap<String, Double> result = caluclate(nums);
        System.out.println( result);
         
    }
}
