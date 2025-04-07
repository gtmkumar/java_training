// OOPS concepts (Data Abstraction, Encapsulation, Inheritance, Polymorphism)
// Access Specifiers
// Basic Java constructs like loops and data types
// String handling

// Assignment: - 
// Write a class Person with private properties Name, Age and write the constructor to set these properties. Also write the setter and getter methods to set and get these properties. 
// Write class Teacher and Student which extends class Person. Add properties Roll no, course, department in student class along with the constructor and getter, setters. Add properties department, specialization in Teacher class along with constructor and getter, setters. The constructor should accept all the properties of the person as well as the current class i.e Student or Teacher and set the properties.
// Write a class with method talk which prints hello and then overload the talk method by taking in a name and printing “Hello” with that name.
// Write programs to accept any word and check whether the word is palindrome or not.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}