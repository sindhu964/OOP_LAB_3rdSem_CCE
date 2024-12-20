import java.util.Scanner;
class NumberHandling {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            Number = Integer.parseInt(sc.nextLine());
            System.out.println("The number is"+Number);
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}