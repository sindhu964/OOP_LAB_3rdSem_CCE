import java.util.Scanner;
class lab1add2{
	public static void main(String args[]){
		int num,i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		for(i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println("Factorial of the number =" + fact);
	}

}