class squaring {
    static int square(int n)
    {
        System.out.println("Integer");
        return n*n;
    }

    static double square(double n)
    {
        System.out.println("Floating");
        return n*n;
    }

    public static void main(String[] args) {
        System.out.println(square(3));
        System.out.println(square(0.2));
        
    }
}