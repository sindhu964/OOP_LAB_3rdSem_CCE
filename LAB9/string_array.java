import java.util.*;


class arrange_array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings you would like");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your strings");
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}