class counting{
    static int count=0;
    counting()
    {
        count++;
    }
}

class counterObj {
    public static void main(String[] args) {
        counting obj1 = new counting();
        counting obj2 = new counting();
        counting obj3 = new counting();
        System.out.println("No. of objects created:"+counting.count);
    }
}