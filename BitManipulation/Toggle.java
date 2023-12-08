public class Toggle {
    public static void main(String[] args) {
        int num=107;
        int pos=2;
        int mask=1<<pos;
        int num1=num^mask;
        System.out.println(num1);
        System.out.println(num1^mask);
    }
}
