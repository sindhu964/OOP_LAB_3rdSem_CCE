import java.util.Scanner;
class search_array {
    public static void main(String[] args) {
        int count=0,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        System.out.println("enter search value");
        key = sc.nextInt();
        for(int i:a)
        {
            if(i == key)
            {
                count++;
            }
        }
        System.out.println("Number of occurances:"+count);
    }
}