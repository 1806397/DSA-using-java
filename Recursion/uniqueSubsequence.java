import java.util.HashSet;

public class uniqueSubsequence {
    public static void main(String[] args) {
        String str="abc";
        HashSet<String> set=new HashSet<>();
        subsequence(str,0,"",set);
    }
    public static void subsequence(String str,int index,String newString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString))
                return;
            else{
                System.out.println(newString);
                set.add(newString);
            }

            return;
        }

        char currChar=str.charAt(index);
        //to be the part
        subsequence(str,index+1,newString+currChar,set);
        //not to be part
        subsequence(str,index+1,newString,set);
    }
}
