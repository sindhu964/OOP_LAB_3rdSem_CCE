import java.util.Scanner;

class negativeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        try{
                System.out.println("Enter the elments");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }
        }catch(NegativeArraySizeException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}