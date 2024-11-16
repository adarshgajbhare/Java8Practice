package java8.test;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Using lambda
        Consumer<String> lambdaPrinter = message -> MethodReferenceExample.printMessage(message);

        // Using method reference
        Consumer<String> methodRefPrinter = MethodReferenceExample::printMessage;

        lambdaPrinter.accept("Hello, Lambda!");
        methodRefPrinter.accept("Hello, Method Reference!");
    }
}