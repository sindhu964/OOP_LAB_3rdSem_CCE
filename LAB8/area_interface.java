import java.util.Scanner;

interface area_i {
    float area();
}

class rectangle implements area_i{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        return length*breadth;

    }
}

class circle implements area_i{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        return (float) (3.14*radius*radius);

    }
}

public class area_interface{
    public static void main(String[] args) {
        circle obj1 = new circle();
        System.out.println("The area of the circle:"+obj1.area());
        
        rectangle obj2 = new rectangle();
        System.out.println("The area of the rectangle:"+obj2.area());
    }
}