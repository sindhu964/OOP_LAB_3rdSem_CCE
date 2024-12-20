class pattern1
{
    public static void main(String args[])
    {
        int numbers[] = {1,2,3,4,5};
        for(int i:numbers)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
