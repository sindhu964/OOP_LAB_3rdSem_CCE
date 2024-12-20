import java.util.Scanner;
class Ternary
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Largest of the three is:"+(((a>b)&&(a>c))?a:((b>a)&&(b>		c))?b:c));
		System.out.println("Smallest of the three is:"+(((a<b)&&(a<c))?a:((b<a)&&(b<		c))?b:c));
	}
}