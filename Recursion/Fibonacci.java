public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(print(6));
    }
    public static int print(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }

        return print(x-1)+print(x-2);
    }
}
