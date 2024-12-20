import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student() {
        marks = new int[3];
    }

    double calculatePercentage() {
        int totalMarks = marks[0] + marks[1] + marks[2];
        return (double) totalMarks / 3;
    }

    char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class studentNumExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter student's name: ");
        student.name = sc.nextLine();

        try {
            System.out.print("Enter roll number: ");
            student.rollNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Enter marks in 3 subjects: ");
            for(int i=0;i<3;i++){
                student.marks[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Marks: " + student.marks[0] + ", " + student.marks[1] + ", " + student.marks[2]);
            System.out.println("Percentage: " + student.calculatePercentage() + "%");
            System.out.println("Grade: " + student.calculateGrade());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values for roll number and marks.");
        }
    }
}