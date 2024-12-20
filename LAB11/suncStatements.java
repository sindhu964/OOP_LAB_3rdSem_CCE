class Incrementersync extends Thread{
    private final syncStatements syncStatements;

    public Incrementersync(syncStatements syncStatements) {
        this.syncStatements = syncStatements;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            syncStatements.increment();
        }
    }
}

class syncStatements {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public void runExample() {
        Incrementersync thread1 = new Incrementersync(this);
        Incrementersync thread2 = new Incrementersync(this);

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
        syncStatements example = new syncStatements();
        example.runExample();
    }
}