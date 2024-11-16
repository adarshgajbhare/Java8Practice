package java8.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StatisticsCalculator {

public static Map<String,Double> calculateMinMaxAvg(String[] numbers){
    Map<String,Double> result = new HashMap<String,Double>();
    int[] num = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
    
//    int[] num = new int[numbers.length];
//    for(int i=0; i<numbers.length; i++){
//        num[i] = Integer.parseInt(n   umbers[i]);
//    }

    int min = Arrays.stream(num).min().getAsInt();
    int max = Arrays.stream(num).max().getAsInt();
    Double average = Arrays.stream(num).average().getAsDouble();

    result.put("Min", (double) min);
    result.put("Max", (double) max);
    result.put("Average", average);

    return result;

}
    public static void main(String[] args) {
        String[] numbers = {"69", "54", "99", "8", "32"};
        System.out.println( calculateMinMaxAvg(numbers));
    }
}