import java.util.Scanner;

abstract class area_a {
    abstract float area();
    Scanner sc = new Scanner(System.in);
}

class rectangle extends area_a{
    public float area()
    {
        System.out.println("Enter the length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        return length*breadth;
    }
}

class cicrcle extends area_a{
    public float area()
    {
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        return (float) (3.14*radius*radius);
    }
}

public class area_abstract{
    public static void main(String[] args) {
        circle obj1 = new circle();
        System.out.println("The area of the circle:"+obj1.area());
        
        rectangle obj2 = new rectangle();
        System.out.println("The area of the rectangle:"+obj2.area());
    }
}