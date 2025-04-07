// Lambda expressions
// Method references
// Functional interfaces
// Stream API
// Default methods
// Collectors class
// ForEach() method
// Optional class
// Static methods in interface
// Base64 Encode Decode

// Assignment - 
// Write a program to use Stream API along with lambda expressions and functional interfaces.
// Write the above program with For each loop using optional classes, static and default methods.

//Main Program with Stream API + Lambda + Collectors:
import java.util.*;
import java.util.stream.*;
import java.util.Base64;

public class FunctionalJavaDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Amit", 25),
                new Person("Ankit", 19),
                new Person("Ram", 30),
                new Person("Mukesh", 17));

        // Use functional interface with lambda
        PersonFilter adultFilter = p -> p.getAge() >= 18;

        // Static method from interface
        PersonFilter.sayHello();

        // Stream API with lambda and method reference
        List<Person> adults = people.stream()
                .filter(adultFilter::filter)
                .collect(Collectors.toList());

        System.out.println("\n--- Adults ---");
        adults.forEach(adultFilter::print);

        // Encode and Decode a name using Base64
        String name = "FunctionalJava";
        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("\nBase64 Encoded: " + encoded);

        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Base64 Decoded: " + decoded);
    }
}
