import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int rows = obj1.nextInt();
        int columns = obj1.nextInt();
        int numbers[][] = new int[rows][columns];
        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = obj1.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
