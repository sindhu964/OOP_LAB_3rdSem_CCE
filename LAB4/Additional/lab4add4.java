import java.util.Scanner;
class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the number of elements in first array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }  
        System.out.println("Enter the number of elements in second array");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter elements");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        } 
        int c[]= new int[m+n];
        for(int i=0;i<m+n;i++){
            if(i<n){
                c[i] = a[i];
            }
            else{
                c[i] = b[i-n];
            }
        }
        for(int i=0; i<m+n-1; i++){
            for(int j=0;j<m+n-i-1;j++){
                if(c[j+1]<c[j]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.println("merged and sorted array:");
        for(int i=0;i<m+n;i++){
            System.out.print(c[i]+"\t");
        }
    }
}