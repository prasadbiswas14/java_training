class PrintSharedResource {
    synchronized public void printSharedResorce(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    PrintSharedResource p;

    public Thread2(PrintSharedResource p) {
        this.p = p;
    }

    public void run() {
        p.printSharedResorce(6, 10);
    }
}

class Thread1 extends Thread {
    PrintSharedResource p;

    public Thread1(PrintSharedResource p) {
        this.p = p;
    }

    public void run() {
        p.printSharedResorce(1, 5);
    }
}

class ThreadSynchronizedPrinter {
    public static void main(String[] args) {
        PrintSharedResource p = new PrintSharedResource();
        Thread1 thread1 = new Thread1(p);
        Thread2 thread2 = new Thread2(p);

        thread1.start();
        thread2.start();
    }
}