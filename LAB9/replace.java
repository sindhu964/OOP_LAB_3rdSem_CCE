import java.util.Scanner;

class replace_string{
    public static void main(String args[]){
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = sc.nextLine();
         int len = s.length();
        //System.out.println(len);
        char ch[] = s.toCharArray();
        System.out.println("Enter the replacing character:");
        char c = sc.next().charAt(0);
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(ch[i]==ch[j]){
                    //s.replace(ch[j],c);
                    ch[j] = c;
                }
            }
        }
        s = String.valueOf(ch);
        System.out.println(ch);
        System.out.println(s);
    }
}