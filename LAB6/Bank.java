import java.util.Scanner;

class Bank{
    int rateOfInterest;
    int getRateOfInterest()
    {
        rateOfInterest=0;
        return rateOfInterest;
    }

    float calculateInterest(int principal,int rateOfInterest)
    {
        float interest = (((float)rateOfInterest/100)*principal);
        return interest;
    }
}

class SBI extends Bank{
    int getRateOfInterest()
    {
        rateOfInterest=8;
        return rateOfInterest;
    }
}

class ICICI extends Bank{
    int getRateOfInterest()
    {
        rateOfInterest=7;
        return rateOfInterest;
    }
}

class AXIS extends Bank{
    int getRateOfInterest()
    {
        rateOfInterest=9;
        return rateOfInterest;
    }
}

class BankMain {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your bank");
        String bankName = sc.nextLine();
        System.out.println("Enter the principal");
        int principal = Integer.parseInt(sc.nextLine());
        Bank obj;
        if(bankName.equalsIgnoreCase("SBI"))
        {
            obj = new SBI();
            int rate = obj.getRateOfInterest();
            System.out.println("Rate of interest is: "+rate);
            System.out.println("Interest:"+ obj.calculateInterest(principal,rate));
        }
        else if(bankName.equalsIgnoreCase("ICICI"))
        {
            obj = new ICICI();
            int rate = obj.getRateOfInterest();
            System.out.println("Rate of interest is: "+rate);
            System.out.println("Interest:"+ obj.calculateInterest(principal,rate));
        }
        else if(bankName.equalsIgnoreCase("AXIS"))
        {
            obj = new AXIS();
            int rate = obj.getRateOfInterest();
            System.out.println("Rate of interest is: "+rate);
            System.out.println("Interest:"+ obj.calculateInterest(principal,rate));
        }
    }
}