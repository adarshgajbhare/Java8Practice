package java8.optionalClass;

import java8.methodReference.constructorRef.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainOptional {

    public static void main(String[] args) {
        String str = "fjkfhjahjkdfhjk";
        int a =66;
        int b = 99;
        Optional<String> strOptional = Optional.ofNullable(str);

        System.out.println(strOptional.orElse("empty String"));

        List  list = new ArrayList();
    list.add(22);
    list.add("afjf");
    list.add(47238.6467);
    list.add(new Student());
        System.out.println(list);

    }

}
