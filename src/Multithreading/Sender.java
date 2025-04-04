package Multithreading;

public class Sender {
    public synchronized void send(String message) {
        System.out.print("[ " + message);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Send interrupted: " + e.getMessage());
        }
        System.out.println(" ]");
    }
}
