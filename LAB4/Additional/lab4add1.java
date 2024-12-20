import java.util.Scanner;
class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime;
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        System.out.println("Prime numbers are:");
        for(int i:a){
            isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i!=1){
                System.out.print(i+"\t");
            }
        }
    }
}