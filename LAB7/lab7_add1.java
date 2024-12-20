/* 


class Example1 {
    // Static class
    static class X {
        static String str = "Inside Class X";
    }

    public static void main(String args[]) {
        X.str = "Inside Class Example1";

        System.out.println("String stored in str is-" + X.str);
    }
}
//Output: String stored in str is-Inside Class Example1



class Example2 {
    int num;

    // Static class
    static class X {
        static String str="Inside Class X";
        num=99;
    }

    public static void main(String args[]) {
        Example2.X obj = new Example2.X();

        System.out.println("Value of num=" + obj.str);
    }
}
//Output:Compile time error. Static inner class cannot access instance data of outer class.


class Example3 {
    static int num;
    static String mystr;
    static {
        num = 97;
        mystr = "Static keyword in Java";
    }

    public static void main(String args[]) {

        System.out.println("Value of num=" + num);

        System.out.println("Value of mystr=" + mystr);
    }
}
//Output: Value of num=97 Value of mystr=Static keyword in Java



class Example4 {
    static int num;
    static String mystr;
    // First Static block
    static {

        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }
    // Second static block
    static{
    
   System.out.println("Static Block 2");
    num = 98;
    mystr = "Block2";
    }

    public static void main(String args[])
 {
 
    System.out.println("Value of num="+num);
    
    System.out.println("Value of mystr="+mystr);
 }
}

//Output: Static Block 1 Static Block 2 Value of num=98 Value of mystr=Block2



class Example5 {
    static int i;
    static String s;

    public static void main(String args[]) // Its a Static Method
    {
        Example5 obj = new Example5();
        // Non Static variables accessed using object obj

        System.out.println("i:" + obj.i);

        System.out.println("s:" + obj.s);
    }
}

//Output: i:0 s:null



class Example6 {
    static int i;
    static String s;

    // Static method
    static void display() {
        // Its a Static method
        Example6 obj1 = new Example6();

        System.out.println("i:" + obj1.i);

        System.out.println("i:" + obj1.i);
    }

    void funcn() {
        // Static method called in non-static method
        display();
    }

    public static void main(String args[]) // Its a Static Method
    {
        // Static method called in another static method
        display();
    }
}

//Output: i:0 i:0


*/