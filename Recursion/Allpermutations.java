public class Allpermutations {
    public static int count;
    public static void main(String[] args) {
        String s="abc";
        printPermutations(s,"");
        System.out.printf("Total of "+count+" combination for String "+s);
    }
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            count++;
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
         char current=str.charAt(i);
         String newStr=str.substring(0,i)+str.substring(i+1);
         printPermutations(newStr,permutation+current);
        }
    }
}
