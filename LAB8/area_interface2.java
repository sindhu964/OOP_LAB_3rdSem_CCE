package LAB_8;
import java.util.Scanner;
interface area_i2 {
    float area();
}

class square implements area_i2{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side");
        int side = sc.nextInt();
        return side*side;

    }
}

class triangle implements area_i2{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        return (float) (0.5*base*height);

    }
}

public class area_interface2{
    public static void main(String[] args) {
        square obj1 = new square();
        System.out.println("The area of the square:"+obj1.area());
        
        triangle obj2 = new triangle();
        System.out.println("The area of the triangle:"+obj2.area());
    }
}