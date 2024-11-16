package java8.streamAPI;
import java.util.List;
import static java.util.Arrays.asList;


public class FindOddNumMultiplyByTwo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      List<Integer> num = asList(1,2,3,4,5,6,7,8,9,10);
         num.stream().filter(i -> i % 2 != 0).map(i -> i*2).forEach(i -> System.out.println(i));
    }
}
