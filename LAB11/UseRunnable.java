import java.util.Scanner;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread: ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Class Thread: ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class UseRunnable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Thread using Runnable Interface");
            System.out.println("2. Create Thread by Inheriting Thread Class");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Thread runnableThread = new Thread(new MyRunnable());
                    runnableThread.start();
                    break;
                case 2:
                    MyThread myThread = new MyThread();
                    myThread.start();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}