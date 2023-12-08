public class keypadCombo {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        printCombo("23",0,"");

    }
    public static void printCombo(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar=str.charAt(index);
        String mapping=keypad[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str,index+1,combination+mapping.charAt(i));
        }
    }
}
