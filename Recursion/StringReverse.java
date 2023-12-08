public class StringReverse {
    public static void main(String[] args) {
        String alpha="Hello I am Iron Man";
        reverse(alpha,alpha.length()-1);
    }
    public static String reverse(String alpha,int index){
        if(index==-1)
            return "";

        System.out.print(alpha.charAt(index));
        return reverse(alpha,index-1);

    }
}
