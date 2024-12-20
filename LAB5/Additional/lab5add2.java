import java.util.Scanner;

class arrayops {
    int arr[] = new int[10];

    void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    void display()
    {
        System.out.println("Values:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    

    void largest() {
        int largest = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest value in the array: " + largest);
    }

    void average() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        double average = (double) sum / 10;
        System.out.println("Average of values in the array: " + average);
    }

    void ascending() {
        for (int i = 0; i < 9; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 10; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Array sorted in ascending order:");
        display();
    }

    public static void main(String[] args) {
        arrayops obj = new arrayops();
        obj.input();
        obj.display();
        obj.largest();
        obj.average();
        obj.ascending();
    }
}