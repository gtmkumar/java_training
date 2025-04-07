//Using forEach loop, Optional, Default & Static Methods

import java.util.*;

public class OptionalAndForEachDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ram", 28),
                new Person("Ankit", 15),
                new Person("Raj", 21));

        // Static method call from functional interface
        PersonFilter.sayHello();

        // Use Optional to check and print
        for (Person p : people) {
            Optional<Person> opt = Optional.ofNullable(p);

            opt.ifPresent(person -> {
                if (person.getAge() >= 18) {
                    System.out.println("Adult (via Optional): " + person.getName());
                } else {
                    System.out.println("Minor (via Optional): " + person.getName());
                }
            });
        }
    }
}
