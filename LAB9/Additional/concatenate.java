import java.util.Scanner;

class concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String concatString = "";
        System.out.println("Enter five strings separately:");
        for (int i = 1;  i<= 5; i++) {
            System.out.print("Enter string " + i + ": ");
            String inputString = sc.nextLine();
            concatString += inputString;

        }
        System.out.println("Concatenated String: " + concatString);   
    }
}