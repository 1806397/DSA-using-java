// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int x){
        if(x==1||x==0){
            return 1;
        }

        return x*factorial(x-1);

    }
}