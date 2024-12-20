import java.util.Scanner;

class student{
	int regno;
	String name;
	int age;

}

class UG extends student{
	int sem;
	float fees;

	void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registration number:");
		regno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
		System.out.println("Enter semester:");
		sem = sc.nextInt();
		System.out.println("Enter fees:");
		fees = sc.nextFloat();
	}

	void display(){
		System.out.println("Registration number: " + regno);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Semester: " + sem);
		System.out.println("Fees: " + fees);
	}
}

class PG extends student{
	int sem;
	float fees;

	void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registration number:");
		regno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
		System.out.println("Enter semester:");
		sem = sc.nextInt();
		System.out.println("Enter fees:");
		fees = sc.nextFloat();
	}

	void display(){
		System.out.println("Registration number: " + regno);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Semester: " + sem);
		System.out.println("Fees: " + fees);
	}
}

class Smain{
	public static void main(String args[]){
		String type;
		int ug_total = 0;
		int pg_total = 0;
		char choice;
		PG post[] = new PG[30];
		UG under[] = new UG[30];
		do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of course (UG/PG):");
		type = sc.nextLine();
		//if(type=="UG" || type=="ug"){
		if(type.equalsIgnoreCase("UG")){
			under[ug_total] = new UG();
			under[ug_total].getdata();
			ug_total++;
		}
		//if(type=="PG" || type=="pg"){
		if(type.equalsIgnoreCase("PG")){
			post[pg_total] = new PG();
			post[pg_total].getdata();
			pg_total++;
		}
		System.out.println("Enter y to continue and n to end");
		choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');

		System.out.println("The details of UG students are:");
		for(int i=0;i<ug_total;i++){
			under[i].display();
			System.out.println();
		} 
		System.out.println("The details of PG students are:");
		for(int i=0;i<pg_total;i++){
			post[i].display();
			System.out.println();
		}
		
		System.out.println("Total number of admissions are:" + (ug_total+pg_total));
		
	}
}