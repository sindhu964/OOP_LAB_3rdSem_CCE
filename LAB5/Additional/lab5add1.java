import java.util.Scanner;

class results {
    int marks[][] = new int[3][4];
    int total[] = new int[3];
    void store()
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter roll no for Student");
            marks[i][0] = sc.nextInt();
            System.out.println("Enter marks for Student " + (i+1) + ":");
            for (int j = 1; j < 4; j++) {
                System.out.print("Enter marks for Subject " + (j) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
    }

    void total()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total[i] += marks[i][j];
            }
        }
    }

    void highestSubject()
    {
        for (int i = 1; i < 4; i++) {
            int max = marks[0][i];
            int roll= marks[0][0];
            for (int j = 0; j < 3; j++) {
                if(marks[j][i] > max)
                {
                    max = marks[j][i];
                    roll = marks [j][0];
                }
            }
            System.out.println("Highest in subject "+i+":"+max+" obtained by:"+roll);
        }
    }

    void highestTotal()
    {
        int max = total[0];
        int roll = marks[0][0];
        for(int i=1;i<3;i++)
        {
            if(total[i] > max)
            {
                max = total[i];
                roll = marks[i][0];
            }
        }
         System.out.println("Highest in total:"+max+" obtained by:"+roll);

    }

    public static void main(String[] args) {
        results obj = new results();
        obj.store();
        obj.total();
        obj.highestSubject();
        obj.highestTotal();
    }
}