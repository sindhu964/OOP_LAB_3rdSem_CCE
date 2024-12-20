import java.util.Scanner;

public interface hardware_software {
    void input();
    int sales(int items,int cost);
}

class hardware implements hardware_software{
    String category;
    String manufacturer;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter category of the item:");
        category = sc.nextLine();
        System.out.println("Enter original manufacturer:");
        manufacturer = sc.nextLine();
    }

    public int sales(int items,int cost)
    {
        return items*cost;
    }
}

class software implements hardware_software{
    String type;
    String os;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter category of the item:");
        type = sc.nextLine();
        System.out.println("Enter original manufacturer:");
        os = sc.nextLine();
    }

    public int sales(int items,int cost)
    {
        return items*cost;
    }
}