//Functional Interface:

@FunctionalInterface
interface PersonFilter {
    boolean filter(Person p);

    // Default method
    default void print(Person p) {
        System.out.println("Filtered: " + p);
    }

    // Static method
    static void sayHello() {
        System.out.println("Hello from PersonFilter interface!");
    }
}
