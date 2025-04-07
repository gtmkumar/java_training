import Multithreading.NumberPrinter;
import Multithreading.Sender;
import Multithreading.ThreadedSend;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ram Jatan", 25);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");

        Teacher teacher = new Teacher("Rajeev Nayan", 40, "Engineering", "Java");
        System.out.println(teacher.getName() + " is " + teacher.getAge() + " years old and teaches "
                + teacher.GetDepartment() + " with specialization in " + teacher.GetSpecialization() + ".");

        Student student = new Student("Ravi Bhusan", 20, 12345, "Computer Science", "Engineering");
        System.out.println(student.getName() + " is " + student.getAge() + " years old, enrolled in "
                + student.getCourse() + " in the " + student.getDepartment() + " department with roll number "
                + student.getRollNo() + ".");

        Talker talker = new Talker();
        talker.talk();
        talker.talk("Hello, how are you?");

        // Multithreading example
        NumberPrinter t1 = new NumberPrinter(1);
        NumberPrinter t2 = new NumberPrinter(11);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        System.out.println("Main thread finished execution.");

        // ThreadedSend example

        Sender sender = new Sender();

        // Create threads with "Hi" and "Bye"
        ThreadedSend t3 = new ThreadedSend("Hi", sender);
        ThreadedSend t4 = new ThreadedSend("Bye", sender);

        try {
            // Start first thread
            t3.start();
            t1.join();

            // Then start second thread
            t4.start();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Runnable example self practice
        // Create two threads using Runnable interface With lempda expression

        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable thread: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Runnable thread interrupted: " + e.getMessage());
                }
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable thread: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Runnable thread interrupted: " + e.getMessage());
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }
}