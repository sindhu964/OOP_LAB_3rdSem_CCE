import java.util.Scanner;

class IsNice<T> {
    private T name;
    private T age;

    public IsNice(T name, T age) {
        this.name = name;
        this.age = age;
    }

    public void checkPreferences() {
        // Check if the name is "Anushri" and age is 19
        if ("Sindhu".equals(name) && 19 == Integer.parseInt(age.toString())) {
            System.out.println("Oh, you're Sindhu and 19? Wow!!");
        } else {
            System.out.println("Nice to meet you, but no");
        }
    }
}

class wildCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        // Create an instance of IsNice with wildcard parameters
        IsNice<?> program = new IsNice<>(name, age);
        program.checkPreferences();
    }
}