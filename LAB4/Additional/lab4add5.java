import java.util.Scanner;
class trace_norm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int trace=0,normsum=0;
        double norm;
        for(int i=0;i<n;i++){
            trace += a[i][i];
            normsum += a[i][i]*a[i][i];
        }
        norm = Math.sqrt(normsum);
        System.out.println("Trace:"+trace);
        System.out.println("Norm:"+norm);
    }
}