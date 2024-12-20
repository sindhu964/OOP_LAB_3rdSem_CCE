import java.util.Scanner;

class ArrayOverflowException extends Exception{
    ArrayOverflowException(String message){
        super(message);
    }
}

class ArrayOverflowHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        try{
            if(n>5){
                throw new ArrayOverflowException("ArrayOverflowException: For input size:"+n);
            }
            else{
                System.out.println("Enter the elments");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }
            }
        }catch(ArrayOverflowException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}