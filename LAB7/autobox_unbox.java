class autobox_unbox{
    public static void main(String[] args) {

        //Integer
        int i=10;
        Integer iOb = i;
        i = iOb +10;
        System.out.println(iOb);
        System.out.println(i);

        //Float
        float f=10;
        Float fOb = f;
        f = fOb +10;
        System.out.println(fOb);
        System.out.println(f);

        //Double
        double d=10;
        Double dOb = d;
        d = dOb +10;
        System.out.println(dOb);
        System.out.println(d);

        //Character
        char c='a';
        Character cOb = c;
        c = cOb;
        System.out.println(cOb);
        System.out.println(c);

    }
}