import java.util.Scanner;

class Students {
    String name;
    int marks[];

    Students(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
    }
}

class MarkOutOfBoundsException extends Exception {
    MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class MarkOutOfBoundsHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] studentMarks = new int[numSubjects];

        System.out.println("Enter marks for each subject:");

        try {
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                studentMarks[i] = sc.nextInt();
                if (studentMarks[i] < 0 || studentMarks[i] > 100) {
                    throw new MarkOutOfBoundsException("Marks should be between 0 and 100");
                }
            }
            Students student = new Students(studentName, studentMarks);
            System.out.println("Students details: " + student.name);
            System.out.print("Marks: ");
            for (int mark : student.marks) {
                System.out.print(mark + " ");
            }
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}