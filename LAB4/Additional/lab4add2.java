import java.util.Scanner;
class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max;
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        min=max=a[0];
        //for(int i:a){
	for(int i=1;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
	}
	for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
    }
}