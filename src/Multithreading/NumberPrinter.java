// Multithreading
// Exception handling
// Synchronization

// Assignment: - 
// Write a program which will create two threads and print the 10 numbers in sequence.
// Write a program with Sender class which has a send method that prints a message passed as a parameter. Then create a class ThreadedSend which extends Thread class and in constructor it accepts as message and Sender object. Now write a demo class which will create two threads using the ThreadedSend class. One thread will take the message as “Hi” and another thread will take message input as “Bye”. Now write a function which will print  “Hi” 1st and then “Bye”Write a program with Sender class which has a send method that prints a message passed as a parameter. Then create a class ThreadedSend which extends Thread class and in constructor it accepts as message and Sender object. Now write a demo class which will create two threads using the ThreadedSend class. One thread will take the message as “Hi” and another thread will take message input as “Bye”. Now write a function which will print  “Hi” 1st and then “Bye”

package Multithreading;

public class NumberPrinter extends Thread {
    private int start;

    public NumberPrinter(int start) {
        this.start = start;
    }

    public void run() {
        try {
            for (int i = start; i < start + 10; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
