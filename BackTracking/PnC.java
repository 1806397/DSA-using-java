// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PnC {
    public static void printPnc(String str,String pnc,int index){
        if(str.length()==0){
            System.out.println(pnc);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar=str.charAt(i);
            String newString=str.subSequence(0,i)+str.substring(i+1);
            printPnc(newString,pnc+currChar,index+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPnc(str,"",0);

    }
}