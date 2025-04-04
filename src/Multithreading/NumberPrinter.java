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
