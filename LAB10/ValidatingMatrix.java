import java.util.Scanner;

class MatrixNotValidException extends Exception{
    MatrixNotValidException(String message){
        super(message);
    }
}

class validateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        try {
            if(rows!=cols){
                throw new MatrixNotValidException("Not a square matrix");
            }
            for(int x[]:matrix){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
}