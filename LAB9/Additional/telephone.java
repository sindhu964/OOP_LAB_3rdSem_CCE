import java.util.Scanner;

//stop calling stop calling i dont wanna talk anymore 
class telephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number as (555) 555-5555");
        String phoneNumber = sc.nextLine();
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
        String areaCode = phoneNumber.substring(0, 3);
        String sevenDigit = phoneNumber.substring(3);
        System.out.println("Area Code:"+areaCode);
        System.out.println("Seven digit phone number:"+sevenDigit);
    }
}