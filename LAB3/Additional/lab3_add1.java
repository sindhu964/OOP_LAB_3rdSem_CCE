class digit_combinations 
{
    public static void main(String[] args) 
    {
        System.out.println("when numbers are repeated:");
        char number[] = new char[5];
        for(char i='1';i<'5';i++)
        {
            number[0]=i;
            for(char j='1';j<'5';j++)
            {
                number[1]=j;
                for(char k='1';k<'5';k++)
                {
                    number[2]=k;
                    for(char l='1';l<'5';l++)
                    {
                        number[3]=l;
                        System.out.println(number);
                    }
                }
            }
        }
    

    System.out.println("when numbers are not repeated:");
        w:for(char i='1';i<'5';i++)
        {
            number[0]=number[1]=number[2]=number[3]=number[4]=' ';
            number[0]=i;
            x:for(char j='1';j<'5';j++)
            {
                if(inNumber(number, j))
                    continue x;
                number[1]=j;
                y:for(char k='1';k<'5';k++)
                {
                    if(inNumber(number, k))
                        continue y;
                    number[2]=k;
                    z:for(char l='1';l<'5';l++)
                    {
                        if(inNumber(number, l))
                            continue z;
                        number[3]=l;
                        System.out.println(number);
                    }
                }
            }
        }
    }

    static boolean inNumber(char num[], char a)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==a)
                return true;
        }
        return false;
    }
}