public class Binary {
    public static void main(String[] args) {
        String str="";
         printBinary(str,3);
         //str="1";
         //printBinary(str,3);

    }
    public static void printBinary(String str,int k){
        if(k==0){
            System.out.println(str);
            return;
        }
        if(str.isEmpty()){
            printBinary(str+"0",k-1);
            printBinary(str+"1",k-1);
        }
            else {
            if (str.charAt(str.length() - 1) == '1') {
                printBinary(str + "0", k - 1);
            }
            if (str.charAt(str.length() - 1) == '0') {
                printBinary(str + "0", k - 1);
                printBinary(str + "1", k - 1);
            }
        }



    }
}
