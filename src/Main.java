import java8.lamda.LambdaExpressions;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Hello world!");
        LambdaExpressions lambda = () -> {
           return  "Hello from lambda expression";
        };
        out.println(lambda.greetings());

    }
}