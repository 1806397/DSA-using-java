public class subSequence {
    public static int value;
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,"");
        System.out.println(value-1);
    }
    public static void subsequence(String str,int index,String newString){
        if(index==str.length()){
            value++;
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(index);
        //to be the part
        subsequence(str,index+1,newString+currChar);
        //not to be part
        subsequence(str,index+1,newString);
    }
}
