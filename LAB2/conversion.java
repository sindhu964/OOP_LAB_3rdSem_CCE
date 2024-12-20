import java.util.Scanner;
class conversion{
	public static void main(String args[]){
		int i,double_int,char_int;
		double d;
		char ch;
		byte int_byte,double_byte;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		i = sc.nextInt();
		System.out.print("Enter a double number:");
		d = sc.nextDouble();
		System.out.print("Enter a character:");
		ch = sc.next().charAt(0);
		int_byte = (byte)i;
		char_int = (int)ch;
		double_byte = (byte)d;
		double_int = (int)d;
		System.out.println("Int to Byte:" + int_byte);
		System.out.println("Char to Int:" + char_int);
		System.out.println("Double to Byte:" + double_byte);
		System.out.println("Double to Int:" + double_int);
	}
}