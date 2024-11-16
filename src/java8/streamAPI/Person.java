package java8.streamAPI;

import java.util.LinkedList;
import java.util.List;

public record Person(String name, int age) {

    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Adarsh", 22));

        people.add(new Person("tony", 44));
        people.add(new Person("steve", 52));
        people.add(new Person("bruce", 32));
        people.add(new Person("ag", 29));

        people.stream().filter(person -> person.age > 30).forEach(person -> System.out.println( person.name));

    }
}

