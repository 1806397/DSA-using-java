// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num=107;
        int num1=111;
        int pos=2;
        //bit number of specific position for given number
        System.out.println((num>>pos) &1);
        //Change value of a bit from zero to one for specific position
        num=(1<<pos)|num;
        System.out.println(num);
        //Change value of a bit from one to zero for specific position
        num=~(1<<pos)&num;
        System.out.println(num);
        num1=num1^(1<<pos);
        System.out.println(num1);
    }

}