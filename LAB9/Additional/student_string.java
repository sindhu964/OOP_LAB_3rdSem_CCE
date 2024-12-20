import java.util.Scanner;

class Student {
    int regNumber;
    String firstName;
    String lastName;
    String degree;

    public Student(int regNumber, String firstName, String lastName, String degree) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }
}


class search_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        // Sample data: 10 students as an array of Student objects
        students[0] = new Student(101, "John", "Doe", "Computer Science");
        students[1] = new Student(102, "Jane", "Smith", "Engineering");
        students[2] = new Student(103, "Bob", "Johnson", "Mathematics");
        students[3] = new Student(104, "Alice", "Brown", "Physics");
        students[4] = new Student(105, "Charlie", "Wilson", "History");
        students[5] = new Student(106, "David", "Lee", "Chemistry");
        students[6] = new Student(107, "Ella", "Anderson", "Biology");
        students[7] = new Student(108, "Frank", "Martinez", "Economics");
        students[8] = new Student(109, "Grace", "Davis", "Psychology");
        students[9] = new Student(110, "Henry", "Harris", "Sociology");
        System.out.print("Search by (first_name/last_name): ");
        String searchType = sc.nextLine().toLowerCase();
        System.out.print("Enter the name to search: ");
        String searchName = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Student student : students) {
            if ((searchType.equals("first_name") && student.firstName.toLowerCase().contains(searchName))
                    || (searchType.equals("last_name") && student.lastName.toLowerCase().contains(searchName))) {
                System.out.println("Found student:");
                System.out.println("Registration Number: " + student.regNumber);
                System.out.println("First Name: " + student.firstName);
                System.out.println("Last Name: " + student.lastName);
                System.out.println("Degree: " + student.degree);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with the provided name.");
        }
    }
}