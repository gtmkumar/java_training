package Multithreading;

public class ThreadedSend extends Thread {
    private String message;
    private Sender sender;

    public ThreadedSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run() {
        synchronized (sender) {
            sender.send(message);
        }
    }
}
