import java.util.Scanner;

class student {
    int registration;
    String name;
    int age;
}

class UG extends student{
    int semester;
    int fees;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration no.:");
        registration = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter the age:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the semester:");
        semester = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the fees:");
        fees = Integer.parseInt(sc.nextLine());
    }
}

class PG extends student{
    int semester;
    int fees;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration no.:");
        registration = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter the age:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the semester:");
        semester = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the fees:");
        fees = Integer.parseInt(sc.nextLine());
    }
}

class studentMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PG post[] = new PG[100];
        UG under[] = new UG[100];
        char choice;
        int PG_total=0,UG_total=0;
        student obj;
        do
        {
            System.out.println("Enter type of student to be entered UG or PG");
            String type = sc.nextLine();
            if(type.equalsIgnoreCase("UG"))
            {
                under[UG_total] = new UG();
                under[UG_total].input();
                UG_total++;
            }
            else if(type.equalsIgnoreCase("PG"))
            {
                post[PG_total] = new PG();
                post[PG_total].input();
                PG_total++;
            }
            System.out.println("Enter y to continue and n to exit");
            choice = sc.next().charAt(0);
            sc.nextLine();
        }while(choice=='y');
        System.out.println("Number of students taking UG course: "+UG_total);
        System.out.println("Number of students taking PG course: "+PG_total);
        System.out.println("Total admissions: "+(UG_total+PG_total));
    }
}