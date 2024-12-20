import java.util.Scanner;
class sum_series 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int n = sc.nextInt();
        int sin =x,num=1,den=1;
        for(int i=3; i<=n; i+=2)
        {
            sin +=(num*x*(-x))/(den*i*(i-1));
        }

        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(1/i)*i;
        }
    }
    
}