public class MoveX {
    public static String AllX="";
    public static String withoutX="";
    public static void main(String[] args) {
        String alphabet="axcbhfxxfjksnl";
        check(alphabet,0);
        System.out.println(withoutX+AllX);
    }
    public static void check(String alphabet,int index){
        if(index==alphabet.length()-1)
            return;
        if(alphabet.charAt(index)=='x'){
            AllX+='x';
            check(alphabet,index+1);
        }else{
            withoutX+=alphabet.charAt(index);
            check(alphabet,index+1);
        }
    }
}
