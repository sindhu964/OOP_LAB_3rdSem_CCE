import java.util.Scanner;

class menu1{
    public static void main(String args[]){
        char choice;
        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        str2 = sc.nextLine();
        System.out.println(str1);
        System.out.println("a. To compare two strings");
        System.out.println("b. To convert the uppercase character to lower and vice-versa");
        System.out.println("c. To display whether an entered string is a substring of the other or not");
        System.out.println("c. To display whether an entered string is a substring of the other or not");
        do{
            System.out.println("Make a choice:");
            choice = sc.next().charAt(0);
            switch(choice){
                case 'a': //a. To compare two strings
                        if(str1.compareTo(str2)<0){
                            System.out.println(str1 + "is lesser");
                        }
                        else if(str1.compareTo(str2)>0){
                            System.out.println(str1 + "is greater");
                        }
                        else{
                            System.out.println("Both strings are equal");
                        }
                        break;

                case 'b':  //b. To convert the uppercase character to lower and vice-versa
                        System.out.println("String 1 in upper case:" + str1.toUpperCase());
                        System.out.println("String 1 in lower case:" + str1.toLowerCase());
                        System.out.println("String 2 in upper case:" + str2.toUpperCase());
                        System.out.println("String 2 in lower case:" + str2.toLowerCase());
                        break;

                case 'c':  //c. To display whether an entered string is a substring of the other or not
                        int i1 = str1.indexOf(str2);
                        int j1 = str2.indexOf(str1);
                        if(i1!=-1){
                            System.out.println(str2 + " is a substring of " + str1); 
                        }
                        if(j1!=-1){
                            System.out.println(str1 + " is a substring of " + str2); 
                        }
                        if(i1==-1 && j1==-1){
                            System.out.println("Both string are not substrings of each other!");
                        }
                        break;
                
                case 'd':  //If the entered string is a substring of the other, replace it with “Hello”
                         int i = str1.indexOf(str2);
                        int j = str2.indexOf(str1);
                        if(i!=-1){
                            //System.out.println(str2 + " is a substring of " + str1); 
                            str1 = str1.replace(str2,"Hello");
                            System.out.println(str1);
                        }
                        else if(j!=-1){
                            str2 = str2.replace(str1,"Hello");
                            System.out.println(str2);
                            //System.out.println(str1 + " is a substring of " + str2); 
                        }
            }
            System.out.println("do you want to continue?(Y/N):");
            choice = sc.next().charAt(0);
        }while(choice=='Y' || choice=='y');
    }
}