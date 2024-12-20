import java.util.Scanner;
class numbers{
	public static void main(String args[]){
		int n=10,i,num,positive=0,negative=0,zero=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:\n");
		for(i=0;i<n;i++){
			num = sc.nextInt();
			if(num>0)
				positive++;
			if(num<0)
				negative++;
			if(num==0)
				zero++;
		}
		System.out.println("The number of positive numbers are:" + positive);
		System.out.println("The number of negative numbers are:" + negative);
		System.out.println("The number of zeroes are:" + zero);
	}
}