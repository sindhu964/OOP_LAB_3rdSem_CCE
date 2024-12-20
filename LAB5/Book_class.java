import java.util.Scanner;
class Book {
    String title;
    String author;
    int edition;

    Book(String t, String a, int e) {
        title = t;
        author = a;
        edition = e;
    }

    void display() {
        System.out.println("Title" + title);
        System.out.println("Author" + author);
        System.out.println("Edition:" + edition);
    }

    public static void main(String[] args) {
        Book obj[]=new Book[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter title,author,edition");
            String t = sc.nextLine();
            String a = sc.nextLine();
            int e = sc.nextInt();
            obj[i] = new Book(t, a, e);
        }
        System.out.println("Enter author to be displayed");
        String a = sc.nextLine();
        for(int i=0;i<5;i++)
        {
            if(obj[i].author.equals(a))
            {
                obj[i].display();
            }
        }
    }
}
