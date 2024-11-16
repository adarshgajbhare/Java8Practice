package java8.lamda;
import java8.lamda.LambdaExpressions;
import static java.lang.System.*;

public class MainPoint {
    public static void main(String[] args) {
       //Answer 1
        LambdaExpressions lambda = () -> {
            return  "Hello from lambda expression";
        };
        out.println(lambda.greetings());

        //Answer2
 SquareOfANumber square = (a) -> a*a;
        out.println("Square of given number is "+square.calculate(8));



        //Q3
        CheckEvenOdd evenOdd = (a) -> {
            if(a % 2 == 0) {
                return "Even";
            } else
                return "Odd";
        };
        out.println("The number is "+ evenOdd.isEven(10));

   out.println("The number is "+ evenOdd.isEven(3));

   Concatenator concatenator = (a,b) -> a+b;

        out.println(concatenator.concat("Adarsh"," dean"));

  StringLengthComparator strLen = (a,b) -> {
      if(a.length() > b.length()){
          return a;
      }else{
          return b;
      }
  };
        out.println(strLen.compare("something","Gajbhare"));

        out.println(strLen.compare("something big","Gajbhare"));
    }



}