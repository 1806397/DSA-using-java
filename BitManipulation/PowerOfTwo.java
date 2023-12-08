public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(check(17)?"divisible":"not divisible");
        System.out.println(check(16)?"divisible":"not divisible");
    }
    public static boolean check(int num){
        return num!=0 && (num &num-1)==0;
    }

}
