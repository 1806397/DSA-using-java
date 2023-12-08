import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int size = obj1.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = obj1.nextInt();
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);


    }
}