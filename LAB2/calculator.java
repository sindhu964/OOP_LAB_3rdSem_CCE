import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		float num1,num2;
		char operator;
		char choice;
		Scanner sc = new Scanner(System.in);
	do{
		System.out.print("Enter number 1:");
		num1 = sc.nextFloat();
		System.out.print("Enter operator:");
		operator = sc.next().charAt(0);
		System.out.print("Enter number 2:");
		num2 = sc.nextFloat();
		switch(operator){
			case '+' :
				float sum  = num1+num2;
				System.out.print(num1 );
				System.out.print(operator );
				System.out.print(num2 );
				System.out.println("=" + sum);
				break;
			case '-' :
				float diff = num1 - num2;
				System.out.print(num1 );
				System.out.print(operator );
				
System.out.print(num2 );
				System.out.println("=" + diff);
				break;
			case '*' :
				float mul = num1*num2;
				System.out.print(num1 );
				System.out.print(operator );
				System.out.print(num2);
				System.out.println("=" + mul);
				break;
			case '/' :
				float div = num1/num2;
				System.out.print(num1 );
				System.out.print(operator );
				System.out.print(num2 );
				System.out.println("=" + div);
				break;
		}
		System.out.println("Do you want to continue?(y/n)");
		choice = sc.next().charAt(0);
	}while(choice=='Y' || choice=='y');
	}
}