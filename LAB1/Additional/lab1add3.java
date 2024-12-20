import java.util.Scanner;
class lab1add3{
	public static void main(String args[]){
		int num,i,mul;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		//temp = num;
		for(i=1;i<=10;i++){
			mul = num*i;
			System.out.println(num + "*" + i + "=" + mul);
		}
	}
}