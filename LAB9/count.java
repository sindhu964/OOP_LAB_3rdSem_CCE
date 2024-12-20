import java.util.Scanner;

class count{
    public static void main(String args[]){
        String s;
        int vowel = 0;
        int count = 0;
        int words = 0;
        int lines = 0;
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        s = sc.nextLine();
        //System.out.println(s);
        //char ch[] = s.toCharArray();
        //System.out.println(ch);
        s=s.trim();
        len = s.length();
        System.out.println(len);
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                vowel++;
            }
            if(s.charAt(i)==' '){
                 words++;
            }
            if(s.charAt(i)=='.'){
                lines++;
            }
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Vowels:" + vowel);
        System.out.println("Number of character:" + count);
        System.out.println("The number of words:" + (words+1));
        System.out.println("The number of lines:" + lines);
    }
}