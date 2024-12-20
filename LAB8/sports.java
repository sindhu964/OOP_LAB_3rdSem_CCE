import java.util.Scanner;

interface sports {
    void getNumberOfGoals();
    void dispTeam();
}

class Hockey implements sports{
    String team;
    int goals;
    public void getNumberOfGoals()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name and number of goals:");
        team = sc.nextLine();
        goals = sc.nextInt();
    }
    public void dispTeam()
    {
        System.out.println("Team "+team+" with a score of "+goals+" goals");
    }
}

class Football implements sports{
    String team;
    int goals;
    public void getNumberOfGoals()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name and number of goals:");
        team = sc.nextLine();
        goals = sc.nextInt();
    }
    public void dispTeam()
    {
        System.out.println("Team "+team+" with a score of "+goals+" goals");
    }
}

public class sports_main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which sport would you like to analyse");
        String sport = sc.nextLine();
        System.out.println("Enter the number of the teams");
        int number = sc.nextInt();
        if(sport.equalsIgnoreCase("hockey")){
            int max=0,index=-1;
            Hockey obj[] = new Hockey[number];
            for(int i=0 ; i<number ; i++){
                obj[i] = new Hockey();
                obj[i].getNumberOfGoals();
                if(obj[i].goals > max)
                {
                    max = obj[i].goals;
                    index = i;
                }
            }
            System.out.println("The winning team is.....");
            obj[index].dispTeam();
        }

        else if(sport.equalsIgnoreCase("football")){
            int max=0,index=-1;
            Football[] obj = new Football[number];
            for(int i=0 ; i<number ; i++){
                obj[i] = new Football();
                obj[i].getNumberOfGoals();
                if(obj[i].goals > max)
                {
                    max = obj[i].goals;
                    index = i;
                }
            }
            System.out.println("The winning team is.....");
            obj[index].dispTeam();
        }
    }
}