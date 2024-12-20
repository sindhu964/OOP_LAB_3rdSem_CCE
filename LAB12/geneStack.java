import java.util.ArrayList;

class Student {
    String name;
    String grades;

    public Student(String name, String grades) {
        this.name = name;
        this.grades = grades;
    }

    public String toString() {
        return "Student name:" + name + "\tGrades:" + grades;
    }
}

class Employee {
    String name;
    Integer YoE;

    public Employee(String name, int YoE) {
        this.name = name;
        this.YoE = YoE;
    }

    public String toString() {
        return "Employee name:" + name + "\tYears of Experience:" + YoE;
    }
}

class Stack<T> {
    ArrayList<T> stack;
    int top;

    Stack() {
        stack = new ArrayList<>();
        top = -1;
    }

    void Push(T item) {
        stack.add(item);
        top++;
    }

    T Pop() {
    if (top == -1) {
        return null; 
    }
    T item = stack.remove(top);
    top--;
    return item;
}
}

public class geneStack {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();

        // Adding students to the stack
        studentStack.Push(new Student("John", "A"));
        studentStack.Push(new Student("Alice", "B"));
        studentStack.Push(new Student("Bob", "C"));

        // Pop and display students from the stack
        System.out.println("Students from the stack:");
        while (!studentStack.stack.isEmpty()) {
            Student poppedStudent = studentStack.Pop();
            System.out.println(poppedStudent.toString());
        }

        // Creating a stack for employees
        Stack<Employee> employeeStack = new Stack<>();

        // Adding employees to the stack
        employeeStack.Push(new Employee("Alex", 3));
        employeeStack.Push(new Employee("Eva", 5));
        employeeStack.Push(new Employee("Chris", 2));
         employeeStack.Push(new Employee("Jane", 3));

        // Pop and display employees from the stack
        System.out.println("\nEmployees from the stack:");
        while (!employeeStack.stack.isEmpty()) {
            Employee poppedEmployee = employeeStack.Pop();
            System.out.println(poppedEmployee.toString());
        }

    }
}