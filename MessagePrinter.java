class Sender {
    synchronized public void sendMessage(String message) {
        System.out.println(Thread.currentThread().getName() + " says: " + message);

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ThreadedSend extends Thread {
    private String message;
    private Sender sender;

    ThreadedSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run() {
        sender.sendMessage(message);
    }
}

class MessagePrinter {
    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadedSend thread1 = new ThreadedSend("Hi", sender);
        thread1.setName("Thread 1");
        ThreadedSend thread2 = new ThreadedSend("Bye", sender);
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}