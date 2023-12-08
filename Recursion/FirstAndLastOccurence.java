import java.sql.Array;

public class FirstAndLastOccurence {
    public static int first=-1,last=-1;
    public static void main(String[] args) {
        String str="aajbcfhgshja";
        findOccurrence(str,str.length()-1,'j');
        System.out.println("first occurrence "+(first+1)+" last occurrence "+(last+1));
    }
    public static void findOccurrence(String str,int index,char element){
        if(index==0)
            return;
        char currChar=str.charAt(index);
        if(currChar==element){
            if(last==-1){
                last=index;
            }else{
                first=index;
            }

        }
        findOccurrence(str,index-1,element);
    }
}
