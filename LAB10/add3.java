import java.util.Scanner;

class EvenNumberException extends Exception{
    EvenNumberException(String message){
        super(message);
    }
}

class EvenNumberHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            int input = sc.nextInt();
            if(input%2==0){
                throw new EvenNumberException("You had to enter an odd number");
            }
        }catch(EvenNumberException e){
            System.out.println(e.getMessage());
        }
    }
}