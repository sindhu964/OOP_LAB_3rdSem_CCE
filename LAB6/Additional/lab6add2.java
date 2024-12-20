class Bike{
    int speedlimit=50;
    void run()
    {
        System.out.println(speedlimit);
    }
}

class Splender extends Bike{
    int speedlimit = 80;
    void run()
    {
        System.out.println(speedlimit);
    }
}

class Vehicle {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
        obj = new Splender();
        obj.run();
    }
}