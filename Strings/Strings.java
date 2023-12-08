import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Strings {
    public static void main(String[] args) {
//       concat
        String s1="TONY";
        String s2="STARK";
        String s3=s1+"@"+s2;
        String s4="a";
        String s5="Z";
        System.out.println(s3);
//        System.out.println(s1.concat(s2));
        System.out.println(s1.length()+" "+s3.length());
//        chatAt
//        for (int i = 0; i < s3.length(); i++) {
//            System.out.println(s3.charAt(i));
//        }
//        Compare
//        s1>s2=+ive
//        s1==s2=0
//        s1<s2=-ive
        System.out.println(s4.compareTo(s5));
//        equals
        System.out.println(s1.equals(s2));
//        Substring
        String sentence="My name is Tony";
        System.out.println(sentence.substring(11,sentence.length()));
    }

}