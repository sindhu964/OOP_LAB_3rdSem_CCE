import java.util.Scanner;
class Rectangle{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		int area = a*b;
		int circum = 2*(a+b);
		System.out.println("Area = " + area);
		System.out.println("Circumference = " + circum);
	}
}