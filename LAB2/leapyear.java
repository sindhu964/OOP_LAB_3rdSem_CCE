import java.util.Scanner;
class leapyear{
	public static void main(String args[]){
		int year;
		boolean k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		year = sc.nextInt();
		k = ((year%4)!=0)?false:((year%100)!=0)?true:((year%400)!=0)?false:true;
		if(k==true)
			System.out.println("It is a Leap year!");
		else
			System.out.println("It is not a Leap year!");
	}
}