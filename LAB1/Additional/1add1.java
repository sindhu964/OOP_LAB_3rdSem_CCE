import java.util.Scanner;
class lab1add1{
	public static void main(String args[]){
		int num,i,rev,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		num = sc.nextInt();
		rev = num;
		while(num>0){
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(rev==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome Number");
	}
}