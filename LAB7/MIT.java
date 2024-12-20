import java.util.Scanner;

class Student_Detail{
    String name;
    int id;
    String college_name;
    Student_Detail(String n,int i,String cn)
    {
        name = n;
        id = i;
        college_name = cn;
    }
    void display_details()
    {
        System.out.println("Name:"+name);
        System.out.println("College name:"+college_name);
        System.out.println("ID:"+id);
    }
}

class studentMIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student_Detail[] obj = new Student_Detail[n];
        String college_name ="MIT";
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the student "+(i+1));
            String name = sc.nextLine();
            System.out.println("Enter the ID");
            int id = Integer.parseInt(sc.nextLine());
            obj[i] = new Student_Detail(name, id, college_name);
        }
        for(int i=0;i<n;i++)
        {
            obj[i].display_details();
        }
    }
}