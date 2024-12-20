import java.util.Scanner;

class three_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = sc.nextLine();
        
        if (word.length() != 5) {
            System.out.println("Please enter a valid five-letter word.");
        } else {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (i != j && j != k && i != k) {
                            String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                            System.out.println(threeLetterWord);
                        }
                    }
                }
            }
        }
    }
}