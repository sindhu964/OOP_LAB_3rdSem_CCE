class Number
{
    private double prv;
    Number(double a)
    {
        prv=a;
    }
    boolean isZero()
    {
        return(prv==0);
    }
    boolean isPositive()
    {
        return(prv>0);
    }
    boolean isNegative()
    {
        return(prv<0);
    }
    boolean isOdd()
    {
        return(prv%2!=0);
    }
    boolean isEven()
    {
        return(prv%2==0);
    }
    boolean isPrime()
    {
        for(int i=2;i<prv;i++)
        {
            if(prv%i==0)
            return false;
        }
        return true;
    }
    boolean isArmStrong()
    {
        int num=(int)prv,d,r=0;
  while(num!=0)
  {
   d=num%10;
   r=r+(int)Math.pow(d,3);
   num/=10;
  }
  if(r==prv)
   return true;
  else
   return false;
    }
}
class TestNum
{
    public static void main(String[] args) {
        Number ob=new Number(153);
        System.out.println("isZero "+ob.isZero());
        System.out.println("isPositive "+ob.isPositive());
        System.out.println("isNegative "+ob.isNegative());
        System.out.println("isOdd "+ob.isOdd());
        System.out.println("isEven "+ob.isEven());
        System.out.println("isPrime "+ob.isPrime());
        System.out.println("isArmstrong "+ob.isArmStrong());
    }
}



