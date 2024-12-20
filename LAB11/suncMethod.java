class Incrementer extends Thread{
    private final syncMethod syncMethod;

    public Incrementer(syncMethod syncMethod) {
        this.syncMethod = syncMethod;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            syncMethod.increment();
        }
    }
}

class syncMethod {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    public void runExample() {
        Incrementer thread1 = new Incrementer(this);
        Incrementer thread2 = new Incrementer(this);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        syncMethod example = new syncMethod();
        example.runExample();
    }
}