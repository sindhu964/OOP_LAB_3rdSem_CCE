class Game {
    void type()
    {
        System.out.println("Indoor games");
        System.out.println("Outdoor games");
    }
}

class cricket extends Game{
    void type()
    {
        System.out.println("Cricket is an outdoor game");
    }
}

class chess extends Game{
    void type()
    {
        System.out.println("Chess is an indoor game");
    }
}

class GameMain{
    public static void main(String[] args) {
        Game obj;
        obj = new cricket();
        obj.type();
        obj = new chess();
        obj.type();
    }
}