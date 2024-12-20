import java.util.Scanner;

class menu{
    public static void main(String args[]){
        String str;
        char choice;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string:");
        str  = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("a. To check whether a string is palindrome or not");
        System.out.println("b. Write the string in an alphabetical order");
        System.out.println("c. Reverse the string");
        System.out.println("d. Concatenate the original string and the reversed string");
        do{
        System.out.println("Make a choice!!");
        choice = sc.next().charAt(0);
        switch(choice){
            case 'a': //to check palindrome
                // sb.reverse();
                String temp = sb.toString();
                 if(str.equals(temp)){
                    System.out.println("Palindrome!!");
                }
                else{
                    System.out.println("Not Palindrome!!");
                }
                break;

            case 'b':  //arrange in alphabetical order
                 char ch[] = str.toCharArray();
                 int len = str.length();

                 for(int i=0;i<len;i++){
                    for(int j=i+1;j<len;j++){
                        if(ch[i]>ch[j]){
                            char t = ch[i];
                             ch[i] = ch[j];
                            ch[j] = t;
                        }
                    }
                }
                System.out.println("String after arranging:");
                 System.out.println(ch);
                 break;

            case 'c':  //reverse a string;
                // sb.reverse();
                String rev = sb.toString();
                System.out.println("Reversed string:");
                System.out.println(rev);
                break;

            case 'd':  //Concatenate the original string and the reversed string
                // sb.reverse();
                String data = sb.toString();
                String concat = str.concat(data);
                System.out.println("concatenated String:" + concat);
                break;
            
        }
        System.out.println("Do u want to continue??(Y/N)");
        choice = sc.next().charAt(0);
        }while(choice=='y' || choice=='Y');
    }
}
