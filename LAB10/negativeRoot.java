import java.util.Scanner;

class NegativeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        System.out.print("Square root is:");
        try {
            if (number < 0) {
                throw new Exception("");
            }
        } catch (Exception e) {
            number = -number;
            System.out.print("i");
        }
        double root = Math.sqrt(number);
        System.out.println(root);
    }
}