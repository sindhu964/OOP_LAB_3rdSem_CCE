import java.util.Scanner;

class FloatingNumberException extends Exception {
    FloatingNumberException(String message) {
        super(message);
    }
}

class Input_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float input;
        System.out.println("Enter integers\nand -1 to exit");
        while (true) {
            input = sc.nextFloat();
            if (input == -1)
                break;
            int mantissa = (int) input;
            try {
                if (input - mantissa > 0) {
                    throw new FloatingNumberException("Invalid input");
                }
            } catch (FloatingNumberException e) {
                System.out.println(e.getMessage());
                break;
            }
            sum += mantissa;
        }
        System.out.println("Sum:"+sum);
    }
}